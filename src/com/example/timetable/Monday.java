package com.example.timetable;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Monday extends ListActivity {
    String classes[]= {"Class1","Class2","Class3","Class4","Class5","Class6","Class7","Class8","Class9"};
    
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(Monday.this,android.R.layout.simple_list_item_1, classes));
	}
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String cheese = classes[position];
		try {
			Class ourClasses = Class.forName("com.example.timetable."+ cheese);
			Intent ourIntent = new Intent(Monday.this,ourClasses);
			startActivity(ourIntent);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
