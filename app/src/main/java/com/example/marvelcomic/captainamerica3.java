package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class captainamerica3 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.capmerika3,R.drawable.capmerika3eps1, R.drawable.capmerika3eps2, R.drawable.capmerika3eps3, R.drawable.capmerika3eps4,R.drawable.capmerika3eps5,R.drawable.capmerika3eps6,
            R.drawable.capmerika3eps7 ,R.drawable.capmerika3eps8, R.drawable.capmerika3eps9,R.drawable.capmerika3eps10,R.drawable.capmerika3eps11,R.drawable.capmerika3eps12,R.drawable.capmerika3eps13,R.drawable.capmerika3eps14,
            R.drawable.capmerika3eps15,R.drawable.capmerika3eps16,R.drawable.capmerika3eps17,R.drawable.capmerika3eps18,R.drawable.capmerika3eps19,R.drawable.capmerika3eps20,R.drawable.capmerika3eps21};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_captainamerica3);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadaptercaptainamerika3(gambarhero, captainamerica3.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_captainamerica3);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1qxf6NXwGNz0aT40ZXjUmcMD5Fq08baV8?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
