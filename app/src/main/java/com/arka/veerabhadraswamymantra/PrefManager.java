package com.arka.veerabhadraswamymantra;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PrefManager extends ArrayAdapter<Item> {

    ArrayList<Item> animalList = new ArrayList<>();

    public PrefManager(Context context, int textViewResourceId, ArrayList<Item> objects) {
        super(context, textViewResourceId, objects);
        animalList = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.custom_list_view, null);
        TextView textView = (TextView) v.findViewById(R.id.textView);
        textView.setText(animalList.get(position).getAnimalName());

        return v;

    }

}
