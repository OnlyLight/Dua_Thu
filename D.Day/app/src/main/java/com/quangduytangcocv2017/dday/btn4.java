package com.quangduytangcocv2017.dday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class btn4 extends AppCompatActivity {
    private TextView txtvNgay4, txtvNgayThu4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn4);
        addShow();
        addEven();
    }
    public void addShow() {
        txtvNgay4 = (TextView) findViewById(R.id.txtvNgay4);
        txtvNgayThu4 = (TextView) findViewById(R.id.txtvNgayThu4);
    }
    public void addEven() {
        txtvNgayThu4.setText("Ngày 27/09/2016");
        taoAnimation();
        txtvNgay4.setText("\n\nHôm nay, là ngày thứ 3 cũng là ngày đầu tiên mình quyết định không nhắn tin, liên lạc với Cóc" +
                " để xem tình cảm của mình như thế nao ?? Mới chỉ không nhắn tin với hắn từ tối hôm kia tới h thôi, mà sao" +
                " mình cảm thấy lâu như cả 1 tháng.. Rất là nhiều câu hỏi chạy qua đầu mình.. Sao hắn không nhắn tin cho mình" +
                ", 2 buổi sáng trước ngày nào hắn cũng thông báo cho mình là hắn dậy rồi mà, sao mấy buổi nay không thấy ??" +
                "Rất muốn ib nói chuyện.. nhưng mà không được.. thứ 1: mình có là cái móng chi đâu mà nói chuyện với hắn." +
                "thứ 2: mình đã hạ quyết tâm không nt trong vòng 7 ngày mà.. Cứ tới mỗi buổi, mình lại tự hỏi 'Không biết " +
                "h này Cóc ăn chưa ??' Cả ngày tâm trạng nó cứ buồn buồn thế nào ấy.. Rồi không biết mấy cái hắn bị nơi tay, " +
                "hắn nói hôm coi văn nghệ với mình h hết chưa ?? bị cái đó là bị cái gì ?? Tự nhiện lo cả ngày.. Cứ vào face" +
                " rồi lại vào wall nó mà nhòm rồi lại out ra.. =(((( " +
                "\n\nRồi thêm cái là hắn học chung lớp với thằng Tuấn.. Rồi thêm khứa Lực mô ra nữa chớ, thấy cứ hay chụp hình chung với Cóc khang.. Sợ tới 1 ngày nào đó.. Cóc ib qua bảo " +
                "tâm sự là đang thích 1 người là rồi xong mình luôn.. Lúc đó chắc bái bai lun quá.. =((( không muốn chút nào " +
                "Đó là ở trong lớp còn chưa nói là ở trong CLB nữa chớ.. cũng có mấy khứa nữa chớ.. mà hắn kể là nó chơi " +
                "trò chơi là nam nữ xen kẻ nữa chớ.. Sợ cái ngày đó tới chắc cũng gần thôi =((( Không biết phải làm đây... " +
                "Mà mới hồi nãy vô face thấy hắn share cái bài nói về quản lý người yêu nữa chớ.. =((( " +
                "\n\nĐã buồn còn thêm buồn... Không biết là hắn đăng có ý gì nữa.. Không lẽ hắn thích thằng khứa mô thiệt rồi.. Khi thấy bài share nớ tâm" +
                " trạng xuống dốc còn nhanh hơn là không ib nữa =((( Không biết mình chịu được mấy ngày nữa.. Không biết hắn có nhắn tìn" +
                " cho mình không hay là quên mình luôn rồi... " +
                "\n\nMình có là cái chi với hắn đâu mà hắn phải nhớ.. chắc mình chỉ là bạn xã giao thôi... Mất chi phải nhớ tói mình... Chẳng qua là mình ảo tưởng thôi.. " +
                "Chớ mình có cái méo chi đâu mà hắn thích mình... hắn vừa dễ thương, hoạt bát, lại học giỏi nữa.. mất cái chi mà hắn" +
                " lại thich mình.. cái thằng hướng nội, lại còn xấu trai, không cao, to con cũng không, học thì cũng tèo, lại còn " +
                "là người không có khiếu hài hước nữa, một người chán như mình, không tìm thấy được 1 cái j gọi là ưu điểm rứa thì " +
                "sao Trang lại thích.. không biết thời gian 7 ngày là quyết định có dúng không nữa.. phải đợi thôi... Nếu đúng là hắn " +
                "không thích mình thì mình sẽ dùng kiểu lầy vậy.. làm cho hắn không có thời gian để nghĩ tới thằng khứa nào khác nữa =)))))..." +
                "");
    }
    public void taoAnimation() {
        Animation zoom = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        zoom.reset();
        txtvNgayThu4.startAnimation(zoom);
        txtvNgayThu4.startAnimation(zoom);
    }
}
