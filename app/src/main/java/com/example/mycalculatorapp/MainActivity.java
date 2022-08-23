package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchScreens(View view) {
        TextView editText = findViewById(R.id.answerField);
        String name = editText.getText().toString();
        Intent intent = new Intent(this, secondActivity.class);
        intent.putExtra("NAME", name);
        startActivity(intent);
    }

    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.enterNumberOne);
        EditText number2ET = findViewById(R.id.enterNumberTwo);
        TextView numberSumTV = findViewById(R.id.numAnswerDisplay);

        int num1 = Integer.parseInt(number1ET.getText().toString());
        int num2 = Integer.parseInt(number2ET.getText().toString());
        int sum = num1 + num2;

        numberSumTV.setText("" + sum);
    }


}