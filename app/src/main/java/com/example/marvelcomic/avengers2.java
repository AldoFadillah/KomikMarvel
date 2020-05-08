package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class avengers2 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.avengers2,R.drawable.avengers2chapter1, R.drawable.avengers2chapter2, R.drawable.avengers2chapter3, R.drawable.avengers2chapter4,R.drawable.avengers2chapter5,
            R.drawable.avengers2chapter6,R.drawable.avengers2chapter7 ,R.drawable.avengers2chapter8, R.drawable.avengers2chapter9,R.drawable.avengers2chapter10,R.drawable.avengers2chapter11,
            R.drawable.avengers2chapter12,R.drawable.avengers2chapter13,R.drawable.avengers2chapter14,R.drawable.avengers2chapter15,R.drawable.avengers2chapter16,R.drawable.avengers2chapter17,
            R.drawable.avengers2chapter18,R.drawable.avengers2chapter19,R.drawable.avengers2chapter20,R.drawable.avengers2chapter21,R.drawable.avengers2chapter22};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avengers2);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapteravengers2(gambarhero, avengers2.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_avengers2);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1Mxd4l8KD1LVcKUi4_M-OAFB6uLPZR7pT?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
