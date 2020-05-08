package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class avengers1 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.avengers1,R.drawable.avengers1chapter1, R.drawable.avengers1chapter2, R.drawable.avengers1chapter3, R.drawable.avengers1chapter4,R.drawable.avengers1chapter5,
            R.drawable.avengers1chapter6,R.drawable.avengers1chapter7 ,R.drawable.avengers1chapter8, R.drawable.avengers1chapter9,R.drawable.avengers1chapter10,R.drawable.avengers1chapter11,
            R.drawable.avengers1chapter12,R.drawable.avengers1chapter13,R.drawable.avengers1chapter14,R.drawable.avengers1chapter15,R.drawable.avengers1chapter16,R.drawable.avengers1chapter17,
            R.drawable.avengers1chapter18,R.drawable.avengers1chapter19,R.drawable.avengers1chapter20,R.drawable.avengers1chapter21,R.drawable.avengers1chapter22,R.drawable.avengers1chapter23,
            R.drawable.avengers1chapter24};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avengers1);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapteravengers1(gambarhero, avengers1.this));
        pagerku.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        downloadButton= (ImageView) findViewById(R.id.download_avengers1);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/12anIqGSgl4x9hYJawiqp1GEISIXnhKDo?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
