package com.ruina.simpleviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.net.Uri;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    ViewPagerAdapteR adapteR;

    ArrayList<Components> components= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        viewPager = findViewById(R.id.viewPager);
        adapteR = new ViewPagerAdapteR(this,components);

        viewPager.setAdapter(adapteR);

    }

    private void init() {
        components.add(new Components("ARMA 3", Uri.parse("android.resource://com.ruina.simpleviewpager/drawable/arma3")));
        components.add(new Components("ASSASSIN'S CREED", Uri.parse("android.resource://com.ruina.simpleviewpager/drawable/assassins")));
        components.add(new Components("EURO TRUCK 2", Uri.parse("android.resource://com.ruina.simpleviewpager/drawable/eurotruck")));
        components.add(new Components("KERBAL SPACE PROGRAM", Uri.parse("android.resource://com.ruina.simpleviewpager/drawable/kerbal")));

    }


}
