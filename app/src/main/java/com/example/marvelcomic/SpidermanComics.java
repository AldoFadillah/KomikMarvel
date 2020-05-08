package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SpidermanComics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiderman_comics);
    }

    public void spiderman1(View view) {
        startActivity(new Intent(SpidermanComics.this, spiderman1.class));
    }

    public void spiderman2(View view) {
        startActivity(new Intent(SpidermanComics.this, spiderman2.class));
    }

    public void spiderman3(View view) {
        startActivity(new Intent(SpidermanComics.this, spiderman3.class));
    }

    public void spiderman4(View view) {
        startActivity(new Intent(SpidermanComics.this, spiderman4.class));
    }

    public void spiderman5(View view) {
        startActivity(new Intent(SpidermanComics.this, spiderman5.class));
    }

    public void spiderman6(View view) {
        startActivity(new Intent(SpidermanComics.this, spiderman6.class));
    }

    public void spiderman7(View view) {
        startActivity(new Intent(SpidermanComics.this, spiderman7.class));
    }

    public void spiderman8(View view) {
        startActivity(new Intent(SpidermanComics.this, spiderman8.class));
    }
}
