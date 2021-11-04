package com.eric.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Homework3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework3);
    }

    public void myClick(View v){
        Intent intent;
        switch (v.getId()){
            case R.id.btn_hw3p1:
                intent = new Intent(Homework3Activity.this, Hw3P1.class);
                startActivity(intent);
                break;
            case R.id.btn_hw3p2:
                intent = new Intent(Homework3Activity.this, Hw3P2.class);
                startActivity(intent);
                break;
            case R.id.btn_hw3p3:
                intent = new Intent(Homework3Activity.this, Hw3P3.class);
                startActivity(intent);
                break;
            case R.id.btn_hw3p4:
                intent = new Intent(Homework3Activity.this,Hw3P4.class);
                startActivity(intent);
                break;
        }
    }
}