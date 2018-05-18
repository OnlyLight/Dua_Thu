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
    private DatabaseHelper myDb;
    private EditText edtID, edtName, edtSurName, edtMarks;
    private Button btnAdd, btnViewAll, btnUpdate, btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDb = new DatabaseHelper(this);
        addShow();
    }
    public void addShow() {
        edtID = (EditText) findViewById(R.id.edtID);
        edtName = (EditText) findViewById(R.id.edtName);
        edtSurName = (EditText) findViewById(R.id.edtSurname);
        edtMarks = (EditText) findViewById(R.id.edtMarks);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnViewAll = (Button) findViewById(R.id.btnViewAll);
        btnDelete = (Button) findViewById(R.id.btnDelete);
        btnUpdate = (Button) findViewById(R.id.btnUpdate);
    }
    public void addData() {
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(myDb.allData(edtName.getText().toString(), edtSurName.getText().toString(), edtMarks.getText().toString()) == true)
                    Toast.makeText(MainActivity.this, "Add Data Complete", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Add Data not Complete", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void viewAll () {
        btnViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = myDb.cursor();
                if(res.getCount() == 0) {
                    showMessage("Data", "No Values");
                }
                StringBuffer buffer = new StringBuffer();
                while(res.moveToNext()) {
                    buffer.append("ID : "+ res.getString(0));
                    buffer.append("\nNAME : "+ res.getString(1));
                    buffer.append("\nSURNAME : "+ res.getString(2));
                    buffer.append("\nMARKS : "+ res.getString(3)+ "\n\n");

                }
                showMessage("Data", buffer.toString());
            }
        });
    }
    public void showMessage(String title, String message) {
        AlertDialog.Builder buider = new AlertDialog.Builder(MainActivity.this);
        buider.setTitle(title);
        buider.setMessage(message);
        buider.setCancelable(true);
        buider.show();
    }

    public void updateData() {
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(myDb.updateData(edtID.getText().toString(), edtName.getText().toString(), edtSurName.getText().toString(), edtMarks.getText().toString()) == true)
                    Toast.makeText(MainActivity.this, "Update Data Complete", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Update Data not Complete", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void deleteUpdate() {
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myDb.deleteData(edtID.getText().toString()) > 0)
                    Toast.makeText(MainActivity.this, "Delete Data Complete", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Delete Data not Complete", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
