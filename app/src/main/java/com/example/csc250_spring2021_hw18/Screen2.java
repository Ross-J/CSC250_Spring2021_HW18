package com.example.csc250_spring2021_hw18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Screen2 extends AppCompatActivity
{
    private TextView factorialTV;
    private double factorialValue;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        this.factorialTV = this.findViewById(R.id.factorialTV);
        int num = Integer.parseInt(this.getIntent().getStringExtra("number"));
        this.factorialValue = factorial(num);
        this.factorialTV.setText("" + this.factorialValue);
    }

    public int factorial(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        else
        {
            return n * factorial(n - 1);
        }
    }

    public void onCalculateSqrRootButtonPressed(View v)
    {
        Intent i = new Intent(this, Screen3.class);
        i.putExtra("factorialValue", this.factorialValue);
        this.startActivity(i);
    }


}