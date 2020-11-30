package com.example.abstractclassesandinterfaces;

import android.util.Log;

/* created by learnovate */
public class Light extends Device implements Switchable {

    public Light() {
        setDeviceName("LIGHT");
    }

    @Override
    public void breakDevice() {
        Log.e(getDeviceName(), "Glass everywhere");
    }

    public void turnOn() {
        Log.e(getDeviceName(),"Now i can see. there are my keys");
    }

    public void turnOff() {
        Log.e(getDeviceName(),"why is it so dark");
    }
}
