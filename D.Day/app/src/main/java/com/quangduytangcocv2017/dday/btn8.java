package com.quangduytangcocv2017.dday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class btn8 extends AppCompatActivity {
    private TextView txtvNgay8, txtvNgayThu8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn8);
        addShow();
        addEven();
    }
    public void addShow() {
        txtvNgay8 = (TextView) findViewById(R.id.txtvNgay8);
        txtvNgayThu8 = (TextView) findViewById(R.id.txtvNgayThu8);
    }
    public void addEven() {
        txtvNgayThu8.setText("Ngày 06/10/2016");
        taoAnimation();
        txtvNgay8.setText("\n\nHôm nay là tròn 2 tuần trong việc chuẩn bị quà cho Cóc.. Nói chung là làm gần xong rồi " +
                "mà có chút lỗi lúc đầu, chưa fix được.. Nếu làm xong mình còn phải chuyển sang công đoạn trang trí.. nữa chớ.." +
                " mình phải lên hỏi mấy anh trên CLB để fix nhanh lỗi này mới được.. " +
                "\n\n\n\nMÌNH PHẢI LÀM CHO CON CÓC NHẬN ĐƯỢC MỘT MÓN QUÀ MÀ CHỈ DUY NHẤT, ĐỘC NHẤT " +
                "CHƯA CÓ AI ĐƯỢC TẶNG.. PHẢI LÀM RA MỘT MÓN QUÁ THẬT ĐẶC BIỆT <3<3 QUYẾT TÂM");
    }
    public void taoAnimation() {
        Animation zoom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        zoom.reset();
        txtvNgayThu8.startAnimation(zoom);
        txtvNgayThu8.startAnimation(zoom);
    }
}
