package com.example.abstractclassesandinterfaces;

import android.util.Log;

/* created by learnovate */
public class Light extends Device {

    public Light() {
        setDeviceName("LIGHT");
    }

    @Override
    public void breakDevice() {
        Log.e(getDeviceName(), "Glass everywhere");
    }
}
