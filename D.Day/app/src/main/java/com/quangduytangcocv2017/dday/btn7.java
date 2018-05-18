package com.quangduytangcocv2017.dday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class btn7 extends AppCompatActivity {
    private TextView txtvNgay7,txtvNgayThu7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn7);
        addShow();
        addEven();
    }
    public void addShow() {
        txtvNgay7 = (TextView) findViewById(R.id.txtvNgay7);
        txtvNgayThu7 = (TextView) findViewById(R.id.txtvNgayThu7);
    }
    public void addEven() {
        txtvNgayThu7.setText("Ngày 02/10/2016");
        taoAnimation();
        txtvNgay7.setText("\n\nHôm nay là ngày thứ 2 của tháng, cũng là ngày đầu tiên mình dành gần như cả ngày cho tổ của " +
                "mình.. Cả ngày hôm ni. mình cứ nghĩ đến chuyện con Trang với thằng Vũ khang á.. Hình như thằng Vũ vẫn còn " +
                "tình cảm với con Trang... hôm nay hắn mở điện thoại lên vô tình mình thấy hắn vẫn còn giữ hình của con " +
                "Trang.. Mà hình như con Trang cũng còn tình cảm với thằng Vũ vì hôm trước thấy con Trang có hỏi vu vơ về chuyện" +
                " thằng Vũ.. Giờ mình hoang mang quá không biết sao đây... Giặc trong lẫn giặc ngoài.. Haizzz");
    }
    public void taoAnimation() {
        Animation zoom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        zoom.reset();
        txtvNgayThu7.startAnimation(zoom);
        txtvNgayThu7.startAnimation(zoom);
    }
}
