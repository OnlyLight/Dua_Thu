package com.example.admin.dday_version2.activity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.admin.dday_version2.R;

public class Main2Activity extends AppCompatActivity {

    private Button btnLoiMuonNoi, btnNhatKy, btnLoiCuoi;
    private MediaPlayer song;
    private TextView txtvLoiNhanActivity2Lan1, txtvLoiNhanActivity2Lan2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        addShow();
        addEven();
    }

    public void addShow() {
        btnLoiMuonNoi =(Button) findViewById(R.id.btnLoiMuonNoi);
        btnNhatKy = (Button) findViewById(R.id.btnNhatKy);
        txtvLoiNhanActivity2Lan1 = (TextView) findViewById(R.id.txtvLoiNhanActivity2Lan1);
        txtvLoiNhanActivity2Lan2 = (TextView) findViewById(R.id.txtvLoiNhanActivity2Lan2);
        btnLoiCuoi = (Button) findViewById(R.id.btnLoiCuoi);
    }

    public void addEven() {
        txtvLoiNhanActivity2Lan1.setText("Ổi biết lỗi của mình rồi..");
        txtvLoiNhanActivity2Lan2.setText("Tha lỗi cho Ổi đi");
        taoAnimation();
        // Nhạc nền
        if(song != null) {
            song.stop();
        }
        song = MediaPlayer.create(Main2Activity.this, R.raw.nhacnen);
        song.start();

        // tên
        btnLoiMuonNoi.setText("Lời Chưa Nói");
        btnNhatKy.setText("Nhật ký Thiên Đường");
        btnLoiCuoi.setText("Lời cuối Ổi muốn nói là.....");

        // Chuyển màn hình
        btnLoiMuonNoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song.stop();
                Intent intent = new Intent(Main2Activity.this, LoiMuonNoi.class);
                startActivity(intent);
            }
        });

        btnNhatKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, NhatKy.class);
                startActivity(intent);
            }
        });
        btnLoiCuoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, LoiCuoi.class);
                startActivity(intent);
            }
        });
    }

    public void taoAnimation() {
        Animation zoom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        zoom.reset();
        txtvLoiNhanActivity2Lan1.startAnimation(zoom);
        txtvLoiNhanActivity2Lan2.startAnimation(zoom);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        song.stop();
        LoiMuonNoi.songLoiChuaNoi.stop();
        Toast.makeText(this, "onBackPressed", Toast.LENGTH_SHORT).show();
    }
}
