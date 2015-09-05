package com.example.timetable;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
 
public class TabssPagerAdapter extends FragmentPagerAdapter {
 
    public TabssPagerAdapter(FragmentManager fm) {
        super(fm);
    }
 
    @Override
    public Fragment getItem(int index) {
 
        switch (index) {
        case 0:
        
            return new Class1wFragment();
        case 1:
        
            return new Class2wFragment();
        case 2:
        
            return new Class3wFragment();
            
        case 3:
        	return new Class4wFragment();
        
        }
 
        return null;
    }
 
    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 4;
    }
 
}
