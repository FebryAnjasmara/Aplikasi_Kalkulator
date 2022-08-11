package com.example.aplikasikalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText number1, number2;
    Button btnAdd, btnSub, btnMulti, btnDiv, btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.editText1);
        number2 = findViewById(R.id.editText2);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMulti = findViewById(R.id.btnMulti);
        btnDiv = findViewById(R.id.btnDiv);
        btnClear = findViewById(R.id.btnClear);
        result = findViewById(R.id.tvResult);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().length() != 0 && number2.getText().length() != 0) {
                    double input1 = Double.parseDouble(number1.getText().toString());
                    double input2 = Double.parseDouble(number2.getText().toString());
                    result.setText("" + (input1 + input2));
                } else {
                    Toast.makeText(MainActivity.this, "Masukkan Angka Pertama dan Kedua", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().length() != 0 && number2.getText().length() != 0) {
                    double input1 = Double.parseDouble(number1.getText().toString());
                    double input2 = Double.parseDouble(number2.getText().toString());
                    result.setText("" + (input1 - input2));
                } else {
                    Toast.makeText(MainActivity.this, "Masukkan Angka Pertama dan Kedua", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().length() != 0 && number2.getText().length() != 0) {
                    double input1 = Double.parseDouble(number1.getText().toString());
                    double input2 = Double.parseDouble(number2.getText().toString());
                    result.setText("" + (input1 * input2));
                } else {
                    Toast.makeText(MainActivity.this, "Masukkan Angka Pertama dan Kedua", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (number1.getText().length() != 0 && number2.getText().length() != 0) {
                    double input1 = Double.parseDouble(number1.getText().toString());
                    double input2 = Double.parseDouble(number2.getText().toString());
                    result.setText("" + (input1 / input2));
                } else {
                    Toast.makeText(MainActivity.this, "Masukkan Angka Pertama dan Kedua", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1.setText("");
                number2.setText("");
                result.setText("0");
                number1.requestFocus();
            }
        });

    }

}