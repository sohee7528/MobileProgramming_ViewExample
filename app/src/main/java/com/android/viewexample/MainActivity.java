package com.android.viewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {
    Chronometer chrono;
    Button btnStart, btnEnd;
    RadioButton rdoCal, rdoTime;
    CalendarView calView;
    TimePicker tPicker;
    TextView tvYear, tvMonth, tvDay, tvHour, tvMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("시간예약");

        chrono= findViewById(R.id.chronometer1);

        btnStart = findViewById(R.id.btnStart);
        btnEnd = findViewById(R.id.btnEnd);

        rdoCal = findViewById(R.id.rdoCal);
        rdoTime = findViewById(R.id.rdoTime);

        calView=findViewById(R.id.calendarView1);
        tPicker=findViewById(R.id.timePicker1);

        tvYear=findViewById(R.id.tvYear);
        tvMonth=findViewById(R.id.tvMonth);
        tvDay=findViewById(R.id.tvDay);
        tvHour=findViewById(R.id.tvHour);
        tvMinute=findViewById(R.id.tvMinute);

        calView.setVisibility(View.INVISIBLE);
        tPicker.setVisibility(View.INVISIBLE);

    }
}