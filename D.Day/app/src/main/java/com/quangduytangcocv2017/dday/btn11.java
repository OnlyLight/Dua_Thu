package com.quangduytangcocv2017.dday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class btn11 extends AppCompatActivity {
    private TextView txtvNgay11, txtvNgayThu11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn11);
        addShow();
        addEven();
    }
    public void addShow() {
        txtvNgay11 = (TextView) findViewById(R.id.txtvNgay11);
        txtvNgayThu11 = (TextView) findViewById(R.id.txtvNgayThu11);
    }
    public void addEven() {
        txtvNgayThu11.setText("Ngày 21/12/2016");
        taoAnimation();
        txtvNgay11.setText("\n\nGần đây, lại có thêm 1 tin nữa là Cóc quyết định đi Nhật.. Cảm thấy buồn đến mức cả ngày ko tâp " +
                "trung vào làm j được lun á... chỉ có lúc nt vs Cóc là tinh thần lên được chút.. Cóc đi 4 năm, phải làm sao đây " +
                "Cóc ở đây 1 tháng không gặp được là người hết sức sống rồi.. mà còn qua đó 4 năm nữa thì sao đây.. giờ mình có " +
                "nên nói cho cóc biết không.. " +
                "\n\n\nKHÔNG ĐƯỢC NÓI !!! Cóc đã bỏ lỡ cơ hội 1 lần hồi năm lớp 11 rồi.. Mình không thể ích kỉ như vậy được.. " +
                "phải cho Cóc đi con đường sự nghiệp riêng của mình chớ.. Mình sợ nếu Cóc có tình cảm với mình thật.. thì chính " +
                "mình sẽ là vật cản đường của Cóc.. mình không muốn cản trở Cóc trên con đường Cóc chọn.. =((((" +
                "\n\n\nMình phải tìm hiểu coi, phải chắc chắn là Cóc không có tình cảm với mình.. rồi mình sẽ đi tỏ tình.." +
                "Mình không muốn tới đó lại là vật cản của Cóc.. " +
                "\n\nSau khi nghe tin Cóc quyết định đi Nhật.. thì cả kế hoạch 4 năm sắp tới của mình liền được lập ra.. " +
                "lạ vai~ nồi... Trước h chưa bao h mình lập cái kế hoạch nào nhanh như vậy.. @@?? " +
                "\n\n\nTrước tiên là phải qua kì thi này đã.. Sau đó cày hết Chuyên môn, tiếng Anh, Đến năm 2 làm các dự án " +
                "trong group, lấy kinh nghiêm, kỹ năng, học thêm tiếng Nhật nữa.. " +
                "tham gia các kì thi kiếm học bổng đi Nhật, đến kì 2 năm 3 mình sẽ được đi thực tập.. mÌnh phải thể hiện thật tốt " +
                "thái độ làm việc lẫn kĩ năng chuyên môn... để nhận được cái lời mời sang Nhật làm việc để được Gặp lại Cóc.. " +
                "Đến lúc đó mình sẽ cho Cóc biết tình cảm của mình" +
                "\n\n\n\nCỐ LÊN !!! VÌ CÓC MÌNH CÓ THỂ LÀM ĐƯỢC..");
    }
    public void taoAnimation() {
        Animation zoom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        zoom.reset();
        txtvNgayThu11.startAnimation(zoom);
        txtvNgayThu11.startAnimation(zoom);
    }
}
