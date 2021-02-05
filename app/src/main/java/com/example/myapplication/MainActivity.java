package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {
 Button b;
 EditText name;
 TextView mytext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.Hbutton);
        name= (EditText) findViewById(R.id.PersonName);
         mytext = (TextView) findViewById(R.id.show);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st = name.getText().toString();
                mytext.setText("Hello, "+ st);
            }
        });
    }
}