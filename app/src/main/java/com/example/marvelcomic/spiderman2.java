package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class spiderman2 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.spider2,R.drawable.spider2eps1,R.drawable.spider2eps2, R.drawable.spider2eps3, R.drawable.spider2eps4,R.drawable.spider2eps5,R.drawable.spider2eps6,R.drawable.spider2eps7 ,
            R.drawable.spider2eps8, R.drawable.spider2eps9,R.drawable.spider2eps10,R.drawable.spider2eps11,R.drawable.spider2eps12,R.drawable.spider2eps13,R.drawable.spider2eps14,
            R.drawable.spider2eps15,R.drawable.spider2eps16,R.drawable.spider2eps17,R.drawable.spider2eps18,R.drawable.spider2eps19,R.drawable.spider2eps20,R.drawable.spider2eps21};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiderman2);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapterspiderman2(gambarhero, spiderman2.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_spiderman2);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1LNZkRMMpXt4w2eTixSs8rULPa44rWbAF?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
