package com.quangduyv2017.webservice_android;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private EditText edtTen, edtNamSinh, edtDiaChi;
    private String url = "";
    private Button btnThem, btnEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addShow();
        ReadJSONVolley(url);
        control();
    }

    public void addShow() {
        edtTen = (EditText) findViewById(R.id.edtTen);
        edtNamSinh = (EditText) findViewById(R.id.edtNamSinh);
        edtDiaChi = (EditText) findViewById(R.id.edtDiaChi);
        btnThem = (Button) findViewById(R.id.btnThem);
        btnEdit = (Button) findViewById(R.id.btnEdit);
    }

    public void control() {
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtTen.getText().toString().isEmpty() || edtNamSinh.getText().toString().isEmpty() || edtDiaChi.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Vui lòng điển đầy đủ", Toast.LENGTH_SHORT).show();
                } else {
                    themSinhVien(url);
                }
            }
        });

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    /*
    *               Cách đọc 1
    */
    private class ReadJSON extends AsyncTask<String, Void, String> {
        StringBuilder builder = new StringBuilder();

        @Override
        protected String doInBackground(String... strings) {
            try {
                URL url = new URL(strings[0]);
                InputStreamReader inputStreamReader = new InputStreamReader(url.openConnection().getInputStream());
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                String line = "";
                while ((line = bufferedReader.readLine()) != null) {
                    builder.append(line).append("\n");
                }

                bufferedReader.close();

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return builder.toString();
        }

        @Override
        protected void onPostExecute(String s) {
            try {
                JSONArray array = new JSONArray(s);
                for (int i = 0; i < array.length(); i++) {
                    JSONObject object = array.getJSONObject(i);
                    String hoTen = object.getString("HoTen");
                    String namSinh = object.getString("NamSinh");
                    String diaChi = object.getString("DiaChi");
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }

            super.onPostExecute(s);
        }
    }

    /*
    *                       Cách đọc 2
    */
    public void ReadJSONVolley(String url) {
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        final JsonArrayRequest arrayRequest = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject object = response.getJSONObject(i);
                        int id = object.getInt("Id");
                        String hoTen = object.getString("HoTen");
                        String namSinh = object.getString("NamSinh");
                        String diaChi = object.getString("DiaChi");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        },
            new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(MainActivity.this, "ERROR\n"+ error.toString() + "", Toast.LENGTH_SHORT).show();
                }
            });
        requestQueue.add(arrayRequest);
    }

    public void themSinhVien(String url) {
        RequestQueue requesQueue = Volley.newRequestQueue(this);
        StringRequest string = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if (response.equals("SUCCESSz")) {
                    Toast.makeText(MainActivity.this, "Them Thanh cong", Toast.LENGTH_SHORT).show();
                }
            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity.this, "ERROR", Toast.LENGTH_SHORT).show();
                    }
                }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("hotenSV", edtTen.getText().toString().trim());
                params.put("namsinhSV", edtNamSinh.getText().toString().trim());
                params.put("diachiSV", edtNamSinh.getText().toString().trim());

                return params;
            }
        };
    }
}
