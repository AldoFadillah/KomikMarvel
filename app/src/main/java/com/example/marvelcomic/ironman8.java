package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ironman8 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.ironman8,R.drawable.iman8chapter1, R.drawable.iman8chapter2, R.drawable.iman8chapter3, R.drawable.iman8chapter4,R.drawable.iman8chapter5,R.drawable.iman8chapter6,R.drawable.iman8chapter7 ,
            R.drawable.iman8chapter8, R.drawable.iman8chapter9,R.drawable.iman8chapter10,R.drawable.iman8chapter11,R.drawable.iman8chapter12,R.drawable.iman8chapter13,R.drawable.iman8chapter14,
            R.drawable.iman8chapter15,R.drawable.iman8chapter16,R.drawable.iman8chapter17,R.drawable.iman8chapter18,R.drawable.iman8chapter19,R.drawable.iman8chapter20,R.drawable.iman8chapter21};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ironman8);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapterironman8(gambarhero, ironman8.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_ironman8);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1ah_FQt7BbyVARNcV-RD_vPezgfWjp9GU?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
