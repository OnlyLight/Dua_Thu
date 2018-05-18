package com.quangduytangcocv2017.dday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class btn13 extends AppCompatActivity {
    private TextView txtvNgay13,txtvNgayThu13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn13);
        addShow();
        addEven();
    }
    public void addShow() {
        txtvNgay13 = (TextView) findViewById(R.id.txtvNgay13);
        txtvNgayThu13 = (TextView) findViewById(R.id.txtvNgayThu13);
    }
    public void addEven() {
        txtvNgayThu13.setText("Ngày 03/02/2017");
        taoAnimation();
        txtvNgay13.setText("\n\nHôm nay là ngày mùng 7 tết, và cũng là lần thứ 3 mình quyết định nói cho con Cóc tình cảm của mình nhưng lại" +
                " không làm được.. trước đó vào ngày mùng 4 mình cũng định đi chơi Hội An về.. trên dường chở Cóc về nhà mình nói lun" +
                " mà lại không làm... nhục quá đi mà... Rồi cũng quyết định hôm nay đi chơi rồi nói luôn.. mà đến lúc chuẩn bị đi.." +
                " thì đủ thứ chuyện, nào là cái lịch mình lên danh sách hết rồi.. nhưng lại bị hủy vào lúc cuối... nào là đang cầm" +
                " sợi dây su còn mới không có làm cái j hết.. thì tự nhiên nó đứt.. chắc hôm nay nói ra là tạch... nên thêm 1 lần nữa mình lại hoãn" +
                " việc mình nói với Cóc lại... Haizzz =((((( ");
    }
    public void taoAnimation() {
        Animation zoom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        zoom.reset();
        txtvNgayThu13.startAnimation(zoom);
    }
}
