package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DoctorStrangeComics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_strange_comics);
    }

    public void doctorstrange(View view) {
        startActivity(new Intent(DoctorStrangeComics.this, doctorstrange.class));
    }
}
