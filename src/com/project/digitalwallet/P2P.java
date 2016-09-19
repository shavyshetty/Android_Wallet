package com.project.digitalwallet;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class P2P extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_p2_p);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_p2_p, menu);
		return true;
	}

}
