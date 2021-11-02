package com.eric.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Hw3P1 extends AppCompatActivity {

    private List<Animal> animals = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw3_p1);

        initAnimals();
        animalAdapter animalAdapter = new animalAdapter(animals,this);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(animalAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                animalAdapter name = (animalAdapter) adapterView.getAdapter().getItem(i);
                Toast.makeText(getApplicationContext(), name.data.get(i).getName(),Toast.LENGTH_LONG).show();
                // FC, don't know why
            }
        });

    }



    private void initAnimals(){
        Animal lion = new Animal("Lion",R.mipmap.lion);
        Animal cat = new Animal("Cat",R.mipmap.cat);
        Animal dog = new Animal("Dog",R.mipmap.dog);
        Animal elephant = new Animal("Elephant",R.mipmap.elephant);
        Animal tiger = new Animal("Tiger",R.mipmap.tiger);
        Animal monkey = new Animal("Monkey",R.mipmap.monkey);

        animals.add(lion);
        animals.add(cat);
        animals.add(dog);
        animals.add(elephant);
        animals.add(tiger);
        animals.add(monkey);
    }


}