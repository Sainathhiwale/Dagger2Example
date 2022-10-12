package com.example.dagger2example.di.modules;

import com.example.dagger2example.model.Wheel;
import com.example.dagger2example.model.parts.Rims;
import com.example.dagger2example.model.parts.Tires;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    Rims providesRims(){
        return new Rims();
    }
    @Provides
    Tires providesTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }
    @Provides
    Wheel providesWheel(Rims rims,Tires tires){
        return new Wheel(rims,tires);
    }
}
