package com.example.csc250_spring2021_hw18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    private EditText numberET;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.numberET = this.findViewById(R.id.numberET);
    }

    public void onEnterButtonPressed(View v)
    {
        String num = this.numberET.getText().toString();
        Intent i = new Intent(this, Screen2.class);
        i.putExtra("number", num);
        this.startActivity(i);
    }
}