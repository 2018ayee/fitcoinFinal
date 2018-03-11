package com.example.yee.fitcoin.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.yee.fitcoin.LoginActivity;
import com.example.yee.fitcoin.R;

/**
 * Created by YEE on 3/10/2018.
 */

public class ProfileTab extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        String userID = getActivity().getIntent().getStringExtra(LoginActivity.KEY_USER_ID);
        View view = inflater.inflate(R.layout.tab_profile, container, false);
        TextView tv1 = (TextView) view.findViewById(R.id.user_text);
        tv1.setText(userID);
        return view;
    }
}
