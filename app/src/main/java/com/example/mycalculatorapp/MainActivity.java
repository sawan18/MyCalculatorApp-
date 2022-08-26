package com.example.mycalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonSecretMessage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSecretMessage = findViewById(R.id.buttonSecretMessage);

        buttonSecretMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Thank You For Using Calculator !",Toast.LENGTH_SHORT).show();
            }
        });


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
//    Calculates the n root of the #a through calculations
    public void findSecRoot(View view) {
        EditText number1ET = findViewById(R.id.enterNumberOne);
        EditText number2ET = findViewById(R.id.enterNumberTwo);
        TextView numberSecondRootTV = findViewById(R.id.numAnswerDisplay);

        double num1 = Double.parseDouble(number1ET.getText().toString());
        double num2 = Double.parseDouble(number2ET.getText().toString());
        //double secondRoot = num1 / num2;
        double a = Math.pow(num2, 1.0 / num1);
        double b = Math.round(a);

        numberSecondRootTV.setText("" + b);
    }

    // Percentage = (Obtained score x 100) / Total Score
    public void findPercent(View view) {
        EditText number1ET = findViewById(R.id.enterNumberOne);
        EditText number2ET = findViewById(R.id.enterNumberTwo);
        TextView numberSecondRootTV = findViewById(R.id.numAnswerDisplay);

        double num1 = Double.parseDouble(number1ET.getText().toString());
        double num2 = Double.parseDouble(number2ET.getText().toString());
        double secondRoot = (num1/num2)*100;

        numberSecondRootTV.setText("" + secondRoot);
    }

}


//