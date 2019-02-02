package com.example.malizen.darokhanehapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class IntroductionAdapter  extends FragmentStatePagerAdapter {
    public IntroductionAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        if (position == 0)
            fragment = new Frag_A();
        else if (position == 1) {
            fragment = new Frag_B();}
        else if (position == 2) {
            fragment = new Frag_C();}
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }}
