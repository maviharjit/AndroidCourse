package com.example.abstractclassesandinterfaces;

import android.util.Log;

/* created by learnovate */
public class Fan extends Device implements Switchable {

    public Fan() {
        setDeviceName("FAN");
    }

    public void breakDevice() {
        Log.e(getDeviceName(),"Bang, Crash ....oops");
    }

    public void turnOn() {
        Log.e(getDeviceName(),"thank God for the cool breeze");
    }

    public void turnOff() {
        Log.e(getDeviceName(),"it is hot in here");
    }
}
