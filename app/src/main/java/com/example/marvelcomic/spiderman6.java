package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class spiderman6 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.spider6,R.drawable.spider6eps1,R.drawable.spider6eps2, R.drawable.spider6eps3, R.drawable.spider6eps4,R.drawable.spider6eps5,R.drawable.spider6eps6,R.drawable.spider6eps7 ,
            R.drawable.spider6eps8, R.drawable.spider6eps9,R.drawable.spider6eps10,R.drawable.spider6eps11,R.drawable.spider6eps12,R.drawable.spider6eps13,R.drawable.spider6eps14,
            R.drawable.spider6eps15,R.drawable.spider6eps16,R.drawable.spider6eps17,R.drawable.spider6eps18,R.drawable.spider6eps19,R.drawable.spider6eps20,R.drawable.spider6eps21,R.drawable.spider6eps22};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiderman6);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapterspiderman6(gambarhero, spiderman6.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_spiderman6);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1d5p37FWE8D3Xuhk8ei_VcbUt6qu7DgDx?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
