package com.example.yee.fitcoin.ui;

/**
 * Created by YEE on 3/10/2018.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.yee.fitcoin.fragments.GroupTab;
import com.example.yee.fitcoin.fragments.HomeTab;
import com.example.yee.fitcoin.fragments.LogTab;
import com.example.yee.fitcoin.fragments.ProfileTab;


public class HomePagerAdapter extends FragmentStatePagerAdapter {
    private int mNumOfTabs;

    public HomePagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HomeTab();
            case 1:
                return new GroupTab();
            case 2:
                return new LogTab();
            case 3:
                return new ProfileTab();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
