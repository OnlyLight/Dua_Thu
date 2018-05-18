package com.quangduytangcocv2017.dday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class btn9 extends AppCompatActivity {
    private TextView txtvNgay9, txtvNgayThu9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn9);
        addShow();
        addEven();
    }
    public void addShow() {
        txtvNgay9 = (TextView) findViewById(R.id.txtvNgay9);
        txtvNgayThu9 =(TextView) findViewById(R.id.txtvNgayThu9);
    }
    public void addEven() {
        txtvNgayThu9.setText("Ngày 11/11/2016");
        taoAnimation();
        txtvNgay9.setText("\n\nLại thêm 1 ngày buồn nữa.. Chiều hôm nay mình có nt và gọi cho Cóc mà nó không rep cũng " +
                "không gọi lại.. Khi điện thoại thông báo có tin nhấn.. lúc mở ra mới biết là tin nhắn của anh Thịnh nói về gặp mặt chuyên môn cứ nghĩ là của Cóc nên rất là vui.." +
                "Buổi sáng thì đã buồn còn mưa.. Tâm trạng càng buồn hơn, cả ngày hôm nay cứ nghĩ về Cóc khang thôi,... " +
                "Hôm bửa còn nghe con Cóc kể là có 4 thằng cưa nó rồi.. mà từ chối hết.. nghe nói có 1 thằng cao, đẹp trai, lai Hàn mà hắn " +
                "còn từ chối thì mình có cái quần chi mà con cóc phải thích mình chớ.. " +
                "\n\nTHỨC TỈNH ĐI.. MÊ MUỘI MÊ MUỘI QUÁ... Thôi thì mình cứ âm thầm bên cạnh hắn đi... KHÔNG !!! mình " +
                "không thể làm thế được.. mình sẽ nói cho Cóc biết tình cảm của mình... nêu không đồng ý thì mình cũng phải cố " +
                "quên đi Cóc.. cứ coi là kỉ niệm đi.. chớ mà tiếp tục làm bạn.. kiểu j thứ tình cảm này sẽ dến lúc trồi dậy " +
                "và cái cảnh khó xử đó sẽ lập lại.. Cóc là người khiến mình suy nghĩ rất là nhiều chỉ sau gia đình mình thôi.. =(((" +
                "\n\nMình lun dõi theo Cóc.. Nếu người nó chọn không phải là mình.. thì mình cũng hi vọng nó sống hạnh phúc.. nếu " +
                " thằng khứa nào đó làm Cóc buồn thì coi chừng.. =((((");
    }
    public void taoAnimation() {
        Animation zoom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        zoom.reset();
        txtvNgayThu9.startAnimation(zoom);
        txtvNgayThu9.startAnimation(zoom);
    }
}
