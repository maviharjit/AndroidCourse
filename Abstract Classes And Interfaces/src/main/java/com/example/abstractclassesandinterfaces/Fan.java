package com.example.abstractclassesandinterfaces;

import android.util.Log;

/* created by learnovate */
public class Fan extends Device {

    public Fan() {
        setDeviceName("FAN");
    }

    public void breakDevice() {
        Log.e(getDeviceName(),"Bang, Crash ....oops");
    }
}
