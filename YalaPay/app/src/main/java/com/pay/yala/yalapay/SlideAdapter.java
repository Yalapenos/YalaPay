package com.pay.yala.yalapay;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Kilian on 20.01.2016.
 */
public class SlideAdapter extends FragmentStatePagerAdapter {
    Fragment first;
    Fragment second;
    int count;
    public SlideAdapter(FragmentManager fm,Fragment firstElement, Fragment secondElement,int count) {
        first=firstElement;
        second=secondElement;
        this.count=count;
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment toReturn;
        switch(position) {
            case 0: toReturn=first; break;
            case 1: toReturn=second; break;
        }
        return toReturn;
    }

    @Override
    public int getCount() {
        return count;
    }
}
