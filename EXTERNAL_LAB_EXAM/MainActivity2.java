package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t1,t2,t3;
    String str1,str2,str3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);

        Intent intent= getIntent();
        str1=intent.getStringExtra("value1");
        str2=intent.getStringExtra("value2");
        str3=intent.getStringExtra("value3");

        t1.setText(str1);
        t2.setText(str2);
        t3.setText(str3);
    }
}