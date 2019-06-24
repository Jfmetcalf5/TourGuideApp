package com.example.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class DoorsFragment extends Fragment {


    public DoorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<HouseItem> houseItems = new ArrayList<HouseItem>();
        houseItems.add(new HouseItem("Front In", "White"));
        houseItems.add(new HouseItem("Front Out", "White"));
        houseItems.add(new HouseItem("Garage", "2-Car"));
        houseItems.add(new HouseItem("Screen In", "Red Curtains"));
        houseItems.add(new HouseItem("Screen Out", "Balcony"));

        RoomAdapter adapter = new RoomAdapter(getActivity(), houseItems);

        ListView listView = rootView.findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        return rootView;
    }

}
