package com.example.dagger2example.model;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    public static final String TAG ="Car";
    private Engine engine;
    private Wheel wheel;
     @Inject
    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public void drive(){
        Log.d(TAG, "driving.......");
    }
}
