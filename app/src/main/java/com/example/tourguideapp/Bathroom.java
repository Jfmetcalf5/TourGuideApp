package com.example.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


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

        View rootView = inflater.inflate(R.layout.fragment_room_template, container, false);

        TextView sqrftTextView = rootView.findViewById(R.id.sqrft);
        sqrftTextView.setText(R.string.bath_sqrft);

        TextView detailsTextView = rootView.findViewById(R.id.details);
        detailsTextView.setText(R.string.bath_details);

        ImageView imageView = rootView.findViewById(R.id.image_view);
        imageView.setImageResource(R.mipmap.bathroom);

        return rootView;
    }

}
