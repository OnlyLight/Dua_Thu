package com.example.admin.dday_version2.activity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.admin.dday_version2.R;

public class FlashActivity extends AppCompatActivity {

    private LinearLayout rlManHinh;
    private ImageView imvCupid;
    private MediaPlayer song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);

        addShow();
        addEven();
    }

    public void addShow() {
        rlManHinh = (LinearLayout) findViewById(R.id.activity_main);
        imvCupid = (ImageView) findViewById(R.id.imvCupid);
    }

    public void addEven() {
        // BackGround
        rlManHinh.setBackgroundResource(R.drawable.coc);

        // Music for Background

        song = MediaPlayer.create(getApplicationContext(), R.raw.nhacnen);
        song.start();

        imvCupid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                song.stop();
                startActivity(new Intent(FlashActivity.this, Main2Activity.class));
                finish();
            }
        });

        Animation animLayout = AnimationUtils.loadAnimation(FlashActivity.this, R.anim.alpha_layout);
        animLayout.reset();
        rlManHinh.clearAnimation();
        rlManHinh.setAnimation(animLayout);

        Animation animIcon = AnimationUtils.loadAnimation(FlashActivity.this, R.anim.translate_icon);
        animIcon.reset();
        imvCupid.clearAnimation();
        imvCupid.setAnimation(animIcon);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        song.stop();
        Toast.makeText(this, "onBackPressed", Toast.LENGTH_SHORT).show();
    }
}
