package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class spiderman8 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.spider8,R.drawable.spider8eps1,R.drawable.spider8eps2, R.drawable.spider8eps3, R.drawable.spider8eps4,R.drawable.spider8eps5,R.drawable.spider8eps6,R.drawable.spider8eps7 ,
            R.drawable.spider8eps8, R.drawable.spider8eps9,R.drawable.spider8eps10,R.drawable.spider8eps11,R.drawable.spider8eps12,R.drawable.spider8eps13,R.drawable.spider8eps14,
            R.drawable.spider8eps15,R.drawable.spider8eps16,R.drawable.spider8eps17,R.drawable.spider8eps18,R.drawable.spider8eps19,R.drawable.spider8eps20,R.drawable.spider8eps21,R.drawable.spider8eps22};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiderman8);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapterspiderman8(gambarhero, spiderman8.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_spiderman8);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1aT4t0GPFTEGdJleFqZT38b9fPgNUQ_5X?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
