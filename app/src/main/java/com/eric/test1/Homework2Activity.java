package com.eric.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Homework2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework2);
    }

    public void myClick(View v){
        Intent intent;
        switch (v.getId()){
            case R.id.btn_hw2p1:
                intent = new Intent(Homework2Activity.this, hw2p1.class);
                startActivity(intent);
                break;
            case R.id.btn_hw2p2:
                intent = new Intent(Homework2Activity.this, hw2p2.class);
                startActivity(intent);
                break;
            case R.id.btn_hw2p3:
                intent = new Intent(Homework2Activity.this, hw2p3.class);
                startActivity(intent);
        }
    }
}