package com.example.dagger2example.di;

import com.example.dagger2example.MainActivity;
import com.example.dagger2example.di.modules.WheelsModule;
import com.example.dagger2example.model.Car;

import dagger.Component;
import dagger.Module;

@Component(modules = WheelsModule.class)
public interface CarComponent {
    Car getCar();
    //field injection
    void inject(MainActivity mainActivity);
}
