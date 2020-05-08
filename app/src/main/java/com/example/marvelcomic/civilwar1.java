package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class civilwar1 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.civilwar1,R.drawable.civilwar1eps1, R.drawable.civilwar1eps2, R.drawable.civilwar1eps3, R.drawable.civilwar1eps4,R.drawable.civilwar1eps5,R.drawable.civilwar1eps6,
            R.drawable.civilwar1eps7 ,R.drawable.civilwar1eps8, R.drawable.civilwar1eps9,R.drawable.civilwar1eps10,R.drawable.civilwar1eps11,R.drawable.civilwar1eps12,R.drawable.civilwar1eps13,R.drawable.civilwar1eps14,
            R.drawable.civilwar1eps15,R.drawable.civilwar1eps16,R.drawable.civilwar1eps17,R.drawable.civilwar1eps18,R.drawable.civilwar1eps19,R.drawable.civilwar1eps20,R.drawable.civilwar1eps21,R.drawable.civilwar1eps22,
            R.drawable.civilwar1eps23,R.drawable.civilwar1eps24,R.drawable.civilwar1eps25,R.drawable.civilwar1eps26,R.drawable.civilwar1eps27,R.drawable.civilwar1eps28,R.drawable.civilwar1eps29,R.drawable.civilwar1eps30,
            R.drawable.civilwar1eps31,R.drawable.civilwar1eps32};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civilwar1);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadaptercivilwar1(gambarhero, civilwar1.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_civilwar1);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1jM_TL0GKzEkDdLVZon2rcfFAsrjep1QG?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
