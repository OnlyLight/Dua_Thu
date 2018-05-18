package com.quangduyv2017.mp3_custom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView imgZing, imgLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addShow();
        addAnimation();
    }

    private void addShow() {
        imgLogo = (ImageView) findViewById(R.id.imgLogo);
        imgZing = (ImageView) findViewById(R.id.imgZing);
    }

    @Override
    protected void onResume() {
        startActivity(new Intent(MainActivity.this, Main2Activity.class));
        super.onResume();
    }

    private void addAnimation() {
        final Animation zoom = AnimationUtils.loadAnimation(MainActivity.this, R.anim.mo_phong_to);
        Animation xoay = AnimationUtils.loadAnimation(MainActivity.this, R.anim.anim_xoay);
        imgZing.setAnimation(zoom);
        imgLogo.setAnimation(xoay);
    }
}
