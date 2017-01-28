package com.tutorial.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText inputField;

    Button button1, button2, button3;

    Button buttonPlus, buttonEquals;

    Button buttonClear, buttonBackspace;

    double number1, number2;

    double result = 0;

    String sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputField = (EditText) findViewById(R.id.editTextNumber);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonEquals = (Button) findViewById(R.id.buttonEquals);

        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonBackspace = (Button) findViewById(R.id.buttonBackspace);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputField.append("1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputField.append("2");
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sign = "+";
                number1 = Double.parseDouble(inputField.getText().toString());
                inputField.setText("");
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number2 = Double.parseDouble(inputField.getText().toString());
                if (sign.equals("+")) {
                    result = number1 + number2;
                    inputField.setText(String.valueOf(result));
                }
            }
        });




        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputField.setText("");
                result = 0;
            }
        });

        buttonBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "qwertyuiop";
                String sub = text.substring(3, 6);
                Toast.makeText(MainActivity.this, sub, Toast.LENGTH_SHORT).show();
//                int length = inputField.getText().length();
//                if (length > 0) {
//                    inputField.getText().delete(length - 1, length);
//                }
            }
        });
    }
}
