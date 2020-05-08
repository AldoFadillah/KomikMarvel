package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class deadpool2 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.deadpool2,R.drawable.dp2chapter1, R.drawable.dp2chapter2, R.drawable.dp2chapter3, R.drawable.dp2chapter4,R.drawable.dp2chapter5,R.drawable.dp2chapter6,
            R.drawable.dp2chapter7 ,R.drawable.dp2chapter8, R.drawable.dp2chapter9,R.drawable.dp2chapter10,R.drawable.dp2chapter11,R.drawable.dp2chapter12,R.drawable.dp2chapter13,R.drawable.dp2chapter14,
            R.drawable.dp2chapter15,R.drawable.dp2chapter16,R.drawable.dp2chapter17,R.drawable.dp2chapter18};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deadpool2);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapterdeadpool2(gambarhero, deadpool2.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_deadpool2);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1FzxVfsdsyWetS0T1zHH9Ulo8jEAUAnku?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
