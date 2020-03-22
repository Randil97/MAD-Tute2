package com.example.intentproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        EditText no1 = findViewById(R.id.editText);
        EditText no2 = findViewById((R.id.editText2));

        Button btn1 = findViewById(R.id.button2);
        Button btn2 = findViewById(R.id.button3);
        Button btn3 = findViewById(R.id.button4);
        Button btn4 = findViewById(R.id.button5);

        Bundle bn = getIntent().getExtras();
        String data1 = bn.getString("A");
        String data2 = bn.getString("B");
        no1.setText(String.valueOf(data1));
        no2.setText(String.valueOf(data2));

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Add();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Substract();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Multiple();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Divition();
            }
        });
    }

    public void Add() {
        EditText txt1 = findViewById(R.id.editText);
        EditText txt2 = findViewById(R.id.editText2);
        EditText txt3 = findViewById(R.id.editText3);

        int num1 = Integer.parseInt(txt1.getText().toString());
        int num2 = Integer.parseInt(txt2.getText().toString());
        int result = num1 + num2;
        txt3.setText("Answer ="+String.valueOf(result));

    }

    public void Substract() {
        EditText txt1 = findViewById(R.id.editText);
        EditText txt2 = findViewById(R.id.editText2);
        EditText txt3 = findViewById(R.id.editText3);

        int num1 = Integer.parseInt(txt1.getText().toString());
        int num2 = Integer.parseInt(txt2.getText().toString());
        int result = num1 - num2;
        txt3.setText("Answer ="+String.valueOf(result));

    }
    public void Multiple() {
        EditText txt1 = findViewById(R.id.editText);
        EditText txt2 = findViewById(R.id.editText2);
        EditText txt3 = findViewById(R.id.editText3);

        int num1 = Integer.parseInt(txt1.getText().toString());
        int num2 = Integer.parseInt(txt2.getText().toString());
        int result = num1 * num2;
        txt3.setText("Answer ="+String.valueOf(result));

    }

    public void Divition() {
        EditText txt1 = findViewById(R.id.editText);
        EditText txt2 = findViewById(R.id.editText2);
        EditText txt3 = findViewById(R.id.editText3);

        int num1 = Integer.parseInt(txt1.getText().toString());
        int num2 = Integer.parseInt(txt2.getText().toString());
        int result = num1 / num2;
        txt3.setText("Answer ="+String.valueOf(result));

    }


}
