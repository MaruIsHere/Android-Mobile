package com.example.uts_mobile_programming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class halaman_user extends AppCompatActivity{
    Button btnhitung,btnclear;
    EditText nim, nama,tahun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_user);


        nim = (EditText) findViewById(R.id.txNim);
        nama = (EditText) findViewById(R.id.txNama);
        tahun = (EditText) findViewById(R.id.txTahunlahir);




        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nim.setText(" ");
                nama.setText(" ");
                tahun.setText(" ");


            }
        });

    }

}

