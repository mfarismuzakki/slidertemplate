package com.example.mfari.sliderdewi;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context = context;
    }

    //daftar gambar
    public int[] slide_image = {
            R.drawable.a1,
            R.drawable.a2,
            R.drawable.a3,
            R.drawable.a4,

    };

    //daftar header
    public String[] slide_heading = {
            "KEMAMPUAN EFEKTIF MEMBACA",
            "LATIHAN",
            "GRAFIK",
            "SELAMAT DATANG"
    };

    //daftar deskripsi
    public String[] slide_descs = {
            "Aplikasi ini akan memudahkanmu berlatih meningkatkan Kemampuan Efektif Membaca    secara mandiri di mana pun kamu berada.",
            "Aplikasi ini dilengkapi dengan teks dan soal guna melihat sejauh mana kemampuan membacamu.",
            "Lihat grafik untuk melihat seberapa besar peningkatan kemampuan membacamu.",
            "di Aplikasi Pelatihan Kemampuan Efektif Membaca untuk Kelas 5 SD"
    };



    @Override
    public int getCount(){
        return slide_heading.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object o){
        return view == (RelativeLayout) o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false
        );

        ImageView slideImage = (ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);
        TextView slideDesc = (TextView) view.findViewById(R.id.slide_desc);

        slideImage.setImageResource(slide_image[position]);
        slideHeading.setText(slide_heading[position]);
        slideDesc.setText(slide_descs[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((RelativeLayout)object);
    }


}
