package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class deadpool1 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.deadpool1,R.drawable.dp1chapter1, R.drawable.dp1chapter2, R.drawable.dp1chapter3, R.drawable.dp1chapter4,R.drawable.dp1chapter5,R.drawable.dp1chapter6,
            R.drawable.dp1chapter7 ,R.drawable.dp1chapter8, R.drawable.dp1chapter9,R.drawable.dp1chapter10,R.drawable.dp1chapter11,R.drawable.dp1chapter12,R.drawable.dp1chapter13,R.drawable.dp1chapter14,
            R.drawable.dp1chapter15,R.drawable.dp1chapter16,R.drawable.dp1chapter17,R.drawable.dp1chapter18,R.drawable.dp1chapter19,R.drawable.dp1chapter20,R.drawable.dp1chapter21,R.drawable.dp1chapter22,
            R.drawable.dp1chapter23,R.drawable.dp1chapter24,R.drawable.dp1chapter25,R.drawable.dp1chapter26};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deadpool1);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapterdeadpool1(gambarhero, deadpool1.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_deadpool1);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1hwB5uMDTcwaa8i55zkyJzrOv3Wt2vvwa?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
