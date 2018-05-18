package com.quangduytangcocv2017.dday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class btn6 extends AppCompatActivity {
    private TextView txtvNgay6, txtvNgayThu6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn6);
        addShow();
        addEven();
    }
    public void addShow() {
        txtvNgay6 = (TextView) findViewById(R.id.txtvNgay6);
        txtvNgayThu6 = (TextView) findViewById(R.id.txtvNgayThu6);
    }
    public void addEven() {
        txtvNgayThu6.setText("Ngày 05/11/2016");
        taoAnimation();
        txtvNgay6.setText("\n\nHôm nay, Cóc lại khiến cho mình buồn 1 lần nữa.. Cóc vừa nt cho mình rồi lại khóa acc.. làm" +
                " cứ nghĩ là mình đã thể hiện cái gì đó hơi quá mà làm Cóc biết là mình thích Cóc.. nên block lun mình..." +
                " nhưng sau khi tìm hiểu.. thì mình biết được Cóc có chuyện j đó nên khóa acc... " +
                "chứ không phải là ghét mình nên block như mình vẫn nghĩ.. 1 ngày không nói chuyện với Cóc.. Mình cảm thấy" +
                " rất là buồn, nhớ... hi vọng Cóc đừng xếp mình vào hàng friendzone... và hôm nay cũng la lần đầu Cóc chịu nghe " +
                "điện thoại của mình.. =))))) Vừa buồn vừa vui.. Vui vì không phải Cóc block mình, buồn vì.. mà cũng không biết " +
                "vì sao mình lại buồn nữa... =((((");
    }
    public void taoAnimation() {
        Animation zoom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        zoom.reset();
        txtvNgayThu6.startAnimation(zoom);
        txtvNgayThu6.startAnimation(zoom);
    }
}
