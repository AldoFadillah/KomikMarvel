package com.example.marvelcomic;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.viewpager.widget.PagerAdapter;

public class fotoadapterdeadpool3 extends PagerAdapter {
    int[] adaptergambarhero;
    Activity adapteractivity;

    public fotoadapterdeadpool3( int[] gambarhero, deadpool3 deadpool3) {
        adaptergambarhero = gambarhero;
        adapteractivity= deadpool3;
    }
    @Override
    public  Object instantiateItem(ViewGroup container, int position) {
        LayoutInflater inflaterfoto = (LayoutInflater) adapteractivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View viewfoto = inflaterfoto.inflate(R.layout.layout_deadpool3,container, false);
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
