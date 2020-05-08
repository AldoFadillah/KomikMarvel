package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class doctorstrange extends AppCompatActivity {
    int[] gambarhero = {R.drawable.ds,R.drawable.dschapter1, R.drawable.dschapter2, R.drawable.dschapter3, R.drawable.dschapter4,R.drawable.dschapter5,R.drawable.dschapter6,
            R.drawable.dschapter7 ,R.drawable.dschapter8, R.drawable.dschapter9,R.drawable.dschapter10,R.drawable.dschapter11,R.drawable.dschapter12,R.drawable.dschapter13,R.drawable.dschapter14,
            R.drawable.dschapter15,R.drawable.dschapter16,R.drawable.dschapter17,R.drawable.dschapter18,R.drawable.dschapter19,R.drawable.dschapter20,R.drawable.dschapter21,R.drawable.dschapter22,
            R.drawable.dschapter23};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorstrange);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapterdoctorstrange(gambarhero, doctorstrange.this));
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
        downloadButton= (ImageView) findViewById(R.id.doctorstrange);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1Gyfi5knVqvIuAccs3udeuBaRMwIchfF8?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
