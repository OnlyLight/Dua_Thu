package com.quangduytangcocv2017.dday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class LoiCuoi extends AppCompatActivity {
    private TextView txtvLoiCuoi0, txtvLoiCuoi1, txtvLoiCuoi2, txtvLoiCuoi3, txtvLoiCuoi4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loi_cuoi);
        addShow();
        addEven();
    }
    public void addShow() {
        txtvLoiCuoi1 = (TextView) findViewById(R.id.txtvLoiCuoi1);
        txtvLoiCuoi2 = (TextView) findViewById(R.id.txtvLoiCuoi2);
        txtvLoiCuoi0 = (TextView) findViewById(R.id.txtvLoiCuoi0);
        txtvLoiCuoi3 = (TextView) findViewById(R.id.txtvLoiCuoi3);
        txtvLoiCuoi4 = (TextView) findViewById(R.id.txtvLoiCuoi4);
    }
    public void addEven() {
        txtvLoiCuoi0.setText("Lời cuối cùng Ổi muốn nói với Cóc là...");
        txtvLoiCuoi1.setText("\n\nỔi xin lỗi Cóc, vì đã chạm vào nổi đau, nổi ám ảnh của Cóc.. Ổi có thể hiểu được cảm giác" +
                "khi bị người mình tin tưởng, không tin tưởng mình.. Hoàn cảnh đó rất khó có thể tha thứ cho người đó, sụ tin tưởng" +
                "của mình dành cho họ cũng mất đi.. chỉ còn lại sự nghi ngờ... Nhưng Cóc hãy thử mở lòng mình ra, cho họ cơ hội sửa sai" +
                "cơ hội để họ bù đắp lại cho mình, Cóc sẽ thấy được một điều rất mới lạ và tuyệt vời... " +
                "\n\n\nTới đây chắc Cóc sẽ có suy nghĩ," +
                " 'nếu cho họ thêm cơ hội, thì sợ họ lại phản bội lòng tin của mình thêm lần nữa.. Không có điều gì chắc chắn là họ sẽ không " +
                "phạm lại sai lầm đó...' Ổi không yêu cầu Cóc tha lỗi cho Ổi ngay bây giờ.. Vì vậy, Cóc hãy đọc lại Ngày 21/12/2016, " +
                "đó là kế hoạch của Ổi, Ổi sẽ thực hiện những điều đó, những điều Ổi đặt ra đều có hình ảnh của Cóc trong đó.. Đó sẽ như là " +
                "một lời cam kết của Ổi với Cóc là sẽ không phạm thêm 1 lỗi nào nữa, khiến cho Cóc phải buồn.." +
                "\n\n\nHọc kì này Ổi đã giành được suất học bổng.. Đó cũng là nhờ có Cóc.. Ổi cố gắng cày để nhận được học bổng để khoe với Cóc.. " +
                "Vậy mà chưa kịp làm gì.. thì ra thế này rồi.. " +
                "\n\n Cóc còn nhờ Ổi từng nói là đang làm 1 cái app không.. đây là bảng cập nhật của nó.. Lúc đầu Ổi lên ý tưởng định làm cái app đầu" +
                " tiên cho mình là 'app kỉ niệm ngày quen nhau' mà bây giờ nó lại biến thành 'app xin lỗi'.. Mỗi dòng Cóc đọc, mỗi cái hình, mỗi cái" +
                " nút nhấn, cho đến âm thanh.. Ổi làm với luôn có hình ảnh của Cóc trong đó.." +
                "\n\n\nỔi hiểu cảm giác của Cóc, vì vậy Cóc hãy suy nghĩ kĩ đã, đừng ra quyết định vội vàng.");
        txtvLoiCuoi2.setText("ỔI YÊU CÓC, ỔI XIN LỖI, XIN HÃY THA LỖI CHO ỔI");
        txtvLoiCuoi3.setText("TRƯỚC KHI KẾT THÚC HÃY NGHĨ ĐẾN VÌ SAO MÌNH");
        txtvLoiCuoi4.setText("LẠI BẮT ĐẦU");
        taoAnimation();
    }
    public void taoAnimation() {
        Animation zoom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        zoom.reset();
        txtvLoiCuoi2.startAnimation(zoom);
        txtvLoiCuoi3.startAnimation(zoom);
        txtvLoiCuoi4.startAnimation(zoom);
    }
}
