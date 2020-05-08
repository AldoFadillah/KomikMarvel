package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ghostrider3 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.gr3,R.drawable.gr3chapter1, R.drawable.gr3chapter2, R.drawable.gr3chapter3, R.drawable.gr3chapter4,R.drawable.gr3chapter5,R.drawable.gr3chapter6,
            R.drawable.gr3chapter7 ,R.drawable.gr3chapter8, R.drawable.gr3chapter9,R.drawable.gr3chapter10,R.drawable.gr3chapter11,R.drawable.gr3chapter12,R.drawable.gr3chapter13,
            R.drawable.gr3chapter14,R.drawable.gr3chapter15,R.drawable.gr3chapter16,R.drawable.gr3chapter17,R.drawable.gr3chapter18,R.drawable.gr3chapter19,R.drawable.gr3chapter20};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghostrider3);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapterghostrider3(gambarhero, ghostrider3.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_ghostrider3);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/19iVLZMw4a_dqnzokpxqUoGe5TAlYDJgj?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
