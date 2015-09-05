package com.example.timetable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Simple extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Thread timer = new Thread(){
		public void run() {
			try {
				sleep(5000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			} finally {
				Intent open = new Intent("com.example.timetable.MENU");
				startActivity(open);
			}
			
		}
	};
	timer.start();
	}

}
