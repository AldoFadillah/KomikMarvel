package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class spiderman7 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.spider7,R.drawable.spider7eps1,R.drawable.spider7eps2, R.drawable.spider7eps3, R.drawable.spider7eps4,R.drawable.spider7eps5,R.drawable.spider7eps6,R.drawable.spider7eps7 ,
            R.drawable.spider7eps8, R.drawable.spider7eps9,R.drawable.spider7eps10,R.drawable.spider7eps11,R.drawable.spider7eps12,R.drawable.spider7eps13,R.drawable.spider7eps14,
            R.drawable.spider7eps15,R.drawable.spider7eps16,R.drawable.spider7eps17,R.drawable.spider7eps18,R.drawable.spider7eps19,R.drawable.spider7eps20,R.drawable.spider7eps21};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiderman7);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapterspiderman7(gambarhero, spiderman7.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_spiderman7);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1OZw8AZUy30ueO7Zz-XpAN-ulsJMtSd6Z?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
