package com.example.timetable;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
 
public class TabsPagerAdapterss extends FragmentPagerAdapter {
 
    public TabsPagerAdapterss(FragmentManager fm) {
        super(fm);
    }
 
    @Override
    public Fragment getItem(int index) {
 
        switch (index) {
        case 0:
        
            return new Class1sFragment();
        case 1:
        
            return new Class2sFragment();
        case 2:
        
            return new Class3sFragment();
            
        case 3:
        	return new Class4sFragment();
       
        }
 
        return null;
    }
 
    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 4;
    }
 
}

