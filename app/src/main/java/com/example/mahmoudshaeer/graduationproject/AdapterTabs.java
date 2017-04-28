package com.example.mahmoudshaeer.graduationproject;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * Created by mahmoud Shaeer on 4/12/2017.
 */

public class AdapterTabs extends FragmentPagerAdapter {

   private final String []All_tabs={"All Apps","Usage","Features"};
    private  final Fragment [] all_fragment=new Fragment[All_tabs.length];
    public AdapterTabs(FragmentManager fm) {
        super(fm);
        all_fragment[0]=new fragment_Apps();
        all_fragment[1]=new fragment_Usage();
        all_fragment[2]=new fragment_features();
    }

    @Override
    public Fragment getItem(int position) {
        Log.v("title - getItem = ",All_tabs[position]);
        return all_fragment[position];
    }

    @Override
    public int getCount() {
        return all_fragment.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Log.v("title - getPageTitle = ",String.valueOf(position));
        return All_tabs[position];
    }

}
