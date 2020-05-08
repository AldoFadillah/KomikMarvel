package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class captainamerica6 extends AppCompatActivity {
    int[] gambarhero = {R.drawable.capmerika6,R.drawable.capmerika6eps1, R.drawable.capmerika6eps2, R.drawable.capmerika6eps3, R.drawable.capmerika6eps4,R.drawable.capmerika6eps5,R.drawable.capmerika6eps6,
            R.drawable.capmerika6eps7 ,R.drawable.capmerika6eps8, R.drawable.capmerika6eps9,R.drawable.capmerika6eps10,R.drawable.capmerika6eps11,R.drawable.capmerika6eps12,R.drawable.capmerika6eps13,R.drawable.capmerika6eps14,
            R.drawable.capmerika6eps15,R.drawable.capmerika6eps16,R.drawable.capmerika6eps17,R.drawable.capmerika6eps18,R.drawable.capmerika6eps19,R.drawable.capmerika6eps20,R.drawable.capmerika6eps21};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_captainamerica6);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadaptercaptainamerika6(gambarhero, captainamerica6.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_captainamerica6);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/1BJMVK3DGh2CzIjVposNeBsMvOJqmSts4?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
