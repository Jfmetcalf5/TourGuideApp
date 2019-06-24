package com.example.tourguideapp;

import android.media.Image;

public class HouseItem {

    private String mdescription;
    private String mdetails;

    public HouseItem(String description, String details) {
        mdescription = description;
        mdetails = details;
    }

    public String getDescription() { return mdescription; }
    public String getDetails() {
        return mdetails;
    }
}
