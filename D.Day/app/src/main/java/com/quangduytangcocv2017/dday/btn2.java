package com.quangduytangcocv2017.dday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class btn2 extends AppCompatActivity {
    private TextView txtvNgay2,txtvNgayThu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn2);
        addShow();
        addEven();
    }
    public void addShow() {
        txtvNgay2 = (TextView) findViewById(R.id.txtvNgay2);
        txtvNgayThu2 = (TextView) findViewById(R.id.txtvNgayThu2);
    }
    public void addEven() {
        txtvNgayThu2.setText("Ngày 08/10/2016");
        taoAnimation();
        txtvNgay2.setText("\n\nHôm nay, mình tự nhủ với chính mình là nếu ngưng ngủ nướng thì mình sẽ bắt đầu quá trình cưa Cóc.. " +
                "Dù biết là xác suất Cóc đồng ý là chưa đầy 1%.. Và cũng không biết mình có tình cảm với Cóc thiệt hay không nữa ???" +
                " Hay chỉ là do mình hay nói chuyện với Cóc nên thấy rứa thôi ??? Đâu đầu quá, mấy buổi tối ni răng mà trước " +
                "khi đi ngủ đều nghĩ đến Cóc hết.. hay là do nhắn tin với Cóc nhiều quá.. h thành ra bị ám ảnh rồi cũng không chừng" +
                " \n\n\n\nCẦN LẮM MỘT LỜI KHUYÊN !!!!!!!! ");
    }
    public void taoAnimation() {
        Animation zoom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        zoom.reset();
        txtvNgayThu2.startAnimation(zoom);
        txtvNgayThu2.startAnimation(zoom);
    }
}
