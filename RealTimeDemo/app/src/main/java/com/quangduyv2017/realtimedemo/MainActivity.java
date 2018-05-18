package com.quangduyv2017.realtimedemo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.icu.util.Calendar;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ImageView imgHinh;
    private Button btnClick;
    private EditText edtTenHinh;
    private ListView lvTen;
    private ArrayList<HinhAnh> arrHinhAnh;
    private HinhAnhAdapter adapter;
    private FirebaseStorage storage;
    private StorageReference storageRef;
    private StorageReference mountainsRef;
    private DatabaseReference mData;
    private final int REQUEST_CODE_IMAGE = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        storage = FirebaseStorage.getInstance();
        mData = FirebaseDatabase.getInstance().getReference();
//        storageRef = storage.getReference();
        storageRef = storage.getReferenceFromUrl("gs://realtimedemo-c3d54.appspot.com");

        addShow();
        controlButton();

        arrHinhAnh = new ArrayList<>();
        adapter = new HinhAnhAdapter(this, R.layout.dong_hinh_anh, arrHinhAnh);
        lvTen.setAdapter(adapter);
        load();
    }

    private void addShow() {
        imgHinh = (ImageView) findViewById(R.id.imgHinh);
        btnClick = (Button) findViewById(R.id.btnClick);
        edtTenHinh = (EditText) findViewById(R.id.edtTenHinh);
        lvTen =(ListView) findViewById(R.id.lvTen);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_CODE_IMAGE && resultCode == RESULT_OK && data != null) {
            Bitmap bitmap = (Bitmap) data.getExtras().get("data");
            imgHinh.setImageBitmap(bitmap);
        }
    }

    private void controlButton() {
        imgHinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, REQUEST_CODE_IMAGE);
            }
        });

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bitmap bitmap = imgHinh.getDrawingCache();

                if (imgHinh.getDrawable().equals(R.drawable.camera)){
                    Calendar calendar = Calendar.getInstance();
                    mountainsRef = storageRef.child("image" + calendar.getTimeInMillis() + ".png");

                    imgHinh.setDrawingCacheEnabled(true);
                    imgHinh.buildDrawingCache();
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
                    final byte[] data = baos.toByteArray();

                    UploadTask uploadTask = mountainsRef.putBytes(data);
                    uploadTask.addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception exception) {
                            // Handle unsuccessful uploads
                            Toast.makeText(MainActivity.this, "Error !!", Toast.LENGTH_SHORT).show();
                        }
                    }).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                            // taskSnapshot.getMetadata() contains file metadata such as size, content-type, and download URL.
                            Uri downloadUrl = taskSnapshot.getDownloadUrl();
                            Toast.makeText(MainActivity.this, "Success !!", Toast.LENGTH_SHORT).show();

                            if (edtTenHinh.getText().toString() != null || edtTenHinh.getText().toString() != "") {
                                HinhAnh hinhAnh = new HinhAnh(edtTenHinh.getText().toString().trim(), String.valueOf(downloadUrl));
                                mData.child("Hinh anh").push().setValue(hinhAnh, new DatabaseReference.CompletionListener() {
                                    @Override
                                    public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
                                        if (databaseError != null) {
                                            Toast.makeText(MainActivity.this, "Error !!", Toast.LENGTH_SHORT).show();
                                        } else {
                                            Toast.makeText(MainActivity.this, "Success !!", Toast.LENGTH_SHORT).show();
                                            edtTenHinh.setText("");
                                            imgHinh.setImageResource(R.drawable.camera);
                                        }
                                    }
                                });
                            }
                        }
                    });
                } else {
                    Toast.makeText(MainActivity.this, "Hay chup hinh !!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void load() {
        mData.child("Hinh anh").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                HinhAnh hinhAnh = dataSnapshot.getValue(HinhAnh.class);
                arrHinhAnh.add(new HinhAnh(hinhAnh.getTenHinh(), hinhAnh.getLinkHinh()));
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}