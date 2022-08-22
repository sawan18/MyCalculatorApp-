package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    Intent intent = getIntent();
    String nameToShow = intent.getStringExtra("NAME");

    TextView textView = findViewById(R.id.numAnswerDisplay);
    textView.setText(nameToShow);

}