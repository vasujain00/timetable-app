package com.example.timetable;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
 
public class TabsPagerAdapter extends FragmentPagerAdapter {
 
    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }
 
    @Override
    public Fragment getItem(int index) {
 
        switch (index) {
        case 0:
        
            return new Class1tFragment();
        case 1:
        
            return new Class2tFragment();
        case 2:
        
            return new Class3tFragment();
            
        case 3:
        	return new Class4tFragment();
        case 4:
        	return new Class5tFragment();
        }
 
        return null;
    }
 
    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 5;
    }
 
}
