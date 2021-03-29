package com.example.dagger2example.model;


import com.example.dagger2example.model.parts.Rims;
import com.example.dagger2example.model.parts.Tires;

public class Wheel {
    //we don't own this class so we can't annotate it with @Inject
    private Rims rims;
    private Tires tires;

    public Wheel(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
