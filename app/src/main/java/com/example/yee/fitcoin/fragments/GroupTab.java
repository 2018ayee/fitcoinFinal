package com.example.yee.fitcoin.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yee.fitcoin.R;

/**
 * Created by YEE on 3/10/2018.
 */

public class GroupTab extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.tab_groups, container, false);
        return view;
    }
}