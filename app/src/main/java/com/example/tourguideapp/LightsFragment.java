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
public class LightsFragment extends Fragment {


    public LightsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<HouseItem> houseItems = new ArrayList<HouseItem>();
        houseItems.add(new HouseItem("Hanging", "Above kitchen table"));
        houseItems.add(new HouseItem("In Ceiling", "Above kitchen sink"));
        houseItems.add(new HouseItem("Dome", "Above living room"));
        houseItems.add(new HouseItem("On Wall", "In bathroom"));
        houseItems.add(new HouseItem("Hanging", "In doorway"));

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
