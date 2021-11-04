package com.eric.test1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


public class Hw3P3 extends AppCompatActivity {



    private TextView tv_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Menu test");
        setContentView(R.layout.activity_hw3_p3);
        tv_test = (TextView) findViewById(R.id.tv_test);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.h3p3_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.tc_red:
                tv_test.setTextColor(Color.RED);
                break;
            case R.id.tc_black:
                tv_test.setTextColor(Color.BLACK);
                break;
            case R.id.ts_small:
                tv_test.setTextSize(10);
                break;
            case R.id.ts_medium:
                tv_test.setTextSize(16);
                break;
            case R.id.ts_large:
                tv_test.setTextSize(20);
                break;
            case R.id.norm:
                Toast.makeText(this,"You clicked item normal!",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}