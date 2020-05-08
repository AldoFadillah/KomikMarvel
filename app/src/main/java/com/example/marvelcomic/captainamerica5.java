package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class captainamerica5 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.capmerika5,R.drawable.capmerika5eps1, R.drawable.capmerika5eps2, R.drawable.capmerika5eps3, R.drawable.capmerika5eps4,R.drawable.capmerika5eps5,R.drawable.capmerika5eps6,
            R.drawable.capmerika5eps7 ,R.drawable.capmerika5eps8, R.drawable.capmerika5eps9,R.drawable.capmerika5eps10,R.drawable.capmerika5eps11,R.drawable.capmerika5eps12,R.drawable.capmerika5eps13,R.drawable.capmerika5eps14,
            R.drawable.capmerika5eps15,R.drawable.capmerika5eps16,R.drawable.capmerika5eps17,R.drawable.capmerika5eps18,R.drawable.capmerika5eps19,R.drawable.capmerika5eps20};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_captainamerica5);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadaptercaptainamerika5(gambarhero, captainamerica5.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_captainamerica5);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1aKyQ9Jt_jSfuEC2XUIysItSuEn7hanGE?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
