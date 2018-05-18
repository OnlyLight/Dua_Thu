package com.quangduytangcocv2017.dday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class btn5 extends AppCompatActivity {
    private TextView txtvNgay5,txtvNgayThu5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn5);
        addShow();
        addEven();
    }
    public void addShow() {
        txtvNgay5 = (TextView) findViewById(R.id.txtvNgay5);
        txtvNgayThu5 = (TextView) findViewById(R.id.txtvNgayThu5);
    }
    public void addEven() {
        txtvNgayThu5.setText("Ngày 29/09/2016");
        taoAnimation();
        txtvNgay5.setText("\n\nQuyết định đi CLB CTXH coi có gì thú vị không.. tưởng có con Trang trên nớ nên mới có cái động lực để " +
                "lên chớ cũng nhát lắm.. Rứa mà lên rồi mà không thấy mô hết.. Thấy cũng vui mà răng minh thấy thiếu thiếu không" +
                " thể vui hết buổi được, không biết là vì sao nữa.. Mình phải giảm cường độ nhắn tin với con Trang.. phải hạn chế " +
                "tối đa.. ngày nào đi chơi mới nt rủ thôi .. còn lại thì ko nhắn.. Cở 5 ngày nt 1 lần là đủ rồi.. phải tìm cách " +
                "tiếp xúc bên ngoài nhiều hơn.. chớ lúc nhắn tin như vầy không thể hiện hết được ý nghĩ mình muốn nói.. Mình phải " +
                "lên kế hoạch nhanh chớ chậm trễ là bị cướp ngay.. mình thấy mấy anh ở CLB CTXH cũng được trai, bựa bựa vui vui," +
                " mình còn kết nữa nói chi con Trang.. Cũng có thể hôm ni hoặc ngày mai, cũng có thể là nay bây giờ con Trang đã dồng" +
                "ý làm bạn gái của ai đó rồi cũng không chừng.. " +
                "\n\n\n\nMÌNH CŨNG ĐÃ THẤY MẤY TÌNH HUỐNG NI Ở TRÊN PHIM RỒI MÀ CHƯA BAO GIỜ NGHĨ LÀ SẼ CÓ NGÀY MÌNH GẶP TRƯỜNG HỢP" +
                " TƯƠNG TỰ NHƯ VẬY.. TRƯỚC THẤY CÒN NÓI LÀ XÀM, NHÃM, KHÔNG THỰC TẾ.. H MẤY CẢNH ĐÓ MÌNH LẠI TRẢI QUA.. HAIZZZZ");
    }
    public void taoAnimation() {
        Animation zoom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        zoom.reset();
        txtvNgayThu5.startAnimation(zoom);
        txtvNgayThu5.startAnimation(zoom);
    }
}
