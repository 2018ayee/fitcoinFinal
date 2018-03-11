package com.example.yee.fitcoin.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.yee.fitcoin.LoginActivity;
import com.example.yee.fitcoin.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;

import static android.content.ContentValues.TAG;

/**
 * Created by YEE on 3/10/2018.
 */

public class LogTab extends Fragment implements View.OnClickListener {
    private EditText date;
    private EditText miles;
    private EditText time;
    private Button submit;
    private FirebaseDatabase db = FirebaseDatabase.getInstance();
    private DatabaseReference myRef;
    private String userID;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.tab_log, container, false);
        userID = getActivity().getIntent().getStringExtra(LoginActivity.KEY_USER_ID);
        myRef = db.getReference(userID);
        date = view.findViewById(R.id.date);
        miles = view.findViewById(R.id.miles);
        time = view.findViewById(R.id.time);
        submit = view.findViewById(R.id.submit);
        submit.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });
        String d = "" + date.getText();
        String m = "" + miles.getText();
        String t = "" + time.getText();

        LogItem newLog = new LogItem("" + date.getText(), Double.parseDouble(m), Double.parseDouble(t));
        Date currentTime = Calendar.getInstance().getTime();
        myRef.child("Log " + currentTime.toString()).setValue(newLog);
        Toast toast = Toast.makeText(getActivity(), "Eskeeeetit!", Toast.LENGTH_SHORT);
        toast.show();
        date.getText().clear();
        miles.getText().clear();
        time.getText().clear();
    }
}
