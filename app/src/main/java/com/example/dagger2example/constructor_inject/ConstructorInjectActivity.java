package com.example.dagger2example.constructor_inject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2example.R;

public class ConstructorInjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constructor_inject);
    }
}