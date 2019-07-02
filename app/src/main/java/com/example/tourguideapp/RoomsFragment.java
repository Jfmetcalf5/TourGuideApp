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
public class RoomsFragment extends Fragment {


    public RoomsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        ArrayList<HouseItem> houseItems = new ArrayList<HouseItem>();
        houseItems.add(new HouseItem(R.string.bedroom, R.string.s120, R.drawable.bedroom));
        houseItems.add(new HouseItem(R.string.bathroom, R.string.s8, R.drawable.bathroom));
        houseItems.add(new HouseItem(R.string.outside, R.string.s1500, R.drawable.outside));
        houseItems.add(new HouseItem(R.string.kitchen, R.string.s150, R.drawable.kitchen));

        RoomAdapter adapter = new RoomAdapter(getActivity(), houseItems);

        ListView listView = rootView.findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        return rootView;
    }

}
