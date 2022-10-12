package com.example.dagger2example.model;

import android.util.Log;

import javax.inject.Inject;

public class Remote {
    public static final String TAG="Car";
    @Inject
    public Remote() {
    }
    public void setListener(Car car){
        Log.d(TAG, "Remote connected");
    }


}
