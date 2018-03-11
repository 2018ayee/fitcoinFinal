package com.example.yee.fitcoin.fragments;

/**
 * Created by YEE on 3/11/2018.
 */

public class LogItem {
    private String date;
    private double miles;
    private double time;
    public LogItem(String d, double m, double t){
        date = d;
        miles = m;
        time = t;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
