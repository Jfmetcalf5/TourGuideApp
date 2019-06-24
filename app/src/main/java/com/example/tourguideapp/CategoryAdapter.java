package com.example.tourguideapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.ImageView;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public int getCount() { return 4; }

    @Override
    public Fragment getItem(int i) {
        if (i == 0) {
            return new RoomsFragment();
        } else if (i == 1) {
            return new LightsFragment();
        } else if (i == 2) {
            return new DoorsFragment();
        } else {
            return new AppliancesFragment();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_rooms);
        } else if (position == 1) {
            return mContext.getString(R.string.category_lights);
        } else if (position == 2) {
            return mContext.getString(R.string.category_doors);
        } else {
            return mContext.getString(R.string.category_appliances);
        }
    }
}
