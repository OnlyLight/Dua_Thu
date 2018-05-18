package com.example.a.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    private Button btnCong, btnAdd, btnUpdate;
    private EditText edt1, edt2, edtNhap;
    private TextView txtvKetQua;
    private ListView lvMonHoc;
    private ArrayList<String> arrMonHoc;
    private ArrayList<MonAn> arrMonAn = new ArrayList<>();
    private int viTri = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        addShow();

//        if (savedInstanceState != null) {
//            edt1.setText(String.valueOf(savedInstanceState.getInt("SO_1")));
//            edt2.setText(String.valueOf(savedInstanceState.getInt("SO_2")));
//            txtvKetQua.setText(String.valueOf(savedInstanceState.getInt("KET_QUA")));
//        }

        addEven();
    }

    public void addShow() {
//        btnCong = (Button) findViewById(R.id.btnCong);
//        edt1 = (EditText) findViewById(R.id.edt1);
//        edt2 = (EditText) findViewById(R.id.edt2);
//        txtvKetQua = (TextView) findViewById(R.id.txtvKetQua);
        lvMonHoc = (ListView) findViewById(R.id.lvMonHoc);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnUpdate = (Button) findViewById(R.id.btnUpdate);
        edtNhap = (EditText) findViewById(R.id.edtNhap);
    }

    public void addEven() {
//        btnCong.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(v == btnCong) {
//                    if(edt1.getText().toString().isEmpty() || edt2.getText().toString().isEmpty()) {
//                        Toast.makeText(Main2Activity.this, "Vui long nhap day du", Toast.LENGTH_SHORT).show();
//                    }
//                    else {
//                        int so1 = Integer.parseInt(edt1.getText().toString());
//                        int so2 = Integer.parseInt(edt2.getText().toString());
//                        txtvKetQua.setText(String.valueOf(so1 + so2));
//                    }
//                }
//            }
//        });

        arrMonHoc = new ArrayList<>();
        arrMonHoc.add("Android");
        arrMonHoc.add("IOS");
        arrMonHoc.add("PHP");

        final ArrayAdapter adapter = new ArrayAdapter(Main2Activity.this, android.R.layout.simple_list_item_1, arrMonHoc);
        lvMonHoc.setAdapter(adapter);

        // Add
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrMonHoc.add(edtNhap.getText().toString());
                adapter.notifyDataSetChanged();
                edtNhap.setText("");
            }
        });

        // Update
        lvMonHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                edtNhap.setText(arrMonHoc.get(position));
                viTri = position;
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arrMonHoc.set(viTri, edtNhap.getText().toString());
                adapter.notifyDataSetChanged();
                edtNhap.setText("");
            }
        });

        lvMonHoc.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                arrMonHoc.remove(position);
                adapter.notifyDataSetChanged();
                edtNhap.setText("");
                return false;
            }

        });
    }
//        arrMonAn.add(new MonAn("Bún Bò", 10000));
//        arrMonAn.add(new MonAn("Bánh Xèo", 20000));
//
//        MonAnAdapter adapter = new MonAnAdapter(Main2Activity.this, R.layout.dong_mon_an, arrMonAn);
//        lvMonHoc.setAdapter(adapter);

//    @Override
//    public void onSaveInstanceState(Bundle bundle) {
//        if(!txtvKetQua.getText().toString().isEmpty()) {
//            bundle.putInt("SO_1", Integer.parseInt(edt1.getText().toString()));
//            bundle.putInt("SO_2", Integer.parseInt(edt2.getText().toString()));
//            bundle.putInt("KET_QUA", Integer.parseInt(txtvKetQua.getText().toString()));
//        }
//    }
    }


