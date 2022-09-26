package com.leventgundogdu.simplecalculator;

import static com.leventgundogdu.simplecalculator.R.*;
import static com.leventgundogdu.simplecalculator.R.id.resultText;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1Text;
    EditText number2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        number1Text = findViewById(id.number1Text);
        number2Text =findViewById(id.number2Text);
        resultText = findViewById(id.resultText);



    }

    public void addition(View view) {

        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter number!");
        } else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 + number2;

            resultText.setText("Result: " + result);
        }
    }

    public void subtraction(View view) {
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter number!");
        } else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 - number2;

            resultText.setText("Result: " + result);
        }

    }

    public void multiplication(View view) {
        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter number!");
        } else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 * number2;

            resultText.setText("Result: " + result);
        }

    }

    public void division(View view) {

        if (number1Text.getText().toString().matches("") || number2Text.getText().toString().matches("")) {
            resultText.setText("Enter number!");
        } else if (number1Text.getText().toString().matches("0") || number2Text.getText().toString().matches("0")){
            resultText.setText("You cant divide 0");
        } else {
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result = number1 / number2;

            resultText.setText("Result: " + result);
        }

    }

}