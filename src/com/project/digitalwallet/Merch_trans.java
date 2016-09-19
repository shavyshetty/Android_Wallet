package com.project.digitalwallet;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Merch_trans extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_merch_trans);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_merch_trans, menu);
		return true;
	}

	/** Do something with Item code and item cost which user provides*/
	
	/** Called when the user clicks the OK Button */
	public void gen_QR(View view) {
	    Intent client= new Intent(this,Gen_QR.class);	
	 //** do something/  
	    startActivity(client);
	}
}
