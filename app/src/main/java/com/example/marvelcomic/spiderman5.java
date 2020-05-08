package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class spiderman5 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.spider5,R.drawable.spider5eps1,R.drawable.spider5eps2, R.drawable.spider5eps3, R.drawable.spider5eps4,R.drawable.spider5eps5,R.drawable.spider5eps6,R.drawable.spider5eps7 ,
            R.drawable.spider5eps8, R.drawable.spider5eps9,R.drawable.spider5eps10,R.drawable.spider5eps11,R.drawable.spider5eps12,R.drawable.spider5eps13,R.drawable.spider5eps14,
            R.drawable.spider5eps15,R.drawable.spider5eps16,R.drawable.spider5eps17,R.drawable.spider5eps18,R.drawable.spider5eps19,R.drawable.spider5eps20,R.drawable.spider5eps21};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiderman5);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapterspiderman5(gambarhero, spiderman5.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_spiderman5);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1vgSFUUfQoAwwOSG_iyV0ngOWXkGd9KkP?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
