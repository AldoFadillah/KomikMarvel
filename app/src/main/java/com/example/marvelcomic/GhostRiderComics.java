package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GhostRiderComics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghost_rider_comics);
    }

    public void ghostrider3(View view) {
        startActivity(new Intent(GhostRiderComics.this, ghostrider3.class));
    }

    public void ghostrider2(View view) {
        startActivity(new Intent(GhostRiderComics.this, ghostrider2.class));
    }

    public void ghostrider1(View view) {
        startActivity(new Intent(GhostRiderComics.this, ghostrider1.class));
    }
}
