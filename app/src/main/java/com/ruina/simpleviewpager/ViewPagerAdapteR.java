package com.ruina.simpleviewpager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ViewPagerAdapteR extends PagerAdapter {

    Context context;
    ArrayList<Components> listOfComponents;
    LayoutInflater inflater;

    public ViewPagerAdapteR(Context context, ArrayList<Components> listOfComponents) {
        this.context = context;
        this.listOfComponents = listOfComponents;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listOfComponents.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = inflater.inflate(R.layout.viewpager_layout,container,false);

        TextView textView = view.findViewById(R.id.textView);
        textView.setText(listOfComponents.get(position).getMovieName());

        ImageView imageView = view.findViewById(R.id.imageView);
        Glide.with(context).load(listOfComponents.get(position).getMovieUri()).into(imageView);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);


    }
}
