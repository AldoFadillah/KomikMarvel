package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ironman3 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.ironman3,R.drawable.iman3chapter1, R.drawable.iman3chapter2, R.drawable.iman3chapter3, R.drawable.iman3chapter4,R.drawable.iman3chapter5,R.drawable.iman3chapter6,R.drawable.iman3chapter7 ,
            R.drawable.iman3chapter8, R.drawable.iman3chapter9,R.drawable.iman3chapter10,R.drawable.iman3chapter11,R.drawable.iman3chapter12,R.drawable.iman3chapter13,R.drawable.iman3chapter14,
            R.drawable.iman3chapter15,R.drawable.iman3chapter16,R.drawable.iman3chapter17,R.drawable.iman3chapter18,R.drawable.iman3chapter19,R.drawable.iman3chapter20};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ironman3);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapterironman3(gambarhero, ironman3.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_ironman3);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1tqR1NrAWtLG47OmMFrHRuyrFyDiGM2Bc?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
