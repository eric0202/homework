package com.eric.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.SingleLineTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Homework4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework4);

        EditText ed1 = findViewById(R.id.webtext);

        Button btn1 = findViewById(R.id.btn_web);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = ed1.getText().toString();
                String site_address;
                if(input.startsWith("http")){
                    site_address = input;
                }else{
                    site_address = "http://"+ input;
                }

                try {
                    Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse(site_address));
                    startActivity(intent1);
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Please input a correct site address",Toast.LENGTH_LONG).show();
                }

            }
        });

    }



}