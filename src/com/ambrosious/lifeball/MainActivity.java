package com.ambrosious.lifeball;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;


public class MainActivity extends Activity
{
	ListView lv;
	TaskHelper helper;
	
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		init();
    }
	public void init()
	{
		lv = (ListView)findViewById(R.id.lv1);
		helper.getWritableDatabase();
		
	}
}
