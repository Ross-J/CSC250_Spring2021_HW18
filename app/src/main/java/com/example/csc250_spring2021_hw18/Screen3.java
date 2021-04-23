package com.example.csc250_spring2021_hw18;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Screen3 extends AppCompatActivity
{
    private TextView sqrRootTV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        this.sqrRootTV = this.findViewById(R.id.sqrRootTV);

        double factorialValue = this.getIntent().getDoubleExtra("factorialValue", 0);
        double sqrtOfFactorialValue = Math.sqrt(factorialValue);
        this.sqrRootTV.setText("" + sqrtOfFactorialValue);
    }
}