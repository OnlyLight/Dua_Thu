package com.quangduyv2017.s_group;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main2Activity extends AppCompatActivity {
    private EditText edtDate;
    private Button btnDangKy, btnXemLich;
    private CheckBox cbSang, cbChieu, cbToi;
    private Button btnUpdate, btnDelete;
    private Database data;
    private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    private final Calendar calendar = Calendar.getInstance();
    private int date = calendar.get(Calendar.DATE);
    private int mounth = calendar.get(Calendar.MONTH);
    private int year = calendar.get(Calendar.YEAR);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        addShow();

        data = new Database(Main2Activity.this, "danhsachLich.sqlite", null, 1);

        data.queryData("CREATE TABLE IF NOT EXISTS Lich(Id INTEGER PRIMARY KEY AUTOINCREMENT, ThoiGian VARCHAR(150), BuoiSang VARCHAR(150), BuoiChieu VARCHAR(150), BuoiToi VARCHAR(150))");

        addEvent();
    }

    private void addShow() {
        edtDate = (EditText) findViewById(R.id.edtDate);
        btnDangKy = (Button) findViewById(R.id.btnDangKy);
        btnXemLich = (Button) findViewById(R.id.btnXemLich);
        cbSang = (CheckBox) findViewById(R.id.cbSang);
        cbChieu = (CheckBox) findViewById(R.id.cbChieu);
        cbToi = (CheckBox) findViewById(R.id.cbToi);
        btnUpdate = (Button) findViewById(R.id.btnUpdate);
        btnDelete = (Button) findViewById(R.id.btnDelete);
    }

    private void addEvent() {
        edtDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chonNgay();
            }
        });

        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check();
            }
        });

        btnXemLich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getData();
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateData();
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deleteData();
            }
        });
    }

    private void updateData() {
            final Dialog dialog = new Dialog(Main2Activity.this);
            dialog.setContentView(R.layout.dong_id);
            final EditText edtIdUpdate = (EditText) dialog.findViewById(R.id.edtIdUpdate);
            Button btnIdUpdate = (Button) dialog.findViewById(R.id.btnIdUpdate);
            final Button btnHuyIdUpdate = (Button) dialog.findViewById(R.id.btnHuyIdUpdate);

            btnHuyIdUpdate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.cancel();
                }
            });

            btnIdUpdate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int id = 0;
                    String thoiGian, buoiSang, buoiChieu, buoiToi;
                    final Dialog dialog2 = new Dialog(Main2Activity.this);
                    dialog2.setContentView(R.layout.dong_update_info);
                    final EditText edtTimeInfoUpdate = dialog2.findViewById(R.id.edtTimeInfoUpdate);
                    final EditText edtSangInfoUpdate = dialog2.findViewById(R.id.edtSangInfoUpdate);
                    final EditText edtChieuInfoUpdate = dialog2.findViewById(R.id.edtChieuInfoUpdate);
                    final EditText edtToiInfoUpdate = dialog2.findViewById(R.id.edtToiInfoUpdate);
                    Button btnOKInfoUpdate = dialog2.findViewById(R.id.btnOKInfoUpdate);
                    Button btnHuyInfoUpdate = dialog2.findViewById(R.id.btnHuyInfoUpdate);

                    btnHuyInfoUpdate.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            dialog2.cancel();
                        }
                    });

                    if (edtIdUpdate.getText().toString().trim().length() <= 0) {
                        Toast.makeText(Main2Activity.this, "Xin hãy nhập ID !!", Toast.LENGTH_SHORT).show();
                    } else {
                        Cursor cursor = data.getData("SELECT * FROM Lich");
                        while (cursor.moveToNext()) {
                            id = cursor.getInt(0);
                            thoiGian = cursor.getString(1);
                            buoiSang = cursor.getString(2);
                            buoiChieu = cursor.getString(3);
                            buoiToi = cursor.getString(4);

                            if (Integer.parseInt(edtIdUpdate.getText().toString().trim()) == id) {
                                edtTimeInfoUpdate.setText(thoiGian);
                                edtSangInfoUpdate.setText(buoiSang);
                                edtChieuInfoUpdate.setText(buoiChieu);
                                edtToiInfoUpdate.setText(buoiToi);
                                dialog2.show();
                                break;
                            }
                        }
                        if (Integer.parseInt(edtIdUpdate.getText().toString().trim()) != id) {
                            Toast.makeText(Main2Activity.this, "Không có dữ liệu", Toast.LENGTH_SHORT).show();
                        }
                    }

                    edtTimeInfoUpdate.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            DatePickerDialog datePickerDialog = new DatePickerDialog(Main2Activity.this, new DatePickerDialog.OnDateSetListener() {
                                @Override
                                public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                                    calendar.set(i, i1, i2);
                                    edtTimeInfoUpdate.setText(format.format(calendar.getTime()));
                                }
                            }, year, mounth, date);
                            datePickerDialog.show();
                        }
                    });

                    final int finalId = id;
                    btnOKInfoUpdate.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String thoiGian = edtTimeInfoUpdate.getText().toString().trim();
                            String sang = edtSangInfoUpdate.getText().toString().trim();
                            String chieu = edtChieuInfoUpdate.getText().toString().trim();
                            String toi = edtToiInfoUpdate.getText().toString().trim();

                            if ((sang.equals("") && chieu.equals("") && toi.equals("")) || thoiGian.equals("")) {
                                Toast.makeText(Main2Activity.this, "Đăng ký ít nhất 1 buổi", Toast.LENGTH_SHORT).show();
                            }
                            else if ((sang.equals("Sáng") || sang.equals("")) && (chieu.equals("Chiều") || chieu.equals("")) && (toi.equals("Tối") || toi.equals(""))) {
                                xacNhanUpdate(thoiGian, sang, chieu, toi, finalId);
                                Toast.makeText(Main2Activity.this, "Sửa thành công !!", Toast.LENGTH_SHORT).show();
                                dialog2.dismiss();
                                dialog.dismiss();
                            }
                            else {
                                Toast.makeText(Main2Activity.this, "Xin hãy nhập đúng định dạng !! (Sáng hoặc Chiều hoặc Tối)", Toast.LENGTH_LONG).show();
                            }
                        }
                    });
                }
            });

            dialog.show();
    }

    private void xacNhanUpdate(String thoiGian, String sang, String chieu, String toi, int id) {
        data.queryData("UPDATE Lich SET ThoiGian = '" + thoiGian + "', BuoiSang = '" + sang + "', BuoiChieu = '" + chieu + "', BuoiToi = '" + toi + "' WHERE Id = '" + id + "'");
    }

    private void deleteData() {
        final Dialog dialog = new Dialog(Main2Activity.this);
        dialog.setContentView(R.layout.dong_delete);
        final EditText edtID = (EditText) dialog.findViewById(R.id.edtID);
        Button btnXacNhan = (Button) dialog.findViewById(R.id.btnXacNhan);
        Button btnHuy = (Button) dialog.findViewById(R.id.btnHuy);
        Button btnDeleteAll = (Button) dialog.findViewById(R.id.btnDeleteAll);

        btnHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
            }
        });

        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtID.getText().toString().trim().length() > 0) {
                    xacNhanDelete(Integer.parseInt(edtID.getText().toString()));
                    Toast.makeText(Main2Activity.this, "Đã xóa", Toast.LENGTH_SHORT).show();
                    dialog.cancel();
                } else {
                    Toast.makeText(Main2Activity.this, "Xin hãy nhập ID", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnDeleteAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogDeleteAll();
            }
        });

        dialog.show();
    }

    private void dialogDeleteAll() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setMessage("Bạn có thực sự muốn xóa tất cả không ?");
        dialog.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        dialog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                xacNhanDeleteAll();
                Toast.makeText(Main2Activity.this, "Đã xóa", Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }
        });
        dialog.show();
    }

    private void xacNhanDeleteAll() {
        data.queryData("DELETE FROM DanhSach");
        data.queryData("VACUUM");
    }

    private void xacNhanDelete(int id) {
        data.queryData("DELETE FROM Lich WHERE Id = '" + id + "'");
    }

    private StringBuffer info(Cursor cursor) {
        StringBuffer buffer = new StringBuffer();
        while (cursor.moveToNext()) {
            buffer.append("ID: " + cursor.getInt(0) + "\n");
            buffer.append("\nThoi gian: "+ cursor.getString(1) + "\n");
            buffer.append(cursor.getString(2) + "\n");
            buffer.append(cursor.getString(3) + "\n");
            buffer.append(cursor.getString(4) + "\n\n");
        }
        return buffer;
    }

    private void getData() {
        Cursor cursor = data.getData("SELECT * FROM Lich");

        if (cursor.getCount() == 0) {
            Toast.makeText(this, "Không có dữ liệu", Toast.LENGTH_SHORT).show();
        }

        showMessage("Đã đăng ký", info(cursor).toString());
    }

    private void showMessage(String titile, String message) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(Main2Activity.this);
        dialog.setCancelable(true);
        dialog.setTitle(titile);
        dialog.setMessage(message);
        dialog.show();
    }

    private void check() {
        String thoiGian = format.format(calendar.getTime());
        String demSang = "", demChieu = "", demToi = "";
        if (cbSang.isChecked()) demSang = "Sáng";
        if (cbChieu.isChecked()) demChieu = "Chiều";
        if (cbToi.isChecked()) demToi = "Tối";

        Cursor cursor = data.getData("SELECT * FROM Lich");
        while (cursor.moveToNext()) {
            if (cursor.getString(1).equals(thoiGian) && cursor.getString(2).equals(demSang) && cursor.getString(3).equals(demChieu) && cursor.getString(4).equals(demToi)) {
                Toast.makeText(this, "Đã có dữ liệu !!", Toast.LENGTH_SHORT).show();
                break;
            } else {
                if (cbSang.isChecked() && cbChieu.isChecked() && cbToi.isChecked()) {
                    data.queryData("INSERT INTO Lich VALUES(null, '" + format.format(calendar.getTime()) + "', 'Sáng', 'Chiều', 'Tối')");
                    Toast.makeText(this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (cbChieu.isChecked() && cbToi.isChecked()) {
                    data.queryData("INSERT INTO Lich VALUES(null, '" + format.format(calendar.getTime()) + "', '', 'Chiều', 'Tối')");
                    Toast.makeText(this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (cbSang.isChecked() && cbToi.isChecked()) {
                    data.queryData("INSERT INTO Lich VALUES(null, '" + format.format(calendar.getTime()) + "', 'Sáng', '', 'Tối')");
                    Toast.makeText(this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (cbSang.isChecked() && cbChieu.isChecked()) {
                    data.queryData("INSERT INTO Lich VALUES(null, '" + format.format(calendar.getTime()) + "', 'Sáng', 'Chiều', '')");
                    Toast.makeText(this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (cbToi.isChecked()) {
                    data.queryData("INSERT INTO Lich VALUES(null, '" + format.format(calendar.getTime()) + "', '', '', 'Tối')");
                    Toast.makeText(this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (cbChieu.isChecked()) {
                    data.queryData("INSERT INTO Lich VALUES(null, '" + format.format(calendar.getTime()) + "', '', 'Chiều', '')");
                    Toast.makeText(this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();
                    break;
                }
                else if (cbSang.isChecked()) {
                    data.queryData("INSERT INTO Lich VALUES(null, '" + format.format(calendar.getTime()) + "', 'Sáng', '', '')");
                    Toast.makeText(this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();
                    break;
                }
                else {
                    Toast.makeText(this, "Chưa chọn ngày !! Xin chọn lại", Toast.LENGTH_SHORT).show();
                    break;
                }
            }
        }
    }

    private void chonNgay() {
        DatePickerDialog datePickerDialog = new DatePickerDialog(Main2Activity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                calendar.set(i, i1, i2);
                edtDate.setText(format.format(calendar.getTime()));
            }
        }, year, mounth, date);
        datePickerDialog.show();
    }
}