package com.quangduyv2017.myflashlight_onlylight;

import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private boolean check = true;
    private ImageButton btnTurn;
    private boolean flash = true;
    private Camera camera;
    private Camera.Parameters parameters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addShow();
        addEven();
    }

    public void addShow() {
        btnTurn = (ImageButton) findViewById(R.id.btnTurn);
    }

    public void addEven() {
        check = getApplicationContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);

        if(check == false) {
            Toast.makeText(MainActivity.this, "Điện thoại của mày không hỗ trợ flash !!! =.=", Toast.LENGTH_SHORT).show();
        }

        getCamera();

        btnTurn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flash == true) {
                    flashOn();
                }
                else {
                    flashOff();
                }
            }
        });
    }

    public void getCamera() {
        if(camera == null && parameters == null) {
            camera = Camera.open();
            parameters = camera.getParameters();
        }
    }

    public void flashOn() {
        if(flash == true) {
            parameters = camera.getParameters();
            parameters.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
            camera.setParameters(parameters);
            camera.startPreview();
            flash = false;
            trangThai();
        }
    }

    public void flashOff() {
        if(flash == false) {
            parameters = camera.getParameters();
            parameters.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
            camera.setParameters(parameters);
            camera.stopPreview();
            flash = true;
            trangThai();
        }
    }

    public void trangThai() {
        if(flash == true) {
            btnTurn.setImageResource(R.drawable.btn_off);
        }
        else {
            btnTurn.setImageResource(R.drawable.btn_on);
        }
    }

//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        parameters = camera.getParameters();
//        parameters.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
//        camera.setParameters(parameters);
//        camera.stopPreview();
//    }
}