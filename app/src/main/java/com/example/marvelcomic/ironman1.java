package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ironman1 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.ironman1,R.drawable.iman1chapter1, R.drawable.iman1chapter2, R.drawable.iman1chapter3, R.drawable.iman1chapter4,R.drawable.iman1chapter5,R.drawable.iman1chapter6,R.drawable.iman1chapter7 ,
            R.drawable.iman1chapter8, R.drawable.iman1chapter9,R.drawable.iman1chapter10,R.drawable.iman1chapter11,R.drawable.iman1chapter12,R.drawable.iman1chapter13,R.drawable.iman1chapter14,
            R.drawable.iman1chapter15,R.drawable.iman1chapter16,R.drawable.iman1chapter17,R.drawable.iman1chapter18,R.drawable.iman1chapter19,R.drawable.iman1chapter20,R.drawable.iman1chapter21,R.drawable.iman1chapter22};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ironman1);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapterironman1(gambarhero, ironman1.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_ironman1);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1XEzntux7Qcj4C0geG2K6AVXEAKMaDv3B?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
