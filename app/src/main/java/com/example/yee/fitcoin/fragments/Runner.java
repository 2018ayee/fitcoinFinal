package com.example.yee.fitcoin.fragments;

/**
 * Created by Lilian on 3/10/2018.
 */

public class Runner {
        private String name;
        private double money, time;

        public Runner() {
        }

        public Runner(String name, double money, double time) {
            this.name = name;
            this.money = money;
            this.time = time;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getMoney() {
            return money;
        }

        public void setMoney(double money) {
            this.money = money;
        }

        public double getTime() {
            return time;
        }

        public void setTime(double time) {
            this.time = time;
        }
}
