package com.example.master.handlertimer;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Handler handler;
    int timer=3;
    Runnable runnable=new Runnable() {
        @Override
        public void run() {
            if (timer!=0) {
                timer = timer - 1;
                String a = String.valueOf(timer);
                textView.setText(a);
                handler.postDelayed(this, 1000);
            }
            else {
                Intent intent=new Intent(MainActivity.this,FoodList.class);
                startActivity(intent);
            }

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textVievTimer);
        handler=new Handler();
        handler.post(runnable);

    }


}
