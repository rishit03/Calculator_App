package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView2;
    EditText editTextNumberDecimall, getEditTextNumberDecimall2;
    Button add, sub, multi, div, power;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView2 = findViewById(R.id.textView);
        editTextNumberDecimall = findViewById(R.id.editTextNumberDecimal);
        getEditTextNumberDecimall2 = findViewById(R.id.editTextNumberDecimal2);
        add = findViewById(R.id.button);
        sub = findViewById(R.id.button2);
        multi = findViewById(R.id.button3);
        div = findViewById(R.id.button4);
        power = findViewById(R.id.powerBtn);


        add.setOnClickListener(view -> {
            int firstValue, secondValue, result;

            firstValue = Integer.parseInt(editTextNumberDecimall.getText().toString());
            secondValue = Integer.parseInt(getEditTextNumberDecimall2.getText().toString());
            result = firstValue + secondValue;
            textView2.setText(result);
        });

        sub.setOnClickListener(view -> {
            int firstValue, secondValue, result;

            firstValue = Integer.parseInt(editTextNumberDecimall.getText().toString());
            secondValue = Integer.parseInt(getEditTextNumberDecimall2.getText().toString());
            result = firstValue - secondValue;
            textView2.setText(result);
        });

        multi.setOnClickListener(view -> {
            int firstValue, secondValue, result;

            firstValue = Integer.parseInt(editTextNumberDecimall.getText().toString());
            secondValue = Integer.parseInt(getEditTextNumberDecimall2.getText().toString());
            result = firstValue * secondValue;
            textView2.setText(result);
        });
        

        div.setOnClickListener(view -> {
            int firstValue, secondValue, result;

            firstValue = Integer.parseInt(editTextNumberDecimall.getText().toString());
            secondValue = Integer.parseInt(getEditTextNumberDecimall2.getText().toString());
            result = firstValue / secondValue;
            textView2.setText(result);
        });

        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int base, power, result;
                base = Integer.parseInt(editTextNumberDecimall.getText().toString());
                power = Integer.parseInt(getEditTextNumberDecimall2.getText().toString());
                result = (int) Math.pow(base, power);
                textView2.setText(result);
            }
        });
    }

}