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
        houseItems.add(new HouseItem(R.string.frontIn, R.string.white));
        houseItems.add(new HouseItem(R.string.frontOut, R.string.white));
        houseItems.add(new HouseItem(R.string.garage, R.string.car2));
        houseItems.add(new HouseItem(R.string.screenIn, R.string.redCurtains));
        houseItems.add(new HouseItem(R.string.screenOut, R.string.balcony));

        RoomAdapter adapter = new RoomAdapter(getActivity(), houseItems);

        ListView listView = rootView.findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        return rootView;
    }

}
