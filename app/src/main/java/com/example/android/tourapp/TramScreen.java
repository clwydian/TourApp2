package com.example.android.tourapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TramScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new TramScreenFrag())
                .commit();
    }
}