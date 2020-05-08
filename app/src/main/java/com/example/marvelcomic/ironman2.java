package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ironman2 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.ironman2,R.drawable.iman2chapter1, R.drawable.iman2chapter2, R.drawable.iman2chapter3, R.drawable.iman2chapter4,R.drawable.iman2chapter5,R.drawable.iman2chapter6,R.drawable.iman2chapter7 ,
            R.drawable.iman2chapter8, R.drawable.iman2chapter9,R.drawable.iman2chapter10,R.drawable.iman2chapter11,R.drawable.iman2chapter12,R.drawable.iman2chapter13,R.drawable.iman2chapter14,
            R.drawable.iman2chapter15,R.drawable.iman2chapter16,R.drawable.iman2chapter17,R.drawable.iman2chapter18,R.drawable.iman2chapter19,R.drawable.iman2chapter20};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ironman2);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapterironman2(gambarhero, ironman2.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_ironman2);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/12ViP9V_bJnT-wLRj7jOP0doD9HqOLE-q?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
