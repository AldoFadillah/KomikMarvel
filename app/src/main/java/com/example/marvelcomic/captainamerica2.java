package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class captainamerica2 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.capmerika2,R.drawable.capmerika2eps1, R.drawable.capmerika2eps2, R.drawable.capmerika2eps3, R.drawable.capmerika2eps4,R.drawable.capmerika2eps5,R.drawable.capmerika2eps6,
            R.drawable.capmerika2eps7 ,R.drawable.capmerika2eps8, R.drawable.capmerika2eps9,R.drawable.capmerika2eps10,R.drawable.capmerika2eps11,R.drawable.capmerika2eps12,R.drawable.capmerika2eps13,R.drawable.capmerika2eps14,
            R.drawable.capmerika2eps15,R.drawable.capmerika2eps16,R.drawable.capmerika2eps17,R.drawable.capmerika2eps18,R.drawable.capmerika2eps19};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_captainamerica2);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadaptercaptainamerika2(gambarhero, captainamerica2.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_captainamerica2);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1nhLOfjuDbJN_etQ9zWFJLLUEOyvkeGsy?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
