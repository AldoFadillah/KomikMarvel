package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class spiderman4 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.spider4,R.drawable.spider4eps1,R.drawable.spider4eps2, R.drawable.spider4eps3, R.drawable.spider4eps4,R.drawable.spider4eps5,R.drawable.spider4eps6,R.drawable.spider4eps7 ,
            R.drawable.spider4eps8, R.drawable.spider4eps9,R.drawable.spider4eps10,R.drawable.spider4eps11,R.drawable.spider4eps12,R.drawable.spider4eps13,R.drawable.spider4eps14,
            R.drawable.spider4eps15,R.drawable.spider4eps16,R.drawable.spider4eps17,R.drawable.spider4eps18,R.drawable.spider4eps19,R.drawable.spider4eps20};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiderman4);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapterspiderman4(gambarhero, spiderman4.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_spiderman4);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1jvHHfQB7KiqbZ8gZRCbhYnYUz3KsvlZo?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
