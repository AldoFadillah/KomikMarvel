package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ironman5 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.ironman5,R.drawable.iman5chapter1, R.drawable.iman5chapter2, R.drawable.iman5chapter3, R.drawable.iman5chapter4,R.drawable.iman5chapter5,R.drawable.iman5chapter6,R.drawable.iman5chapter7 ,
            R.drawable.iman5chapter8, R.drawable.iman5chapter9,R.drawable.iman5chapter10,R.drawable.iman5chapter11,R.drawable.iman5chapter12,R.drawable.iman5chapter13,R.drawable.iman5chapter14,
            R.drawable.iman5chapter15,R.drawable.iman5chapter16,R.drawable.iman5chapter17,R.drawable.iman5chapter18,R.drawable.iman5chapter19,R.drawable.iman5chapter20,R.drawable.iman5chapter21};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ironman5);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapterironman5(gambarhero, ironman5.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_ironman5);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1Ae4nqm326Vx4CIU0qTcJdcnNRCfbBZs6?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
