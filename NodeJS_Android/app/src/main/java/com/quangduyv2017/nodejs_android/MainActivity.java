package com.quangduyv2017.nodejs_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.URISyntaxException;
import java.util.ArrayList;

import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;

public class MainActivity extends AppCompatActivity {
    private ListView lvUses, lvChat;
    private EditText edtContent;
    private ImageButton btnAdd, btnSend;
    private ArrayList<String> list, listChat;
    private ArrayAdapter adapter, adapterChat;
    private Socket mSocket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addShow();

        try {
            mSocket = IO.socket("http://192.168.1.74:3000/");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        mSocket.connect();

        mSocket.on("server-send-result", onRetrieveResult); // trả về kết quả user đã có trong list chưa
        mSocket.on("server-send-user", onRetrieveUser); // trả về list đăng kí user
        mSocket.on("server-send-chat", onServerChat); // trả về nội dung chat

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtContent.getText().toString().trim().length() > 0) {
                    mSocket.emit("client-register-user", edtContent.getText().toString()); // gữi user để đăng kí
                }
            }
        });

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtContent.getText().toString().trim().length() > 0) {
                    mSocket.emit("client-send-chat", edtContent.getText().toString()); // gữi nội dung chat
                }
            }
        });

        list = new ArrayList<>();
        adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, list);
        lvUses.setAdapter(adapter);

        listChat = new ArrayList<>();
        adapterChat = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, listChat);
        lvChat.setAdapter(adapterChat);
    }

    public void addShow() {
        btnAdd = (ImageButton) findViewById(R.id.btnAdd);
        btnSend = (ImageButton) findViewById(R.id.btnSend);
        edtContent = (EditText) findViewById(R.id.edtContent);
        lvChat = (ListView) findViewById(R.id.lvChat);
        lvUses = (ListView) findViewById(R.id.lvUser);
    }

    private Emitter.Listener onServerChat = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    JSONObject object = (JSONObject) args[0];

                    try {
                        String noidungChat = object.getString("noidungchat");
                        listChat.add(noidungChat);
                        adapterChat.notifyDataSetChanged();
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    };

    private Emitter.Listener onRetrieveResult = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    JSONObject object = (JSONObject) args[0];

                    try {
                        boolean check = object.getBoolean("ketqua");
                        if(check) {
                            Toast.makeText(MainActivity.this, "User da ton tai !!", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MainActivity.this, "User su dung duoc !!", Toast.LENGTH_SHORT).show();
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    };

    private Emitter.Listener onRetrieveUser = new Emitter.Listener() {
        @Override
        public void call(final Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    JSONObject object = (JSONObject) args[0];
                    list.clear();

                    try {
                        JSONArray array = object.getJSONArray("danhsach");
                        for (int i = 0; i < array.length(); i++) {
                            String userName = array.getString(i);
                            list.add(userName);
                        }
                        adapter.notifyDataSetChanged();
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    };
}
