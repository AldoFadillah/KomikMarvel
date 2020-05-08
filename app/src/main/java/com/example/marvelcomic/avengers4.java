package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class avengers4 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.avengers4,R.drawable.avengers4chapter1, R.drawable.avengers4chapter2, R.drawable.avengers4chapter3, R.drawable.avengers4chapter4,R.drawable.avengers4chapter5,
            R.drawable.avengers4chapter6,R.drawable.avengers4chapter7 ,R.drawable.avengers4chapter8, R.drawable.avengers4chapter9,R.drawable.avengers4chapter10,R.drawable.avengers4chapter11,
            R.drawable.avengers4chapter12,R.drawable.avengers4chapter13,R.drawable.avengers4chapter14,R.drawable.avengers4chapter15,R.drawable.avengers4chapter16,R.drawable.avengers4chapter17,
            R.drawable.avengers4chapter18,R.drawable.avengers4chapter19,R.drawable.avengers4chapter20,R.drawable.avengers4chapter21,R.drawable.avengers4chapter22,R.drawable.avengers4chapter23};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avengers4);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapteravengers4(gambarhero, avengers4.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_avengers4);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1FpxpzEKArhL4WKhCgdU30H8_jRDrycQO?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
