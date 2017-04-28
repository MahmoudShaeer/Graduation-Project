package com.example.mahmoudshaeer.graduationproject;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerTabStrip;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class Home extends AppCompatActivity {

    private ViewPager mViewPager;
    private  TabLayout pagerTabStrip;
    // icone with title tabs
    /*private int[] tabIcons = {
            R.drawable.allapps,
            R.drawable.usage,
            R.drawable.features
    };
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setElevation(0);
       // android.app.ActionBar actionBar = getActionBar();
        mViewPager=(ViewPager)findViewById(R.id.ViewPager);
        AdapterTabs adapterTabs=new AdapterTabs(getSupportFragmentManager());
        mViewPager.setAdapter(adapterTabs);
        mViewPager.setCurrentItem(0);

        pagerTabStrip=(TabLayout)findViewById(R.id.PagerTabStrip);
        pagerTabStrip.setupWithViewPager(mViewPager);
        setupTabIcons();

    }

    private void setupTabIcons() {

        TextView tabOne = (TextView) LayoutInflater.from(this).inflate(R.layout.shapetitlepage, null);
        tabOne.setText("  All Apps");
        tabOne.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.allapps, 0, 0);
        pagerTabStrip.getTabAt(0).setCustomView(tabOne);

        TextView tabTwo = (TextView) LayoutInflater.from(this).inflate(R.layout.shapetitlepage, null);
        tabTwo.setText("    Usage");
        tabTwo.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.usage, 0, 0);
        pagerTabStrip.getTabAt(1).setCustomView(tabTwo);

        TextView tabThree = (TextView) LayoutInflater.from(this).inflate(R.layout.shapetitlepage, null);
        tabThree.setText(" Features");
        tabThree.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.features, 0, 0);
        pagerTabStrip.getTabAt(2).setCustomView(tabThree);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
 //       return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.ConnectingWebsite) {
           // go to acitvty has rondom String to set it in the website
            return true;
        }
        else if(id == R.id.action_settings)
        {
            // go to setting of app
            return true;
        }
        else if(id == R.id.Guide)
        {
            // go to acivity show th vedio
            return true;
        }
        else if (id == R.id.about)
        {
            // go to acivity has information about us
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}