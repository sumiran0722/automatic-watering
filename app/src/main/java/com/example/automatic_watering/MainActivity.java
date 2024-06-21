package com.example.automatic_watering;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private TextView tv_today, tv_soil, tv_soli_info, tv_count;
    private ImageButton btn_watring;
    long mNow;
    Date mDate;
    SimpleDateFormat mFormat = new SimpleDateFormat("yyyy년 MM월 dd일");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_today = findViewById(R.id.Tv_today);
        tv_soil = findViewById(R.id.Tv_soil);
        tv_soli_info = findViewById(R.id.Tv_soil_info);
        tv_count = findViewById(R.id.Tv_count);
        btn_watring = findViewById(R.id.Btn_watering);

        tv_today.setText(getTime());


    }

    private String getTime(){
        mNow = System.currentTimeMillis();
        mDate = new Date(mNow);
        return mFormat.format(mDate);
    }
}