package com.example.yee.fitcoin.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.yee.fitcoin.LoginActivity;
import com.example.yee.fitcoin.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by YEE on 3/10/2018.
 */

public class LogTab extends Fragment implements View.OnClickListener {
    private EditText date;
    private EditText miles;
    private EditText time;
    private Button submit;
    private FirebaseDatabase db = FirebaseDatabase.getInstance();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.tab_log, container, false);
        String userID = getActivity().getIntent().getStringExtra(LoginActivity.KEY_USER_ID);
        date = view.findViewById(R.id.date);
        miles = view.findViewById(R.id.miles);
        time = view.findViewById(R.id.time);
        submit = view.findViewById(R.id.submit);
        submit.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        DatabaseReference myRef = db.getReference("log");
        myRef.setValue(date.getText()+","+miles.getText()+","+time.getText());
        Toast toast = Toast.makeText(getActivity(), "Submitted Successfully", Toast.LENGTH_SHORT);
        toast.show();
        date.getText().clear();
        miles.getText().clear();
        time.getText().clear();
    }
}
