package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class avengers3 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.avengers3,R.drawable.avengers3chapter1, R.drawable.avengers3chapter2, R.drawable.avengers3chapter3, R.drawable.avengers3chapter4,R.drawable.avengers3chapter5,
            R.drawable.avengers3chapter6,R.drawable.avengers3chapter7 ,R.drawable.avengers3chapter8, R.drawable.avengers3chapter9,R.drawable.avengers3chapter10,R.drawable.avengers3chapter11,
            R.drawable.avengers3chapter12,R.drawable.avengers3chapter13,R.drawable.avengers3chapter14,R.drawable.avengers3chapter15,R.drawable.avengers3chapter16,R.drawable.avengers3chapter17,
            R.drawable.avengers3chapter18,R.drawable.avengers3chapter19,R.drawable.avengers3chapter20,R.drawable.avengers3chapter21,R.drawable.avengers3chapter22,R.drawable.avengers3chapter23,
            R.drawable.avengers3chapter24};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avengers3);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapteravengers3(gambarhero, avengers3.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_avengers3);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1IX7bSMdZhCWjCFncY_md2abJTGVYcybI?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
