package com.example.dagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2example.di.CarComponent;
import com.example.dagger2example.di.DaggerCarComponent;
import com.example.dagger2example.model.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
   @Inject  Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent carComponent = DaggerCarComponent.create();
         carComponent.inject(this);
        //  car = carComponent.getCar();
          car.drive();
    }
}