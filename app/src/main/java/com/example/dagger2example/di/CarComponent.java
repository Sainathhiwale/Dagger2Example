package com.example.dagger2example.di;

import com.example.dagger2example.model.Car;

import dagger.Component;

@Component
public interface CarComponent {
    Car getCar();
}
