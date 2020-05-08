package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CaptainAmericaComics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_captain_america_comics);
    }

    public void captainamerica1(View view) {
        startActivity(new Intent(CaptainAmericaComics.this, captainamerica1.class));
    }

    public void captainamerica2(View view) {
        startActivity(new Intent(CaptainAmericaComics.this, captainamerica2.class));
    }

    public void captainamerica3(View view) {
        startActivity(new Intent(CaptainAmericaComics.this, captainamerica3.class));
    }

    public void captainamerica4(View view) {
        startActivity(new Intent(CaptainAmericaComics.this, captainamerica4.class));
    }

    public void captainamerica5(View view) {
        startActivity(new Intent(CaptainAmericaComics.this, captainamerica5.class));
    }

    public void captainamerica6(View view) {
        startActivity(new Intent(CaptainAmericaComics.this, captainamerica6.class));
    }
}
