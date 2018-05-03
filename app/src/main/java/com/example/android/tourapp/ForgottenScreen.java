package com.example.android.tourapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ForgottenScreen extends AppCompatActivity {
// Is badly named as its now is about the Spanish Bar
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new ForgottenScreenFrag())
                .commit();
    }
}
