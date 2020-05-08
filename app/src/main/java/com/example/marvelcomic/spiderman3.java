package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class spiderman3 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.spider3,R.drawable.spider3eps1,R.drawable.spider3eps2, R.drawable.spider3eps3, R.drawable.spider3eps4,R.drawable.spider3eps5,R.drawable.spider3eps6,R.drawable.spider3eps7 ,
            R.drawable.spider3eps8, R.drawable.spider3eps9,R.drawable.spider3eps10,R.drawable.spider3eps11,R.drawable.spider3eps12,R.drawable.spider3eps13,R.drawable.spider3eps14,
            R.drawable.spider3eps15,R.drawable.spider3eps16,R.drawable.spider3eps17,R.drawable.spider3eps18,R.drawable.spider3eps19,R.drawable.spider3eps20,R.drawable.spider3eps21};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiderman3);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapterspiderman3(gambarhero, spiderman3.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_spiderman3);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1CA5kt8UAEUMQGDcaTQ_MmJxXNrDS2f3U?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
