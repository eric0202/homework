package com.eric.test1;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintSet;

import org.w3c.dom.Text;

import java.util.List;

public class animalAdapter extends BaseAdapter {
    public List<Animal> data;
    private Context context;

    public animalAdapter(List<Animal> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.animal_item,parent,false);
        }
        TextView textView = convertView.findViewById(R.id.animalName);
        ImageView imageView = convertView.findViewById(R.id.animalImage);
        textView.setText(data.get(position).getName());
        imageView.setImageResource(data.get(position).getImg());
        return convertView;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }



    @Override
    public long getItemId(int position) {
        return position;
    }
}
