package com.example.uts_mobile_programming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;
import android.widget.EditText;

public class halaman_login extends AppCompatActivity {
    Button btnmasuk,btnclear;
    EditText user, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_login);

        btnmasuk = (Button) findViewById(R.id.btnLogin);
        user = (EditText) findViewById(R.id.txUser);
        pass = (EditText) findViewById(R.id.txPassword);

        btnmasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username, password;
                username = user.getText().toString();
                password = pass.getText().toString();
                if(username.equals("user") && password.equals("user")){
                    Toast.makeText(halaman_login.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                    Intent pindah = new Intent(halaman_login.this, halaman_user.class);
                    startActivity(pindah);
                }else{
                    Toast.makeText(halaman_login.this, "User Name atau Password Salah", Toast.LENGTH_SHORT).show();
                    user.setText("");
                    pass.setText("");
                }

            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                user.setText(" ");
                pass.setText(" ");


            }
        });

    }
}