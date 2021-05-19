package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    Button appA;
    Button appB;
    Button appC;
    Button appD;
    String str1 = "9:30";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appA = (Button)findViewById(R.id.app_a);
        Timer t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Date dt = new Date();
                int hours = dt.getHours();
                int minutes= dt.getMinutes();
                String strDate = hours +":"+minutes;
                //appA.setText(strDate);

                if (strDate.equals(str1)) {
                    appA.setText("APP A ON");
                } else {
                    //text1.setText("APP OFF");
                }

            }
        }, 0, 1000);

        appB = (Button)findViewById(R.id.app_b);
        appC = (Button)findViewById(R.id.app_c);
        appD = (Button)findViewById(R.id.app_d);

        appA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appA();
            }
        });
        appB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appB();
            }
        });
        appC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appC();
            }
        });
        appD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appD();
            }
        });

    }

    public void appA(){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
    public void appB(){
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
    public void appC(){
        Intent intent = new Intent(this,MainActivity4.class);
        startActivity(intent);
    }
    public void appD(){
        Intent intent = new Intent(this,MainActivity5.class);
        startActivity(intent);
    }

}