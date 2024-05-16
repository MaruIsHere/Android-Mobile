package com.example.latihan_2201010036;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class latihan6a extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan6a);

        // Button untuk pindah ke MainActivity
        Button btnMain = findViewById(R.id.btnMain);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToMainActivity();
            }
        });

        // Button untuk pindah ke Latihan4a
        Button btnLat4 = findViewById(R.id.btnLat4);
        btnLat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToLatihan4a();
            }
        });

        // Button untuk pindah ke Latihan5a
        Button btnLat5 = findViewById(R.id.btnLat5);
        btnLat5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToLatihan5a();
            }
        });
    }

    // Method untuk pindah ke MainActivity
    private void switchToMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    // Method untuk pindah ke Latihan4a
    private void switchToLatihan4a() {
        Intent intent = new Intent(this, latihan4a.class);
        startActivity(intent);
    }

    // Method untuk pindah ke Latihan5a
    private void switchToLatihan5a() {
        Intent intent = new Intent(this, latihan5a.class);
        startActivity(intent);
    }
}
