package com.example.babarkhan.intent_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Next_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_);
        TextView txt2= (TextView) findViewById(R.id.txt2);
        Intent i=getIntent();
       String s= i.getStringExtra("input");
        txt2.setText("text is :"+s);






    }
}
