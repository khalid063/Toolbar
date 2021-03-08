package com.example.toolbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        Toolbar toolbar = findViewById(R.id.toolbar_id);
//        setSupportActionBar(toolbar);
        TextView textView = findViewById(R.id.tv_toolbar_headline);
        textView.setText("Page 2");
        //getSupportActionBar().setDisplayShowTitleEnabled(false);

    }
}