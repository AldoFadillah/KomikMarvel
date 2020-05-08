package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IronManComics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iron_man_comics);
    }

    public void ironman1(View view) {
        startActivity(new Intent(IronManComics.this, ironman1.class));
    }

    public void ironman2(View view) {
        startActivity(new Intent(IronManComics.this, ironman2.class));
    }

    public void ironman3(View view) {
        startActivity(new Intent(IronManComics.this, ironman3.class));
    }

    public void ironman4(View view) {
        startActivity(new Intent(IronManComics.this, ironman4.class));
    }

    public void ironman5(View view) {
        startActivity(new Intent(IronManComics.this, ironman5.class));
    }

    public void ironman6(View view) {
        startActivity(new Intent(IronManComics.this, ironman6.class));
    }

    public void ironman7(View view) {
        startActivity(new Intent(IronManComics.this, ironman7.class));
    }

    public void ironman8(View view) {
        startActivity(new Intent(IronManComics.this, ironman8.class));
    }
}
