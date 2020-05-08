package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ironman7 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.ironman7,R.drawable.iman7chapter1, R.drawable.iman7chapter2, R.drawable.iman7chapter3, R.drawable.iman7chapter4,R.drawable.iman7chapter5,R.drawable.iman7chapter6,R.drawable.iman7chapter7 ,
            R.drawable.iman7chapter8, R.drawable.iman7chapter9,R.drawable.iman7chapter10,R.drawable.iman7chapter11,R.drawable.iman7chapter12,R.drawable.iman7chapter13,R.drawable.iman7chapter14,
            R.drawable.iman7chapter15,R.drawable.iman7chapter16,R.drawable.iman7chapter17,R.drawable.iman7chapter18,R.drawable.iman7chapter19,R.drawable.iman7chapter20,R.drawable.iman7chapter21};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ironman7);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapterironman7(gambarhero, ironman7.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_ironman7);
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
