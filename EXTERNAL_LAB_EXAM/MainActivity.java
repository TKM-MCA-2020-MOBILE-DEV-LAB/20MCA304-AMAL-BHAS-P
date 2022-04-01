package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    Button b1;
    String str1,str2,str3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        e3=findViewById(R.id.e3);
        b1=findViewById(R.id.button);
    }
    public void callSecondActivity(View view)
    {
        Intent i = new Intent(MainActivity.this,MainActivity2.class);
        str1="Name:         "+e1.getText().toString();
        i.putExtra("value1",str1);
        str2="Address:      "+e2.getText().toString();
        i.putExtra("value2",str2);
        str3="Phone Number: "+e3.getText().toString();
        i.putExtra("value3",str3);

        startActivity(i);

    }
}