package com.eric.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Hw3P4 extends AppCompatActivity {
    private List<Animal> animals = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw3_p4);

        initAnimals();
        animalAdapter animalAdapter = new animalAdapter(animals,this);
        ListView listView = findViewById(R.id.lv_menu);
        listView.setAdapter(animalAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext(),animals.get(i).getName(),Toast.LENGTH_SHORT).show();

            }
        });

        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE_MODAL);
        listView.setMultiChoiceModeListener(new AbsListView.MultiChoiceModeListener() {
            @Override
            public void onItemCheckedStateChanged(ActionMode mode, int position, long id, boolean checked) {
                if(checked == true){

                }
            }

            @Override
            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                mode.getMenuInflater().inflate(R.menu.dl_animal, menu);
                return true;
            }

            @Override
            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                return false;
            }

            @Override
            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
                return false;
            }

            @Override
            public void onDestroyActionMode(ActionMode mode) {

            }
        });


    }


    ActionMode.Callback cb = new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            getMenuInflater().inflate(R.menu.dl_animal,menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            return false;
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {

        }
    };

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