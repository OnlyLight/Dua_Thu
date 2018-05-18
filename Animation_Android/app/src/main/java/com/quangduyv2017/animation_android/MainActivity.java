package com.quangduyv2017.animation_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imgAlpha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showAdd();
        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);

        imgAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animAlpha);
            }
        });
    }

    public void showAdd() {
        imgAlpha = (ImageView) findViewById(R.id.imgAlpha);
    }
}
