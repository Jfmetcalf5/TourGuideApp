package com.example.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Bedroom extends Fragment {


    public Bedroom() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        
        View rootView = inflater.inflate(R.layout.fragment_room_template, container, false);

        TextView sqrftTextView = rootView.findViewById(R.id.sqrft);
        sqrftTextView.setText(R.string.bed_sqrft);

        TextView detailsTextView = rootView.findViewById(R.id.details);
        detailsTextView.setText(R.string.bed_details);

        ImageView imageView = rootView.findViewById(R.id.image_view);
        imageView.setImageResource(R.mipmap.bedroom);

        return rootView;
    }

}
