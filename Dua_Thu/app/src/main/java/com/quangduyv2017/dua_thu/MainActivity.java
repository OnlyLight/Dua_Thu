package com.quangduyv2017.dua_thu;

import android.app.Dialog;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private CheckBox cbTest1, cbTest2, cbTest3;
    private SeekBar sbTest1, sbTest2, sbTest3;
    private ImageView imgPlay;
    private TextView txtvDiem;
    private Button btnHelp;
    private Dialog dialog;
    private int diem = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        addShow();
        enableSeekbar();
        addEven();
    }

    public void addShow() {
        cbTest1 = (CheckBox) findViewById(R.id.cbTest1);
        cbTest2 = (CheckBox) findViewById(R.id.cbTest2);
        cbTest3 = (CheckBox) findViewById(R.id.cbTest3);
        sbTest1 = (SeekBar) findViewById(R.id.sbTest1);
        sbTest2 = (SeekBar) findViewById(R.id.sbTest2);
        sbTest3 = (SeekBar) findViewById(R.id.sbTest3);
        imgPlay = (ImageView) findViewById(R.id.imgPlay);
        txtvDiem = (TextView) findViewById(R.id.txtvDiem);
        btnHelp = (Button) findViewById(R.id.btnHelp);
    }

    public void addEven() {
        if(diem < 5) {
            imgPlay.setVisibility(View.INVISIBLE);
            Toast.makeText(this, "Bạn không đủ điểm để chơi tiếp", Toast.LENGTH_SHORT).show();
        }

        final CountDownTimer countDownTimer = new CountDownTimer(60000, 300) {
            @Override
            public void onTick(long millisUntilFinished) {
                int number = 4;
                Random random = new Random();
                int num1 = random.nextInt(number);
                int num2 = random.nextInt(number);
                int num3 = random.nextInt(number);

                // kiểm tra ai Win
                if(sbTest1.getProgress() >= sbTest1.getMax()) {
                    this.cancel();
                    imgPlay.setVisibility(View.VISIBLE);
                    Toast.makeText(MainActivity.this, "NHAN VAT 1 WIN !!", Toast.LENGTH_SHORT).show();
                    if (cbTest1.isChecked()) {
                        diem += 10;
                        Toast.makeText(MainActivity.this, "Bạn được cộng thêm 10đ !!", Toast.LENGTH_SHORT).show();
                    } else {
                        diem -= 5;
                        Toast.makeText(MainActivity.this, "Bạn bị trừ 5đ", Toast.LENGTH_SHORT).show();
                    }
                    txtvDiem.setText(diem + "");
                    enableCheck();
                }

                if(sbTest2.getProgress() >= sbTest2.getMax()) {
                    this.cancel();
                    imgPlay.setVisibility(View.VISIBLE);
                    Toast.makeText(MainActivity.this, "NHAN VAT 2 WIN !!", Toast.LENGTH_SHORT).show();
                    if (cbTest2.isChecked()) {
                        diem += 10;
                        Toast.makeText(MainActivity.this, "Bạn được cộng thêm 10đ !!", Toast.LENGTH_SHORT).show();
                    } else {
                        diem -= 5;
                        Toast.makeText(MainActivity.this, "Bạn bị trừ 5đ", Toast.LENGTH_SHORT).show();
                    }
                    txtvDiem.setText(diem + "");
                    enableCheck();
                }

                if(sbTest3.getProgress() >= sbTest3.getMax()) {
                    this.cancel();
                    imgPlay.setVisibility(View.VISIBLE);
                    Toast.makeText(MainActivity.this, "NHAN VAT 3 WIN !!", Toast.LENGTH_SHORT).show();
                    if (cbTest3.isChecked()) {
                        diem += 10;
                        Toast.makeText(MainActivity.this, "Bạn được cộng thêm 10đ !!", Toast.LENGTH_SHORT).show();
                    } else {
                        diem -= 5;
                        Toast.makeText(MainActivity.this, "Bạn bị trừ 5đ", Toast.LENGTH_SHORT).show();
                    }
                    txtvDiem.setText(diem + "");
                    enableCheck();
                }

                if ((sbTest1.getProgress() >= sbTest1.getMax() && sbTest2.getProgress() >= sbTest2.getMax() && sbTest3.getProgress() >= sbTest3.getMax()) ||
                        (sbTest1.getProgress() >= sbTest1.getMax() && sbTest2.getProgress() >= sbTest2.getMax()) ||
                        (sbTest1.getProgress() >= sbTest1.getMax() && sbTest3.getProgress() >= sbTest3.getMax()) ||
                        (sbTest2.getProgress() >= sbTest2.getMax() && sbTest3.getProgress() >= sbTest3.getMax())) {
                    this.cancel();
                    imgPlay.setVisibility(View.VISIBLE);
                    Toast.makeText(MainActivity.this, "Hòa !!!", Toast.LENGTH_SHORT).show();

                    enableCheck();
                }

                sbTest1.setProgress(sbTest1.getProgress() + num1);
                sbTest2.setProgress(sbTest2.getProgress() + num2);
                sbTest3.setProgress(sbTest3.getProgress() + num3);
            }

            @Override
            public void onFinish() {

            }
        };

        // Kiểm tra chỉ được chon 1 checkBox
        check();

        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMessage();
            }
        });

        // control nút play
        imgPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sbTest1.setProgress(0);
                sbTest2.setProgress(0);
                sbTest3.setProgress(0);

                if (cbTest1.isChecked() || cbTest2.isChecked() || cbTest3.isChecked()) {
                    imgPlay.setVisibility(View.INVISIBLE);
                    countDownTimer.start();
                    disableCheck();
                } else {
                    Toast.makeText(MainActivity.this, "Vui lòng đặt cược !!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void setMessage() {
        dialog = new Dialog(this);
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.custom);
        dialog.show();
    }

    public void check() {
        cbTest1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    cbTest2.setChecked(false);
                    cbTest3.setChecked(false);
                }
            }
        });

        cbTest2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    cbTest1.setChecked(false);
                    cbTest3.setChecked(false);
                }
            }
        });

        cbTest3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) {
                    cbTest1.setChecked(false);
                    cbTest2.setChecked(false);
                }
            }
        });
    }

    public void enableCheck() {
        cbTest1.setEnabled(true);
        cbTest2.setEnabled(true);
        cbTest3.setEnabled(true);
    }

    public void disableCheck() {
        cbTest1.setEnabled(false);
        cbTest2.setEnabled(false);
        cbTest3.setEnabled(false);
    }

    public void enableSeekbar() {
        sbTest1.setEnabled(false);
        sbTest2.setEnabled(false);
        sbTest3.setEnabled(false);
    }
}