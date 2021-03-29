package com.example.dagger2example.model;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    public static final String TAG ="Car";
    @Inject Engine engine; // field injection
    private Wheel wheel;

    //constructor injection
     @Inject
    public Car( Wheel wheel) {
        this.wheel = wheel;
    }

    //method injection
    @Inject
    public void enableRemote(Remote remote){
         remote.setListener(this);
    }
    public void drive(){
        Log.d(TAG, "driving.......");
    }
}
