package com.example.yee.fitcoin.fragments;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.yee.fitcoin.R;

import java.util.List;

/**
 * Created by Lilian on 3/10/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

        private List<Runner> runnersList;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView name, money, time;

            public MyViewHolder(View view) {
                super(view);
                name = (TextView) view.findViewById(R.id.name);
                money = (TextView) view.findViewById(R.id.money);
                time = (TextView) view.findViewById(R.id.time);
            }
        }


        public MyAdapter(List<Runner> runnersList) {
            this.runnersList = runnersList;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.runner_list_row, parent, false);

            return new MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            Runner runner = runnersList.get(position);
            holder.name.setText(runner.getName());
            holder.money.setText(""+runner.getMoney());
            holder.time.setText(""+runner.getTime());
        }

        @Override
        public int getItemCount() {
            return runnersList.size();
        }
    }
