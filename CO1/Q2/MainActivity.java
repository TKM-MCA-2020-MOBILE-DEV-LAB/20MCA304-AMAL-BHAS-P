package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

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
    public void btnclick(View view){
        EditText edt=findViewById(R.id.editTextTextPersonName);
        EditText edt1=findViewById(R.id.editTextTextPersonName2);
        EditText edt2=findViewById(R.id.editTextTextPersonName3);

        TextView txt1= findViewById(R.id.textView);
        TextView txt2= findViewById(R.id.textView3);
        TextView txt3= findViewById(R.id.textView4);

        txt1.setText("Hello" +edt.getText().toString());
        txt2.setText("Address" +edt1.getText().toString());
        txt1.setText("email" +edt2.getText().toString());
    }
}