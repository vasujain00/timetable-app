package com.example.timetable;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Class3fFragment extends Fragment  {
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(com.example.timetable.R.layout.f3_fragment, container, false);
         
        return rootView;
    }
}
