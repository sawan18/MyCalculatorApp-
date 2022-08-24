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
        TextView editText = findViewById(R.id.numAnswerDisplay);
        String name = editText.getText().toString();
        Intent intent = new Intent(this, secondActivity.class);
        intent.putExtra("NAME", name);
        startActivity(intent);
    }

    public void findSum(View view) {
        EditText number1ET = findViewById(R.id.enterNumberOne);
        EditText number2ET = findViewById(R.id.enterNumberTwo);
        TextView numberSumTV = findViewById(R.id.numAnswerDisplay);

        double num1 = Double.parseDouble(number1ET.getText().toString());
        double num2 = Double.parseDouble(number2ET.getText().toString());
        double sum = num1 + num2;

        numberSumTV.setText("" + sum);
    }

    public void findDifference(View view) {
        EditText number1ET = findViewById(R.id.enterNumberOne);
        EditText number2ET = findViewById(R.id.enterNumberTwo);
        TextView numberDiffTV = findViewById(R.id.numAnswerDisplay);

        double num1 = Double.parseDouble(number1ET.getText().toString());
        double num2 = Double.parseDouble(number2ET.getText().toString());
        double difference = num1 - num2;

        numberDiffTV.setText("" + difference);
    }

    public void findProduct(View view) {
        EditText number1ET = findViewById(R.id.enterNumberOne);
        EditText number2ET = findViewById(R.id.enterNumberTwo);
        TextView numberProductTV = findViewById(R.id.numAnswerDisplay);

        double num1 = Double.parseDouble(number1ET.getText().toString());
        double num2 = Double.parseDouble(number2ET.getText().toString());
        double product = num1 * num2;

        numberProductTV.setText("" + product);
    }

    public void findQuotient(View view) {
        EditText number1ET = findViewById(R.id.enterNumberOne);
        EditText number2ET = findViewById(R.id.enterNumberTwo);
        TextView numberProductTV = findViewById(R.id.numAnswerDisplay);

        double num1 = Double.parseDouble(number1ET.getText().toString());
        double num2 = Double.parseDouble(number2ET.getText().toString());
        double quotient = num1 / num2;

        numberProductTV.setText("" + quotient);
    }

}