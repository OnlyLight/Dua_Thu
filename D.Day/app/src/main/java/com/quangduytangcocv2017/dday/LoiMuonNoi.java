package com.quangduytangcocv2017.dday;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class LoiMuonNoi extends AppCompatActivity {
    private ListView lvBaiHat;
    private TextView txtvLoiNhan;
    private LinearLayout mh;
    private ArrayList<String> arrTenBaiHat, arrLoiNhan;
    private ArrayList<Integer> arrMp3;
    private MediaPlayer songLoiChuaNoi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loi_muon_noi);
        addShow();
        addEven();
    }

    public void addShow() {
        lvBaiHat = (ListView) findViewById(R.id.lvBaiHat);
        txtvLoiNhan = (TextView) findViewById(R.id.txtvLoiNhan);
        mh = (LinearLayout) findViewById(R.id.activity_loi_muon_noi);
    }

    public void addEven() {
        // Nhạc nền
        songLoiChuaNoi = MediaPlayer.create(LoiMuonNoi.this, R.raw.nhacnen);
        songLoiChuaNoi.start();
        // BackGround
        mh.setBackgroundResource(R.drawable.background);

        // Lời Nhắn
        txtvLoiNhan.setText("\n\nỔi biết mình chưa có tốt.. Ổi đến nhà Cóc mà Cóc chưa cho phép là Ổi sai..\n\n" +
                "Ổi nt và gọi điện cho Cóc liên tục như vậy là làm phiền không gian của Cóc.. Cũng là Ổi sai \n\n" +
                "Ổi cũng nghĩ như Cóc.. Sự tin tưởng là nền tảng quan trọng nhất trong bất kì 1 mối quan hệ lâu dài nào.. \n\n" +
                "Đây cũng là lần đầu tiên Ổi yêu.. Nên thiếu kinh nghiêm.. \n\n" +
                "Vậy tại sao Cóc có kinh nghiệm lại không thể chia sẽ với Ổi.. Để cùng nhau xây dựng 1 mối quan hệ tốt hơn.. \n\n" +
                "Mà Cóc lại ra một quyết định vội vàng như vậy.. ");
        taoAnimation();

        // Tạo mảng
        TaoMang();
        //ListView
        ArrayAdapter adapter = new ArrayAdapter(LoiMuonNoi.this, android.R.layout.simple_list_item_1, arrTenBaiHat);
        lvBaiHat.setAdapter(adapter);

        lvBaiHat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                songLoiChuaNoi.stop();
                songLoiChuaNoi = MediaPlayer.create(LoiMuonNoi.this, arrMp3.get(position));
                songLoiChuaNoi.start();
                txtvLoiNhan.setText(arrLoiNhan.get(position));
                taoAnimation();
            }
        });
    }

    public void TaoMang() {
        arrTenBaiHat = new ArrayList<>();
        arrLoiNhan = new ArrayList<>();
        arrMp3 = new ArrayList<>();

        arrMp3.add(R.raw.viet_nam_oi);
        arrTenBaiHat.add("Việt Nam Ơi - Minh Beta");
        arrLoiNhan.add("\n\n\tĐây là bài hát khi nghe.. Ổi lập tức nhớ đến Cóc..");

        arrMp3.add(R.raw.duyen_phan);
        arrTenBaiHat.add("Duyên Phận - Hiền Thục");
        arrLoiNhan.add("\n\n\tChắc Cóc vẫn còn nhớ.. Đây là bài hát đầu tiên mà Ổi nghe Cóc hát.. Thực sự rất là hay..");

        arrMp3.add(R.raw.anh_mo);
        arrTenBaiHat.add("Anh Mơ - Anh Khang");
        arrLoiNhan.add("\n\n\tĐây là bài hát Ổi hát để tặng Cóc hôm đó.. Nhưng sợ nên không nói cho Cóc biết..");

        arrMp3.add(R.raw.lac_nhau_co_phai_muon_doi_erik_st319);
        arrTenBaiHat.add("Lạc nhau có phải muôn đời - ERIK_ST319");
        arrLoiNhan.add("\n\n\tLạc nhau... Chứ đừng quên nhau.. Ổi vẫn luôn giữ chặt tay Cóc vì vậy Cóc đừng buông thả mọi thứ..");

        arrMp3.add(R.raw.vo_hinh_trong_tim_em_mr_siro);
        arrTenBaiHat.add("Vô hình trong tim em - Mr.Siro");
        arrLoiNhan.add("\n\n\tTrong tim Cóc vẫn còn hình ảnh của Ổi chứ..");

        arrMp3.add(R.raw.lang_nghe_nuoc_mat_mr_siro);
        arrTenBaiHat.add("Lắng nghe nước mắt - Mr.Siro");
        arrLoiNhan.add("\n\n\tHãy cho nhau thêm cơ hội để hiểu nhau hơn.. Đừng vì thử thách này mà cả hai phỉa mất nhau mãi mãi..");
    }
    public void taoAnimation() {
        Animation zoom = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
        zoom.reset();
        txtvLoiNhan.clearAnimation();
        txtvLoiNhan.startAnimation(zoom);
    }
}
