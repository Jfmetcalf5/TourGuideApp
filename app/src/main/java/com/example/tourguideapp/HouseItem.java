package com.example.tourguideapp;

public class HouseItem {

    private int mdescription;
    private int mdetails;
    private int mImage;

    public HouseItem(int description, int details) {
        mdescription = description;
        mdetails = details;
    }

    public HouseItem(int description, int details, int image) {
        mdescription = description;
        mdetails = details;
        mImage = image;
    }

    public int getDescription() { return mdescription; }
    public int getDetails() {
        return mdetails;
    }
    public int getImage() {
        return mImage;
    }
}
