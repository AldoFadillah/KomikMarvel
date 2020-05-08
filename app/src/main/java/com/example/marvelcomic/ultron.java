package com.example.marvelcomic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ultron extends AppCompatActivity {
    int[] gambarhero = {R.drawable.ultron,R.drawable.ultron1,R.drawable.ultron2, R.drawable.ultron3, R.drawable.ultron4,R.drawable.ultron5,R.drawable.ultron6,R.drawable.ultron7 ,
            R.drawable.ultron8, R.drawable.ultron9,R.drawable.ultron10,R.drawable.ultron11,R.drawable.ultron12,R.drawable.ultron13,R.drawable.ultron14,
            R.drawable.ultron15,R.drawable.ultron16,R.drawable.ultron17,R.drawable.ultron18,R.drawable.ultron19,R.drawable.ultron20,R.drawable.ultron21,R.drawable.ultron22,R.drawable.ultron23,R.drawable.ultron24};
    ViewPager pagerku;
    ImageView downloadButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ultron);

        pagerku = findViewById(R.id.mainpager);
        pagerku.setAdapter(new fotoadapterultron(gambarhero, ultron.this));
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
        downloadButton= (ImageView) findViewById(R.id.download_ultron);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://drive.google.com/drive/folders/13PXMR1WA3ouOKf7I5FnZFY13Lo9ufFu8?usp=sharing";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
