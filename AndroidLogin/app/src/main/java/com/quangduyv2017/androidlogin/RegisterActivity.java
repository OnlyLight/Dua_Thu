package com.quangduyv2017.androidlogin;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.net.URISyntaxException;

import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;

public class RegisterActivity extends AppCompatActivity {
    private EditText edtName, edtEmail, edtPassword;
    private Button btnRegister, btnLinkToLoginScreen;
    private Socket mSocket;
    {
        try {
            mSocket = IO.socket("http://192.168.0.100:3000");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Connect Server
        mSocket.connect();

        // Ánh xạ
        addShow();

        // Listen even.. Check info user
        mSocket.on("register", onRegister);

        // Control Button
        controlButton();
    }

    public void addShow() {
        edtName = (EditText) findViewById(R.id.edtName);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        btnRegister =(Button) findViewById(R.id.btnRegister);
        btnLinkToLoginScreen =(Button) findViewById(R.id.btnLinkToLoginScreen);
    }

    public void controlButton() {
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString().trim();
                String email = edtEmail.getText().toString().trim();
                String password = edtPassword.getText().toString().trim();
                if(!name.isEmpty() && !email.isEmpty() && !password.isEmpty()) {

                    // Send infomation to server
                    mSocket.emit("register", name, email, password);
                    ProgressDialog pDialog = new ProgressDialog(getApplicationContext());
                    pDialog.setCancelable(false);
                    pDialog.setMessage("Registering....");
                    pDialog.show();
                }
                else {
                    Toast.makeText(RegisterActivity.this, "Xin hãy nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnLinkToLoginScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Connect LoginActivity
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    // Xử lý thông tin từ server
    public Emitter.Listener onRegister = new Emitter.Listener() {
        @Override
        public void call(Object... args) {
            String data = args.toString();

            if(data == "true") {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
            else {
                Toast.makeText(RegisterActivity.this, "Lỗi.. Không có thông tin của User", Toast.LENGTH_SHORT).show();
            }
        }
    };
}
