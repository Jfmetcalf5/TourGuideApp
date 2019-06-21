package com.example.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Bathroom extends Fragment {


    public Bathroom() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        ArrayList<Room> rooms = new ArrayList<Room>();
        rooms.add(new Room("120", "Hi", R.mipmap.bedroom));
        rooms.add(new Room("8", "Hi", R.mipmap.bathroom));
        rooms.add(new Room("1500", "Hi", R.mipmap.outside));
        rooms.add(new Room("150", "Hi", R.mipmap.kitchen));

        RoomAdapter adapter = new RoomAdapter(getActivity(), rooms);

        ListView listView = rootView.findViewById(R.id.listView);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        TextView sqrftTextView = rootView.findViewById(R.id.sqrft);
        sqrftTextView.setText(R.string.bath_sqrft);

        TextView detailsTextView = rootView.findViewById(R.id.details);
        detailsTextView.setText(R.string.bath_details);

        ImageView imageView = rootView.findViewById(R.id.image_view);
        imageView.setImageResource(R.mipmap.bathroom);

        return rootView;
    }

}
