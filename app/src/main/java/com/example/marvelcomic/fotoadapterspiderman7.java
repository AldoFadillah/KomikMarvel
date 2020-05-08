package com.example.marvelcomic;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.viewpager.widget.PagerAdapter;

public class fotoadapterspiderman7 extends PagerAdapter {
    int[] adaptergambarhero;
    Activity adapteractivity;

    public fotoadapterspiderman7( int[] gambarhero, spiderman7 spiderman7) {
        adaptergambarhero = gambarhero;
        adapteractivity= spiderman7;
    }
    @Override
    public  Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflaterfoto = (LayoutInflater) adapteractivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View viewfoto = inflaterfoto.inflate(R.layout.layout_spiderman7,container, false);
        ImageView imageView = viewfoto.findViewById(R.id.imagepager);
        imageView.setImageResource(adaptergambarhero[position]);
        container.addView(viewfoto);
        return  viewfoto;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }

    @Override
    public int getCount() {
        return adaptergambarhero.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout)object);
    }
}
