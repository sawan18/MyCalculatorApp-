package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchScreens(View view) {
        EditText editText = findViewById(R.id.numAnswerDisplay);
        String name = editText.getText().toString();
        Intent intent = new Intent(this, secondActivity.class);
        intent.putExtra("NAME", name);
        startActivity(intent);
    }

}