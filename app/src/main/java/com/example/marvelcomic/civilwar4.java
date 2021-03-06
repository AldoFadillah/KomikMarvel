package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class civilwar4 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.civilwar4,R.drawable.civilwar4eps1, R.drawable.civilwar4eps2, R.drawable.civilwar4eps3, R.drawable.civilwar4eps4,R.drawable.civilwar4eps5,R.drawable.civilwar4eps6,
            R.drawable.civilwar4eps7 ,R.drawable.civilwar4eps8, R.drawable.civilwar4eps9,R.drawable.civilwar4eps10,R.drawable.civilwar4eps11,R.drawable.civilwar4eps12,R.drawable.civilwar4eps13,R.drawable.civilwar4eps14,
            R.drawable.civilwar4eps15,R.drawable.civilwar4eps16,R.drawable.civilwar4eps17,R.drawable.civilwar4eps18,R.drawable.civilwar4eps19,R.drawable.civilwar4eps20,R.drawable.civilwar4eps21,R.drawable.civilwar4eps22,R.drawable.civilwar4eps23,R.drawable.civilwar4eps24};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civilwar4);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadaptercivilwar4(gambarhero, civilwar4.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_civilwar4);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1-Lp7t4sSBQYMeM0JSmRyollnmU3qobtH?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
