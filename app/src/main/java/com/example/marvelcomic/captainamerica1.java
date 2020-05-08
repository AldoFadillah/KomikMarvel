package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class captainamerica1 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.capmerika1,R.drawable.capmerika1eps1, R.drawable.capmerika1eps2, R.drawable.capmerika1eps3, R.drawable.capmerika1eps4,R.drawable.capmerika1eps5,R.drawable.capmerika1eps6,
            R.drawable.capmerika1eps7 ,R.drawable.capmerika1eps8, R.drawable.capmerika1eps9,R.drawable.capmerika1eps10,R.drawable.capmerika1eps11,R.drawable.capmerika1eps12,R.drawable.capmerika1eps13,R.drawable.capmerika1eps14,
            R.drawable.capmerika1eps15,R.drawable.capmerika1eps16,R.drawable.capmerika1eps17,R.drawable.capmerika1eps18,R.drawable.capmerika1eps19,R.drawable.capmerika1eps20,R.drawable.capmerika1eps21};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_captainamerica1);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadaptercaptainamerika1(gambarhero, captainamerica1.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_captainamerica1);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1dtMnR-IyXN22FArszftjjUPpJMHoB_tt?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
