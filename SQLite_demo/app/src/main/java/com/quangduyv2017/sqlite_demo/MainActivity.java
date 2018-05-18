package com.quangduyv2017.sqlite_demo;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private DatabaseHelper mydb;
    private EditText edtName, edtSurname, edtMarks, edtID;
    private Button btnAdd, btnViewAll, btnUpdate, btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mydb = new DatabaseHelper(this);
        addAdd();
        addEven();
        viewAll();
        deleteData();
        updateData();
    }

    public void addAdd() {
        edtName = (EditText) findViewById(R.id.edtName);
        edtSurname =(EditText) findViewById(R.id.edtSurname);
        edtMarks = (EditText) findViewById(R.id.edtMarks);
        edtID = (EditText) findViewById(R.id.edtID);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnViewAll = (Button) findViewById(R.id.btnViewAll);
        btnUpdate = (Button) findViewById(R.id.btnUpdate);
        btnDelete = (Button) findViewById(R.id.btnDelete);
    }

    public void updateData() {
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                boolean isUpdate = mydb.updateData(edtID.getText().toString(), edtName.getText().toString(), edtSurname.getText().toString(), edtMarks.getText().toString());
                if (mydb.updateData(edtID.getText().toString(), edtName.getText().toString(), edtSurname.getText().toString(), edtMarks.getText().toString()) == true)
                    Toast.makeText(MainActivity.this, "Data update", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Data not update", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void addEven() {
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                boolean Insert = mydb.insertData(edtName.getText().toString(), edtSurname.getText().toString(), edtMarks.getText().toString());
                if(mydb.insertData(edtName.getText().toString(), edtSurname.getText().toString(), edtMarks.getText().toString()) == true)
                    Toast.makeText(MainActivity.this, "Mission complete", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Mission fail", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void viewAll() {
        btnViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor cursor = mydb.getAllData();
                if(cursor.getCount() == 0) {
                    showMessage("Data", "No Data");
                    return;
                }

                StringBuffer buffer = new StringBuffer();
                while(cursor.moveToNext()) {
                    buffer.append("\nID: " + cursor.getString(0));
                    buffer.append("\nName: "+ cursor.getString(1));
                    buffer.append("\nSurname: "+ cursor.getString(2));
                    buffer.append("\nMarks: "+ cursor.getString(3) + "\n\n");
                }
                showMessage("Data", buffer.toString());
            }
        });
    }

    public void deleteData() {
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //        Integer deleteRow = mydb.deleteData(edtID.getText().toString());
                if(mydb.deleteData(edtID.getText().toString()) > 0)
                    Toast.makeText(MainActivity.this, "Mission complete", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Mission fail", Toast.LENGTH_SHORT).show();

            }
        });
    }
    public void showMessage(String titile, String message) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setCancelable(true);
        dialog.setTitle(titile);
        dialog.setMessage(message);
        dialog.show();
    }
}
