package com.eric.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void myClick(View v){
        Intent intent;
        switch (v.getId()){
            case R.id.btn_hw2:
                intent = new Intent(MainActivity.this, Homework2Activity.class);
                startActivity(intent);
                break;
            case R.id.btn_hw3:
                intent = new Intent(MainActivity.this, Homework3Activity.class);
                startActivity(intent);
                break;
            case R.id.btn_hw4:
                intent = new Intent(MainActivity.this, Homework4Activity.class);
                startActivity(intent);
                break;
        }
    }


}