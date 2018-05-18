package com.quangduyv2017.login_firebase;

import android.app.Dialog;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private TextView txtvLogin;
    private EditText edtUser, edtPass;
    private Button btnLogin, btnSignIn;
    private FirebaseAuth firebaseAuth;
    private String id, pass;
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firebaseAuth = firebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance().getReference();
        addShow();
        addButtonSginIn();
        addButtonLogin();
    }

//    public void database () {
//        mDatabase.child("Ho Ten").setValue("Trần Quang Duy");
//
//        List<SinhVien> lsv = null;
//        lsv.add(new SinhVien("Tran Quang Duy", "Su Pham"));
//        mDatabase.child("Sinh Vien").setValue(lsv);
//
//        mDatabase.child("Sinh Vien").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                txtvLogin.setText(dataSnapshot.getValue().toString());
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
//    }

    public void addShow() {
        txtvLogin = (TextView) findViewById(R.id.txtvLogin);
        edtUser = (EditText) findViewById(R.id.edtUser);
        edtPass = (EditText) findViewById(R.id.edtPass);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnSignIn = (Button) findViewById(R.id.btnSignIn);
    }

    public void addButtonSginIn() {
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(MainActivity.this, android.R.style.Theme_DeviceDefault_Dialog_NoActionBar);
                dialog.setContentView(R.layout.custom_dialog);
                dialog.setCancelable(true);
                TextView txtvSginInCustom = (TextView) dialog.findViewById(R.id.txtvSginInCustom);
                final EditText edtUserCustom = (EditText) dialog.findViewById(R.id.edtUserCustom);
                final EditText edtPassCustom = (EditText) dialog.findViewById(R.id.edtPassCustom);
                Button btnSignInCustom = (Button) dialog.findViewById(R.id.btnSignInCustom);
                Button btnOutCustom = (Button) dialog.findViewById(R.id.btnOutCustom);

                btnSignInCustom.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Check information
                        userSginIn(edtUserCustom.getText().toString().trim(), edtPassCustom.getText().toString().trim());
                        dialog.cancel();
                    }
                });
                // Thoát
                btnOutCustom.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });
               dialog.show();
            }
        });
    }

    public void userSginIn(String idCustom, String passCustom) {
        id = idCustom;
        pass = passCustom;
        if(TextUtils.isEmpty(id)) {
            Toast.makeText(MainActivity.this, "User is empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(pass)) {
            Toast.makeText(getApplicationContext(), "PassWord is empty", Toast.LENGTH_SHORT).show();
            return;
        }

        // Notification
        firebaseAuth.createUserWithEmailAndPassword(id, pass).addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(MainActivity.this, "Sgin In Success..", Toast.LENGTH_SHORT).show();
                }
                else {
                    Log.d("1", "debug here");
                    Toast.makeText(MainActivity.this, "Sgin In not complete", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void addButtonLogin() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userLogin();
            }
        });
    }

    public void userLogin() {
        String email = edtUser.getText().toString().trim();
        String password = edtPass.getText().toString().trim();
        if(TextUtils.isEmpty(email)) {
            Toast.makeText(MainActivity.this, "User is empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(password)) {
            Toast.makeText(getApplicationContext(), "PassWord is empty", Toast.LENGTH_SHORT).show();
            return;
        }

        firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(MainActivity.this, "Login Success..", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Login not complete", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
