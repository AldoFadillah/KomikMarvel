package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ghostrider2 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.gr2,R.drawable.gr2chapter1, R.drawable.gr2chapter2, R.drawable.gr2chapter3, R.drawable.gr2chapter4,R.drawable.gr2chapter5,R.drawable.gr2chapter6,
            R.drawable.gr2chapter7 ,R.drawable.gr2chapter8, R.drawable.gr2chapter9,R.drawable.gr2chapter10,R.drawable.gr2chapter11,R.drawable.gr2chapter12,R.drawable.gr2chapter13,
            R.drawable.gr2chapter14,R.drawable.gr2chapter15,R.drawable.gr2chapter16,R.drawable.gr2chapter17,R.drawable.gr2chapter18,R.drawable.gr2chapter19,R.drawable.gr2chapter20,
            R.drawable.gr2chapter21,R.drawable.gr2chapter22};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghostrider2);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapterghostrider2(gambarhero, ghostrider2.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_ghostrider2);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1yKRvZtyzTddgUX_tZ6D46KuPVdsVEQsc?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
