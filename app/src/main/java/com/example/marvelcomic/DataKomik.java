package com.example.marvelcomic;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class DataKomik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showData();
    }
    private void showData(){
        String nama = getIntent().getExtras().getString("NamaKomik");

        switch (nama){
            case "Captain Amerika":
                startActivity(new Intent(DataKomik.this, CaptainAmericaComics.class));
                break;

            case "Ironman":
                startActivity(new Intent(DataKomik.this, IronManComics.class));
                break;

            case "Deadpool":
                startActivity(new Intent(DataKomik.this, DeadpoolComics.class));
                break;

            case "Spiderman":
                startActivity(new Intent(DataKomik.this, SpidermanComics.class));
                break;

            case "Civil Wars":
                startActivity(new Intent(DataKomik.this, CivilWarComics.class));
                break;

            case "Avengers":
                startActivity(new Intent(DataKomik.this, AvengersComics.class));
                break;

            case "Doctor Strange":
                startActivity(new Intent(DataKomik.this, DoctorStrangeComics.class));
                break;

            case "Ghost Rider":
                startActivity(new Intent(DataKomik.this, GhostRiderComics.class));
                break;

            case "Age Of Ultron":
                startActivity(new Intent(DataKomik.this, UltronComics.class));
                break;
        }
    }
}
