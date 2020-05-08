package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DeadpoolComics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deadpool_comics);
    }

    public void deadpool1(View view) {
        startActivity(new Intent(DeadpoolComics.this, deadpool1.class));
    }

    public void deadpool2(View view) {
        startActivity(new Intent(DeadpoolComics.this, deadpool2.class));
    }

    public void deadpool3(View view) {
        startActivity(new Intent(DeadpoolComics.this, deadpool3.class));
    }
}
