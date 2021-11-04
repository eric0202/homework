package com.eric.test1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hw3P2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw3_p2);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);


        Button button = findViewById(R.id.adButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                builder.setView(R.layout.dialog_layout);
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
      }
}