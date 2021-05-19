package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Calendar;


public class MainActivity2 extends AppCompatActivity {
    Button button;
    Timer currentTime;
    //String str2 = currentTime.toString();

    String str1 = "9:30";
    TextView text1;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        button = (Button)findViewById(R.id.buttonBack);
        text = (TextView)findViewById(R.id.app_off);
        text1 = (TextView)findViewById(R.id.app);


        Timer t = new Timer();


        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Date dt = new Date();
                int hours = dt.getHours();
                int minutes= dt.getMinutes();
                String strDate = hours +":"+minutes;
                text.setText(strDate);

                if (strDate.equals(str1)) {
                        text1.setText("APP ON");
                    } else {
                        text1.setText("APP OFF");
                    }

            }
        }, 0, 1000);

        /*
        @Override
        public void run() {
            if (strDate.equals(str1)) {
                text1.setText("APP ON");
            } else {
                text1.setText("APP OFF");
            }
        }

         */
        //text1.setText(str1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();
            }
        });
        //currentTime = findViewById(R.id.textClock);

    }
    public void back(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}