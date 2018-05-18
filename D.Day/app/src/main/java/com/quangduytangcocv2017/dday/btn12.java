package com.quangduytangcocv2017.dday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class btn12 extends AppCompatActivity {
    private TextView txtvNgay12,txtvNgayThu12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn12);
        addShow();
        addEven();
    }
    public void addShow() {
        txtvNgay12 = (TextView) findViewById(R.id.txtvNgay12);
        txtvNgayThu12 = (TextView) findViewById(R.id.txtvNgayThu12);
    }
    public void addEven() {
        txtvNgayThu12.setText("Ngày 03/01/2017");
        taoAnimation();
        txtvNgay12.setText("Ngày thứ 3 của năm mới, đã biết được thời gian mà Cóc quyết định đi rồi =((((..." +
                "Giờ thì mình chắc chắn con Cóc không có tình cảm với mình rôi.. Mình định chắc tầm qua tết mình sẽ nói cho " +
                "Cóc biết rồi chia tay sớm... =(((( Mình không dám nghĩ đến hôm Cóc chuẩn bị đi.. =(((" +
                "\n\nHôm đó mình sẽ nói thế này: " +
                "\n\n\n'+ Ổi biết chắc là chuyện này Cóc đã biết rồi.. Ổi thích Cóc đến h chắc cũng được hơn nửa năm rồi.. " +
                "Ổi biết ổi không thể so sánh với mấy vệ tinh quanh Cóc được.. hay là anh chàng Hàn đẫ tỏ tình với Cóc..." +
                "Ổi cũng biết mình tới đâu mà.. nếu so sánh bề ngoài thì ổi không băng ai hay nói về năng lực tài chính thời" +
                " điểm hiện tại thì Ổi cũng xin thua.. Ổi cũng không phải loại người hài hước... Sinh nhật Cóc ổi cũng không " +
                "đủ tài chính để tổ chức sinh nhật cho Cóc.. chỉ có cái đầu với mấy cái ý tưởng.. suy nghĩ ra được cách đó để" +
                " làm Cóc vui thôi... Nói nãy h lung tung quá phải ko ?? Những điều này Ổi cũng không định nói đâu.. vì biết chắc " +
                "Cóc đã quyết định đi Nhật nên không quan tâm đến chuyện này rồi, nhưng ổi cũng phải nói, nói để sau này không phải " +
                "hối hận... Dù sao cũng cảm ơn Cóc khoảng thời gian vừa qua, nhờ cóc Cóc mà ổi tìm được mục tiêu cho cuộc đời của mình " +
                "và có luôn định hướng rõ ràng về cuộc đời của mình để phấn đấu... Ổi THÍCH CÓC.. Ổi không dám nói ra từ 'yêu' vì " +
                "mình chưa có trãi qua khó khăn gì với nhau.. nên nói ra từ đó sẽ làm giảm đi sự thiêng liêng của nó... =((('" +
                "\n\n\n VIẾT TỚI ĐÂY BUỒN QUÁ ĐI.. RỚT LUÔN CẢ NƯỚC MẮT LUÔN RỒI.. trước h mình chưa bao h rơi nước mắt vì ai " +
                "ngoài gia đình mình.. Sao h lại thế này.. khó chịu quá =(((( ");
    }
    public void taoAnimation() {
        Animation zoom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        zoom.reset();
        txtvNgayThu12.startAnimation(zoom);
        txtvNgayThu12.startAnimation(zoom);
    }
}
