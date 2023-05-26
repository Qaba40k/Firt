package com.example.firt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class RezeptActivity extends AppCompatActivity {

    private TextView rez;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rezept);


        rez = findViewById(R.id.rezi);

        Intent intent = getIntent();

        rez.setText(intent.getStringExtra("rez"));
    }




}