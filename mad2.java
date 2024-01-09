package com.example.proj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button,button1,button2,button3;
    private TextView textview;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        textview = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                int kg = Integer.parseInt(s);
                double gram = 1000 * kg;
                textview.setText(kg+" KG = "+gram+" Gram");
                Toast.makeText(MainActivity.this, "The value is" + gram, Toast.LENGTH_SHORT).show();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String s = editText.getText().toString();
                    int gram = Integer.parseInt(s);
                    double kg = (gram * 1.0)/1000;
                    textview.setText(gram+" Gram = "+kg+" KG");
                    Toast.makeText(MainActivity.this, "The value is" + kg, Toast.LENGTH_SHORT).show();
                }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                int pound = Integer.parseInt(s);
                double kg = 2.20462 * pound;
                textview.setText(pound+" Pound = "+kg+" KG");
                Toast.makeText(MainActivity.this, "The value is" + kg, Toast.LENGTH_SHORT).show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                int kg = Integer.parseInt(s);
                double pound = kg/2.20462;
                textview.setText(kg+" KG = "+pound+" Pound");
                Toast.makeText(MainActivity.this, "The value is" + pound, Toast.LENGTH_SHORT).show();
            }
        });
    }
}