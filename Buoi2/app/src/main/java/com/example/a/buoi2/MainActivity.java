package com.example.a.buoi2;

import android.app.Dialog;
import android.content.DialogInterface;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Database database;
    private ListView lvCongViec;
    private CongViecAdapter adapter;
    private ArrayList<CongViec> arrCongViec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addShow();
        arrCongViec = new ArrayList<>();

        adapter = new CongViecAdapter(this, R.layout.dong_cong_viec, arrCongViec);
        lvCongViec.setAdapter(adapter);

        database = new Database(this, "ghichu.sqlite", null, 1);

        database.queryData("CREATE TABLE IF NOT EXISTS CongViec(Id INTEGER PRIMARY KEY AUTOINCREMENT, TenCV VARCHAR(200))");

        Log.d("aaa", "o day");

        getData();
    }

    private void getData() {
        Cursor cursor = database.getData("SELECT * FROM CongViec");
        arrCongViec.clear();
        while (cursor.moveToNext()) {
            int id = cursor.getInt(0);
            String ten = cursor.getString(1);
            arrCongViec.add(new CongViec(id, ten));
//            Toast.makeText(this, ten, Toast.LENGTH_SHORT).show();
        }
        adapter.notifyDataSetChanged();
    }

    public void addShow() {
        lvCongViec = (ListView) findViewById(R.id.lvCongViec);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.add, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menuAdd) {
            showDialog();
        }
        return super.onOptionsItemSelected(item);
    }

    private void showDialog() {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dong_add);

        final EditText edtThem = (EditText) dialog.findViewById(R.id.edtThem);
        Button btnThem = (Button) dialog.findViewById(R.id.btnThem);
        Button btnHuy = (Button) dialog.findViewById(R.id.btnHuy);

        btnHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });

        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ten = edtThem.getText().toString().trim();
                database.queryData("INSERT INTO CongViec VALUES(null, '" + ten + "')");
                getData();
                Toast.makeText(MainActivity.this, "Đã thêm " + ten + "", Toast.LENGTH_SHORT).show();

                dialog.cancel();
            }
        });

        dialog.show();
    }

    public void dialogEdit(final int id, final String tenCV) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dong_edit);

        final EditText edtEdit = (EditText) dialog.findViewById(R.id.edtEdit);
        Button btnEdit = (Button) dialog.findViewById(R.id.btnEdit);
        Button btnHuyEdit = (Button) dialog.findViewById(R.id.btnHuyEdit);

        btnHuyEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });

        edtEdit.setText(tenCV);

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ten = edtEdit.getText().toString().trim();
                database.queryData("UPDATE CongViec SET TenCV = '" + ten + "' WHERE Id = '"+ id +"'");
                getData();
                Toast.makeText(MainActivity.this, "Đã sửa thành " + ten + "", Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }
        });

        dialog.show();
    }

    public void dialogDelete(final int id, final String tenCV) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setMessage("Bạn có thực sự muốn xóa " + tenCV + " không ?");
        dialog.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        dialog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                database.queryData("DELETE FROM CongViec WHERE Id = '" + id + "'");
                getData();
                Toast.makeText(MainActivity.this, "Đã xóa " + tenCV + "", Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }
        });
        dialog.show();
    }
}
