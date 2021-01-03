package com.example.activitee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper db;
    EditText e1 ,e2 ,e3;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db=new DatabaseHelper( this);
        e2=(EditText)findViewById(R.id.pass);
        e3=(EditText)findViewById(R.id.cpasse);
        b1=(Button) findViewById(R.id.register);
        e1=(EditText)findViewById(R.id.email);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                String s3=e3.getText().toString();
            }
        });
    }
}