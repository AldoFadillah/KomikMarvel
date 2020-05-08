package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ironman6 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.ironman6,R.drawable.iman6chapter1, R.drawable.iman6chapter2, R.drawable.iman6chapter3, R.drawable.iman6chapter4,R.drawable.iman6chapter5,R.drawable.iman6chapter6,R.drawable.iman6chapter7 ,
            R.drawable.iman6chapter8, R.drawable.iman6chapter9,R.drawable.iman6chapter10,R.drawable.iman6chapter11,R.drawable.iman6chapter12,R.drawable.iman6chapter13,R.drawable.iman6chapter14,
            R.drawable.iman6chapter15,R.drawable.iman6chapter16,R.drawable.iman6chapter17,R.drawable.iman6chapter18,R.drawable.iman6chapter19,R.drawable.iman6chapter20,R.drawable.iman6chapter21};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ironman6);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapterironman6(gambarhero, ironman6.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_ironman6);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1vzn0W9bP7sWJrPM0g33MZN-7L_YpPmsW?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
