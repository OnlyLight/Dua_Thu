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

public class LoginActivity extends AppCompatActivity {

    private EditText edtEmail, edtPassword;
    private Button btnLogin, btnLinkToRegisterScreen;

    private Socket mSocket;
    {
        try {
            mSocket= IO.socket("http://192.168.0.100:3000");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mSocket.connect();
        addShow();

        // Check info user
        mSocket.on("login", onLogin);
        controlButton();
    }

    public void addShow() {
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLinkToRegisterScreen =(Button) findViewById(R.id.btnLinkToRegisterScreen);
    }

    public void controlButton() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Send info to Server
                String email = edtEmail.getText().toString().trim();
                String password = edtPassword.getText().toString().trim();
                if(!email.isEmpty() && !password.isEmpty()) {
                    mSocket.emit("login", email, password);
                    ProgressDialog pDialog = new ProgressDialog(LoginActivity.this);
                    pDialog.setCancelable(false);
                    pDialog.setMessage("Loading...");
                    pDialog.show();
                }
                else {
                    Toast.makeText(LoginActivity.this, "Xin vui lòng điền đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnLinkToRegisterScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }

    // Xử lý thông tin gữi từ Server
    public Emitter.Listener onLogin = new Emitter.Listener() {
        @Override
        public void call(Object... args) {
            String data = args[0].toString();

            if(data == "true") {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
            else {
                Toast.makeText(LoginActivity.this, "Không thể đăng nhập", Toast.LENGTH_SHORT).show();
            }
        }
    };
}