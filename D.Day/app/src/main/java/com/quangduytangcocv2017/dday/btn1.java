package com.quangduytangcocv2017.dday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class btn1 extends AppCompatActivity {
    private TextView txtvNgay1, txtvNgayThu1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn1);
        addShow();
        addEven();
    }
    public void addShow() {
        txtvNgay1 = (TextView) findViewById(R.id.txtvNgay1);
        txtvNgayThu1 = (TextView) findViewById(R.id.txtvNgayThu1);
    }
    public void addEven() {
        txtvNgayThu1.setText("Ngày 16/09/2016");
        taoAnimation();
        txtvNgay1.setText("\n\nTự nhiên 2 hôm ni thấy hình con Trang. Thấy hắn bữa ni có cái chi đó cuốn hút lắm.. " +
                "Giờ không biết là mình bị sao nữa... Trước đó đó mình từng muốn có 1 đứa gọi là bạn thân là nữ " +
                "mà sao giờ lại không muốn là bạn nữa.. là sao.... (cảm giác khó chịu vai~ nồi).. Giờ mình phải " +
                "làm sao đây mình không muốn phải gặp lại tình huống như năm cấp 2 và cả năm cấp 3 nữa, đi tỏ tình " +
                "với con Trân làm chi rồi tới h gặp nhau thì đi qua như 2 người xa lạ.. Facebook thì block.. Nhưng " +
                "nếu mà mình không làm thì sợ thằng khác nó làm trước rồi ngồi đó hối hận 'biết thế mình nói lun khỏi phải " +
                "h ngồi hối hận..' không biết h phải làm sao đây, tình cảm của mình mà mình con không hiểu nữa thì ai hiểu cho..." +
                "\n\n\n\n NÊN LÀM HAY KHÔNG ĐÂY ?????");
    }
    public void taoAnimation() {
        Animation zoom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        zoom.reset();
        txtvNgayThu1.startAnimation(zoom);
        txtvNgayThu1.startAnimation(zoom);
    }
}
