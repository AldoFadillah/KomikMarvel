package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ghostrider1 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.gr1,R.drawable.gr1chapter1, R.drawable.gr1chapter2, R.drawable.gr1chapter3, R.drawable.gr1chapter4,R.drawable.gr1chapter5,R.drawable.gr1chapter6,
            R.drawable.gr1chapter7 ,R.drawable.gr1chapter8, R.drawable.gr1chapter9,R.drawable.gr1chapter10,R.drawable.gr1chapter11,R.drawable.gr1chapter12,R.drawable.gr1chapter13,
            R.drawable.gr1chapter14,R.drawable.gr1chapter15,R.drawable.gr1chapter16,R.drawable.gr1chapter17,R.drawable.gr1chapter18,R.drawable.gr1chapter19,R.drawable.gr1chapter20,
            R.drawable.gr1chapter21,R.drawable.gr1chapter22};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghostrider1);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapterghostrider1(gambarhero, ghostrider1.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_ghostrider1);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/149-08aWOpWVIOGAq_0pHem1GliHmGPjt?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
