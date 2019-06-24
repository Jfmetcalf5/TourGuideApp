package com.example.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RoomAdapter extends ArrayAdapter<HouseItem> {

    public RoomAdapter(Activity context, ArrayList<HouseItem> houseItems) {
        super(context, 0, houseItems);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        HouseItem houseItem = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout, parent, false);
        }

        TextView sqrftTextView = listItemView.findViewById(R.id.sqrft);
        sqrftTextView.setText(houseItem.getDescription());

        TextView detailsTextView = listItemView.findViewById(R.id.details);
        detailsTextView.setText(houseItem.getDetails());

        return listItemView;
    }
}
