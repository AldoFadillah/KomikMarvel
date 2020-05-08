package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AvengersComics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avengers_comics);
    }

    public void avengers1(View view) {
        startActivity(new Intent(AvengersComics.this, avengers1.class));
    }

    public void avengers2(View view) {
        startActivity(new Intent(AvengersComics.this, avengers2.class));
    }

    public void avengers3(View view) {
        startActivity(new Intent(AvengersComics.this, avengers3.class));
    }

    public void avengers4(View view) {
        startActivity(new Intent(AvengersComics.this, avengers4.class));
    }

    public void avengers5(View view) {
        startActivity(new Intent(AvengersComics.this, avengers5.class));
    }
}
