package com.pay.yala.yalapay;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;

public class YalaPay extends FragmentActivity {

    static final int NUM_ITEMS=10;

    private ViewPager mPager;
    private PagerAdapter mPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_pager);

        mPager= (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new SlideAdapter(getSupportFragmentManager(),StartFragment,TransactionsFragment,2);
        mPager.setAdapter(mPagerAdapter);

    }

    @Override
    public void onBackPressed() {
        if (mPager.getCurrentItem() == 0) {
            super.onBackPressed();
        } else {
            mPager.setCurrentItem(mPager.getCurrentItem()-1);
        }
    }


}
