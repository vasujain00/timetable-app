package com.example.timetable;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
 
public class TabsPagerrrsAdapter extends FragmentPagerAdapter {
 
    public TabsPagerrrsAdapter(FragmentManager fm) {
        super(fm);
    }
 
    @Override
    public Fragment getItem(int index) {
 
        switch (index) {
        case 0:
        
            return new Class1fFragment();
        case 1:
        
            return new Class2fFragment();
        case 2:
        
            return new Class3fFragment();
            
        case 3:
        	return new Class4fFragment();
        case 4:
        	return new Class5fFragment();
        case 5:
        	return new Class6fFragment();
        }
 
        return null;
    }
 
    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 6;
    }
 
}
