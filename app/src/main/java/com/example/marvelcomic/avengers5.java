package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class avengers5 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.avengers5,R.drawable.avengers5chapter1, R.drawable.avengers5chapter2, R.drawable.avengers5chapter3, R.drawable.avengers5chapter4,R.drawable.avengers5chapter5,
            R.drawable.avengers5chapter6,R.drawable.avengers5chapter7 ,R.drawable.avengers5chapter8, R.drawable.avengers5chapter9,R.drawable.avengers5chapter10,R.drawable.avengers5chapter11,
            R.drawable.avengers5chapter12,R.drawable.avengers5chapter13,R.drawable.avengers5chapter14,R.drawable.avengers5chapter15,R.drawable.avengers5chapter16,R.drawable.avengers5chapter17,
            R.drawable.avengers5chapter18,R.drawable.avengers5chapter19,R.drawable.avengers5chapter20,R.drawable.avengers5chapter21,R.drawable.avengers5chapter22};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avengers5);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapteravengers5(gambarhero, avengers5.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_avengers5);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/11i2FJHleCASj0kpWFUgwR4rirk9f8ySo?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
