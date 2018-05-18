package com.example.admin.mylovelyplace.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.admin.mylovelyplace.R;
import com.example.admin.mylovelyplace.data.model.DBUtitls;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {

    @BindView(R.id.imgIcon)
    ImageView imgIcon;

    @BindView(R.id.linearLayout)
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        Animation animLayout = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha_background);

        Animation animIcon = AnimationUtils.loadAnimation(MainActivity.this, R.anim.transition_icon);

        imgIcon.setAnimation(animIcon);
        linearLayout.setAnimation(animLayout);

        animIcon.setAnimationListener(this);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, CategoriesActivity.class));
                finish();
            }
        }, 2000);
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
