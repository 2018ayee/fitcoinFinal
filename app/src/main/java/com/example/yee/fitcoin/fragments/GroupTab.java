package com.example.yee.fitcoin.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yee.fitcoin.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YEE on 3/10/2018.
 */

public class GroupTab extends Fragment {
    private List<Runner> runnerList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MyAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.tab_groups, container, false);
        recyclerView = (RecyclerView)view.findViewById(R.id.leaderboard);
        recyclerView.setHasFixedSize(false);

        recyclerView = (RecyclerView) view.findViewById(R.id.leaderboard);

        mAdapter = new MyAdapter(runnerList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareRunnerData();

        return view;
    }

    private void prepareRunnerData() {
        Runner runner = new Runner("Mad Max: Fury Road", 45, 8.5);
        runnerList.add(runner);

        runner = new Runner("Inside Out", 20, 6.5);
        runnerList.add(runner);
        mAdapter.notifyDataSetChanged();
    }
}