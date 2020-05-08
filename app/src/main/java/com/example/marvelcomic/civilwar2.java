package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class civilwar2 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.civilwar2,R.drawable.civilwar2eps1, R.drawable.civilwar2eps2, R.drawable.civilwar2eps3, R.drawable.civilwar2eps4,R.drawable.civilwar2eps5,R.drawable.civilwar2eps6,
            R.drawable.civilwar2eps7 ,R.drawable.civilwar2eps8, R.drawable.civilwar2eps9,R.drawable.civilwar2eps10,R.drawable.civilwar2eps11,R.drawable.civilwar2eps12,R.drawable.civilwar2eps13,R.drawable.civilwar2eps14,
            R.drawable.civilwar2eps15,R.drawable.civilwar2eps16,R.drawable.civilwar2eps17,R.drawable.civilwar2eps18,R.drawable.civilwar2eps19,R.drawable.civilwar2eps20,R.drawable.civilwar2eps21,R.drawable.civilwar2eps22};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civilwar2);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadaptercivilwar2(gambarhero, civilwar2.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_civilwar2);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1b-CndSCBtiEEaqVcQgQ8Uvo70FK96zFf?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
