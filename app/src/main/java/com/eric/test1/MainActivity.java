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

        Button h2p1 = (Button) findViewById(R.id.btn_hw2p1);
        h2p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, hw2p1.class);
                startActivity(intent);
            }
        });

        Button h2p2 = (Button) findViewById(R.id.btn_hw2p1);
        h2p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, hw2p2.class);
                startActivity(intent);
            }
        });

        Button h2p3 = (Button) findViewById(R.id.btn_hw2p1);
        h2p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, hw2p3.class);
                startActivity(intent);
            }
        });


    }

}