package com.project.digitalwallet;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v4.app.NavUtils;

public class Merchant extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_merchant);
		// Show the Up button in the action bar.
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_merchant, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	/** Called when the user clicks the Logs Button */
	public void Logs(View view) {
	    Intent client= new Intent(this,Logs.class);	
	 //** do something/  
	    startActivity(client);
	}
	
	/** Called when the user clicks the Make Transaction Button */
	public void merch_trans(View view) {
	    Intent client= new Intent(this,Merch_trans.class);	
	 //** do something/  
	    startActivity(client);
	}
	
	/** Called when the user clicks the Exchange Rates Button */
	public void exchange_rates(View view) {
	    Intent client= new Intent(this,Exchange_rates.class);	
	 //** do something/  
	    startActivity(client);
	}
		
}
