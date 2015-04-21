package com.example.tab4;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TabHost th=(TabHost) findViewById(R.id.tabhost);
		th.setup();
		
		TabSpec spec=th.newTabSpec("tag1");
		spec.setContent(R.id.tab1);
		spec.setIndicator("PHOTOS");
		th.addTab(spec);
		
		spec=th.newTabSpec("tag2");
		spec.setContent(R.id.tab2);
		spec.setIndicator("SONGS");
		th.addTab(spec);
		
		spec=th.newTabSpec("tag3");
		spec.setContent(R.id.tab3);
		spec.setIndicator("VIDEOS");
		th.addTab(spec);
	}

}
