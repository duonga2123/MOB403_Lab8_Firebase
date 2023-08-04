package com.example.testfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.testfirebase.Bai1.LoginActivity;
import com.example.testfirebase.Bai1.MainActivity;
import com.example.testfirebase.Bai2.MainActivityBai2;
import com.example.testfirebase.Bai3.MainActivityBai3;

public class MainActivityLab8 extends AppCompatActivity {

    Button b1, b2, b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lab8);
        b1 = findViewById(R.id.Bai1);
        b2 = findViewById(R.id.Bai2);
        b3 = findViewById(R.id.Bai3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivityLab8.this, LoginActivity.class));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivityLab8.this, MainActivityBai2.class));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivityLab8.this, MainActivityBai3.class));
            }
        });
    }
}