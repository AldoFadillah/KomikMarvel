package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CivilWarComics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_war_comics);
    }

    public void civilwar1(View view) {
        startActivity(new Intent(CivilWarComics.this, civilwar1.class));
    }

    public void civilwar2(View view) {
        startActivity(new Intent(CivilWarComics.this, civilwar2.class));
    }

    public void civilwar3(View view) {
        startActivity(new Intent(CivilWarComics.this, civilwar3.class));
    }

    public void civilwar4(View view) {
        startActivity(new Intent(CivilWarComics.this, civilwar4.class));
    }
}
