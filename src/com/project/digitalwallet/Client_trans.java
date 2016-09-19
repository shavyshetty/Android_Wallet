package com.project.digitalwallet;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Client_trans extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_client_trans);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_client_trans, menu);
		return true;
	}

	/** Called when the user clicks the Capture QR Button */
	public void capture_qr(View view) {
	    Intent client= new Intent(this,Capture_QR.class);	
	 //** do something/  
	    startActivity(client);
	}
	
	
}
