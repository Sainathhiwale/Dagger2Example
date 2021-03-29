package com.example.dagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2example.di.CarComponent;
import com.example.dagger2example.di.DaggerCarComponent;
import com.example.dagger2example.model.Car;

public class MainActivity extends AppCompatActivity {
   private Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent carComponent = DaggerCarComponent.create();
          car = carComponent.getCar();
          car.drive();
    }
}