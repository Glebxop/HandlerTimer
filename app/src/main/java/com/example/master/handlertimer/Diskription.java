package com.example.master.handlertimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class Diskription extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diskription);
        TextView textView=(TextView)findViewById(R.id.textView);
        Intent intent=getIntent();
       String foodname= Objects.requireNonNull(intent.getExtras()).getString("foodname","");
       String foodNumber=intent.getExtras().getString("foodnumber","");
       String s=foodname+"  "+foodNumber;
       textView.setText(s);
    }

}
