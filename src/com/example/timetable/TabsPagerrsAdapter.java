package com.example.timetable;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
 
public class TabsPagerrsAdapter extends FragmentPagerAdapter {
 
    public TabsPagerrsAdapter(FragmentManager fm) {
        super(fm);
    }
 
    @Override
    public Fragment getItem(int index) {
 
        switch (index) {
        case 0:
        
            return new Class1thFragment();
        case 1:
        
            return new Class2thFragment();
        case 2:
        
            return new Class3thFragment();
            
        case 3:
        	return new Class4thFragment();
        case 4:
        	return new Class5thFragment();
        case 5: 
        	return new Class6thFragment();
        }
 
        return null;
    }
 
    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 6;
    }
 
}
