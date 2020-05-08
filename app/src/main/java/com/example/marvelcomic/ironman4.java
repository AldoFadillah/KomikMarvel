package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ironman4 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.ironman4,R.drawable.iman4chapter1, R.drawable.iman4chapter2, R.drawable.iman4chapter3, R.drawable.iman4chapter4,R.drawable.iman4chapter5,R.drawable.iman4chapter6,R.drawable.iman4chapter7 ,
            R.drawable.iman4chapter8, R.drawable.iman4chapter9,R.drawable.iman4chapter10,R.drawable.iman4chapter11,R.drawable.iman4chapter12,R.drawable.iman4chapter13,R.drawable.iman4chapter14,
            R.drawable.iman4chapter15,R.drawable.iman4chapter16,R.drawable.iman4chapter17,R.drawable.iman4chapter18,R.drawable.iman4chapter19,R.drawable.iman4chapter20,R.drawable.iman4chapter21};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ironman4);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapterironman4(gambarhero, ironman4.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_ironman4);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1tCKqYRRN7F1lxt_CPijbbkyHTfY0w3xP?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
