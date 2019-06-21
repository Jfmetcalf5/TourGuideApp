package com.example.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RoomAdapter extends ArrayAdapter<Room> {

    public RoomAdapter(Activity context, ArrayList<Room> rooms) {
        super(this, 0, rooms);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Room room = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout, parent, false);
        }

        TextView sqrftTextView = listItemView.findViewById(R.id.sqrft);
        sqrftTextView.setText(room.getSft());

        TextView detailsTextView = listItemView.findViewById(R.id.details);
        detailsTextView.setText(room.getDetails());

        ImageView imageView = listItemView.findViewById(R.id.image_view);
        imageView.setImageResource(room.getImageId());
        return listItemView;

//        return super.getView(position, convertView, parent);
    }

    //        public RoomAdapter(Activity context, ArrayList<Room> rooms) {
//            super(this, 0, rooms);
//        }

//        @NonNull
//        @Override
//        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//
//            Word word = getItem(position);
//
//            View listItemView = convertView;
//            if (listItemView == null) {
//                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
//            }
//
//            TextView defaultWord = listItemView.findViewById(R.id.english);
//            defaultWord.setText(word.getDefaultTranslation());
//
//            TextView miwokWord = listItemView.findViewById(R.id.miwok);
//            miwokWord.setText(word.getMiwokTranslation());
//
////        ImageView imageView = (ImageView) listItemView.findViewById(R.id.)
////        imageView.setImageResource();
//            return listItemView;
//        }
}
