package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class spiderman1 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.spider1,R.drawable.spider1eps2, R.drawable.spider1eps3, R.drawable.spider1eps4,R.drawable.spider1eps5,R.drawable.spider1eps6,R.drawable.spider1eps7 ,
            R.drawable.spider1eps8, R.drawable.spider1eps9,R.drawable.spider1eps10,R.drawable.spider1eps11,R.drawable.spider1eps12,R.drawable.spider1eps13,R.drawable.spider1eps14,
            R.drawable.spider1eps15,R.drawable.spider1eps16,R.drawable.spider1eps17,R.drawable.spider1eps18,R.drawable.spider1eps19,R.drawable.spider1eps20,R.drawable.spider1eps21,R.drawable.spider1eps22};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiderman1);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapterspiderman1(gambarhero, spiderman1.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_spiderman1);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1bJFEyYyzCPMsvAFlfddD0VaBOjowQAZq?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
