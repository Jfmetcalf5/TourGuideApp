package com.example.tourguideapp;

import android.media.Image;

public class Room {

    private String msqrft;
    private String mdetails;
    private int imageId;

    public Room(String sqrft, String details, int imageId) {
        msqrft = sqrft;
        mdetails = details;
    }

    public String getSft() {
        return msqrft;
    }
    public String getDetails() {
        return mdetails;
    }
    public int getImageId() {
        return imageId;
    }
}
