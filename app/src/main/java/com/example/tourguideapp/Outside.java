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
public class Outside extends Fragment {


    public Outside() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        TextView sqrftTextView = rootView.findViewById(R.id.sqrft);
        sqrftTextView.setText(R.string.out_sqrft);

        TextView detailsTextView = rootView.findViewById(R.id.details);
        detailsTextView.setText(R.string.out_details);

        ImageView imageView = rootView.findViewById(R.id.image_view);
        imageView.setImageResource(R.mipmap.outside);

        return rootView;
    }

}
