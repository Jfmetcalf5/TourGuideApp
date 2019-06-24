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
        houseItems.add(new HouseItem(R.string.hanging, R.string.aboveTable));
        houseItems.add(new HouseItem(R.string.inCeiling, R.string.aboveKitchen));
        houseItems.add(new HouseItem(R.string.dome, R.string.aboveLiving));
        houseItems.add(new HouseItem(R.string.wall, R.string.inBathroom));
        houseItems.add(new HouseItem(R.string.hanging, R.string.inDoorway));

        RoomAdapter adapter = new RoomAdapter(getActivity(), houseItems);

        ListView listView = rootView.findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        return rootView;
    }

}
