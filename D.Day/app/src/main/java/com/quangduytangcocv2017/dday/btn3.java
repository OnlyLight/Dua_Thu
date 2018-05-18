package com.quangduytangcocv2017.dday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class btn3 extends AppCompatActivity {
    private TextView txtvNgay3,txtvNgayThu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn3);
        addShow();
        addEven();
    }
    public void addShow() {
        txtvNgay3 = (TextView) findViewById(R.id.txtvNgay3);
        txtvNgayThu3 = (TextView) findViewById(R.id.txtvNgayThu3);
    }
    public void addEven() {
        txtvNgayThu3.setText("Ngày 22/09/2016");
        taoAnimation();
        txtvNgay3.setText("\n\nHôm ni, có lẽ là ngày mình cảm thấy hạnh phúc nhất trước h.. chắc cũng không quên được ngày ni đâu" +
                " =))) :v :v... Hôm nay, mình rủ được Cóc đi coi văn nghệ đón tân sinh viên... chắc ông trời tạo điều kiện cho mình " +
                "rồi.. Mặc dù mới đầu thì không được suôn sẽ như mình nghĩ.. Nào là quên diện thoại, nào là hẹn dời xuống 7h" +
                ",... nhưng rồi cũng phải cảm ơn cái vụ quên điện thoại.. Nhờ nó mà lên trễ để rồi 2 đứa tìm được 1 chổ " +
                "mà mình cảm thấy là rất lý tưởng.. chổ ngồi chỉ có 2 đứa ở một góc khuất.. =)))) ^^ " +
                "\n\nĐây là lần đầu tiên mình được ngồi gần con Trang đến như vậy, mà chỉ có 2 đứa chớ ^^. Đã rứa rồi còn được ngồi từ 7h - 10h luôn.." +
                "HAPPY QUÁ ^^ những 3 tiếng đó nha =))) ^^.. Mà ngồi với hắn thấy hắn càng dễ thương hơn mới chết chớ.." +
                " Và cũng là lần đầu tiên được nhìn hắn gần như vậy.. Nhìn rõ được từng chi tiết của hắn luôn.. nào là cặp mắt to," +
                " khuôn mặt lúc nhìn ra hình tròn, lúc nhìn lại thấy V-line ảo vai~ nồi.. Bên cạnh mắt, gần sống mũi, có cái bớt" +
                " hay hột nốt ruồi chi đó =)))... Lúc hắn cười xinh phết.. dth quá đi =))) ^^ " +
                "\n\nLần đầu tiên, mình ngồi nói chuyện với 1 đứa con gái ở khoảng cách gần như vậy.. mà vẫn thấy thoái mái mới lạ (Trước h mình ngại ngồi gần hay tiếp " +
                "xúc với ai lắm =))) )... Thấy 3 tiếng đồng hồ đó, sao mà trôi nhanh quá vây. Mình cũng tự hỏi không biết sao mình" +
                "cảm thấy vui, hạnh phúc đến mức đấy.. Không biết con Trang nó thấy thế nào nữa !! Không biết trong khoảng thời gian " +
                "đó nó có cảm thấy thoải mái không ? có thấy vui không ? hay là thấy quá chán vì ngồi với 1 người không thú vị như " +
                "mình ? H mình Bâng khuâng quá.. " +
                "\n\nThôi chốt đi ngủ: Mình sẽ cố gắng làm cho con Trang thấy được mình THÍCH hắn đến " +
                "thế nào ^^ (Mà mình thấy hình như con Trang hắn vẫn còn tình cảm với thằng Vũ.. Mình thấy hắn cứ nhắc tới thằng Vũ)" +
                "Thằng Vũ bữa này abc sao đó.. Có phải bây h mình quá ích kỉ không.. không được phải nghĩ cho tâm trạng của Cóc..." +
                "Để thêm vài tháng nữa rồi hay tiến hành... " +
                "\n\n\n\nBỐI RỐI QUÁ !! CẦN NGƯỜI GỠ NÚT THẮT..." +
                "\n\n\n\nMÌNH ĐANG QUÁ ÍCH KĨ ???");
    }
    public void taoAnimation() {
        Animation zoom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        zoom.reset();
        txtvNgayThu3.startAnimation(zoom);
        txtvNgayThu3.startAnimation(zoom);
    }
}
