package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class civilwar3 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.civilwar3,R.drawable.civilwar3eps1, R.drawable.civilwar3eps2, R.drawable.civilwar3eps3, R.drawable.civilwar3eps4,R.drawable.civilwar3eps5,R.drawable.civilwar3eps6,
            R.drawable.civilwar3eps7 ,R.drawable.civilwar3eps8, R.drawable.civilwar3eps9,R.drawable.civilwar3eps10,R.drawable.civilwar3eps11,R.drawable.civilwar3eps12,R.drawable.civilwar3eps13,R.drawable.civilwar3eps14,
            R.drawable.civilwar3eps15,R.drawable.civilwar3eps16,R.drawable.civilwar3eps17,R.drawable.civilwar3eps18,R.drawable.civilwar3eps19,R.drawable.civilwar3eps20,R.drawable.civilwar3eps21,R.drawable.civilwar3eps22};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civilwar3);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadaptercivilwar3(gambarhero, civilwar3.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_civilwar3);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1HEuYekxR8yJ1Rwp6HSVuI_OF1x3ISG6Y?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
