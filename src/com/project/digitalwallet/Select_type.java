package com.project.digitalwallet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class Select_type extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select_type);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_select_type, menu);
		return true;
	}
	
	/** Called when the user clicks the Merchant Button */
	public void merchant(View view) {
	    Intent merch= new Intent(this,Merchant.class);	
	 //** do something/  
	    startActivity(merch);
	}
	
	/** Called when the user clicks the CLient Button */
	public void client(View view) {
	    Intent client= new Intent(this,Client.class);	
	 //** do something/  
	    startActivity(client);
	}

}
