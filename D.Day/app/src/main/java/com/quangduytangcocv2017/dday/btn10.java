package com.quangduytangcocv2017.dday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class btn10 extends AppCompatActivity {
    private TextView txtvNgay10, txtvNgayThu10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn10);
        addShow();
        addEven();
    }
    public void addShow() {
        txtvNgay10 = (TextView) findViewById(R.id.txtvNgay10);
        txtvNgayThu10 = (TextView) findViewById(R.id.txtvNgayThu10);
    }
    public void addEven() {
        txtvNgayThu10.setText("Ngày 15/12/2016");
        taoAnimation();
        txtvNgay10.setText("\n\nHôm qua là ngày mình tặng quà sinh nhật cho Cóc, cái mà hồi trước định làm để Tỏ Tình với Cóc.." +
                "Giờ mình lại biến thể nó lại thành một món quà sinh nhật... cộng thêm 1 món quà ngoài đời thực nữa chớ..." +
                "Mà sao lần sao hẹn con Cóc trời cũng mưa hết à.. Mà hôm qua còn mưa bụ nữa chớ.. lúc đi mưa quà là cũng có nghĩ" +
                " đến chuyện mưa rồi.. sợ ướt cái khăn quàng với cái máy tính không.. Ướt cái, zô tới nơi hắn chạy không được là" +
                " tạch nữa.. Ông trời chơi ác thiệt" +
                "\n\nHôm qua nghe Cóc khen thì cũng vui lắm.. Nào là cái ni lần đầu tiên Cóc được nhận lun.. đặc biệt ds.. " +
                "nghe xong mấy câu nớ vui vồn.. hôm qua trời mưa to rứa mà vẫn được đi chơi riêng với Cóc đúng lâu lun.. " +
                "Tới những 10 kém 10 lun =)))" +
                " rứa mà cũng có chút buồn... Cóc dăng bài là quà mình tặng.. nhưng lại không " +
                "có một chút dấu hiệu j của mình trong đó.. Cứ như không muốn ai biết.. Không biết Cóc phát tín hiệu này là ý gì nữa.." +
                "Vừa kéo lại vừa đẩy.. Kéo là khen, bất ngờ, đẹp, không ngờ tới.. Đẩy là không cho người khác biết là quà mình tặng.." +
                "Khó hiểu vai~ nồi.. =((((" +
                "\n\nHôm nay cả sáng tới h toàn muốn nhắn tin, nói chuyện với Cóc cảm thấy rất là vui trong người.. Đén khuya thì lại " +
                "buồn.. lạ thiệt chớ.. Mình làm cái này cũng là muốn có cái để Cóc nhớ tới, ấn tượng với mình, không biết có đủ để làm " +
                "cho nó ghi nhớ không nữa.. =((( Chắc mình bị Cóc cho vào diện 'Bạn tốt' rồi... =(((((");
    }
    public void taoAnimation() {
        Animation zoom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        zoom.reset();
        txtvNgayThu10.startAnimation(zoom);
        txtvNgayThu10.startAnimation(zoom);
    }
}
