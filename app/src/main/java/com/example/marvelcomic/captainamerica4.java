package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class captainamerica4 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.capmerika4,R.drawable.capmerika4eps1, R.drawable.capmerika4eps2, R.drawable.capmerika4eps3, R.drawable.capmerika4eps4,R.drawable.capmerika4eps5,R.drawable.capmerika4eps6,
            R.drawable.capmerika4eps7 ,R.drawable.capmerika4eps8, R.drawable.capmerika4eps9,R.drawable.capmerika4eps10,R.drawable.capmerika4eps11,R.drawable.capmerika4eps12,R.drawable.capmerika4eps13,R.drawable.capmerika4eps14,
            R.drawable.capmerika4eps15,R.drawable.capmerika4eps16,R.drawable.capmerika4eps17,R.drawable.capmerika4eps18,R.drawable.capmerika4eps19,R.drawable.capmerika4eps20,R.drawable.capmerika4eps21};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_captainamerica4);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadaptercaptainamerika4(gambarhero, captainamerica4.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_captainamerica4);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1Om7LABF7auu_PMwQHGqYu1lDW-cCFq6Z?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
