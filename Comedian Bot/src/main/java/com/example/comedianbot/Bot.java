package com.example.comedianbot;

import android.util.Log;

/* created by learnovate */
public class Bot {

    public final static String creatorName = "Spawrks";

    private String name = "ROBOT";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void talk (String whatToSay){
        Log.e(getName(),whatToSay);
    }
}
