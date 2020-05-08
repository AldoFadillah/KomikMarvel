package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class deadpool3 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.deadpool3,R.drawable.dp3chapter1, R.drawable.dp3chapter2, R.drawable.dp3chapter3, R.drawable.dp3chapter4,R.drawable.dp3chapter5,R.drawable.dp3chapter6,
            R.drawable.dp3chapter7 ,R.drawable.dp3chapter8, R.drawable.dp3chapter9,R.drawable.dp3chapter10,R.drawable.dp3chapter11,R.drawable.dp3chapter12,R.drawable.dp3chapter13,R.drawable.dp3chapter14,
            R.drawable.dp3chapter15,R.drawable.dp3chapter16,R.drawable.dp3chapter17};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deadpool3);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapterdeadpool3(gambarhero, deadpool3.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_deadpool3);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1ym0v6b-_O2QPhLLSaeHoI0cDTnt8V50H?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
