package com.project.digitalwallet;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Client extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_client);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_client, menu);
		return true;
	}

	/** Called when the user clicks the Make Transactions Button */
	public void client_trans(View view) {
	    Intent client= new Intent(this,Client_trans.class);	
	 //** do something/  
	    startActivity(client);
	}
	
	/** Called when the user clicks the Exchange Rates Button */
	public void exchange_rates(View view) {
	    Intent client= new Intent(this,Exchange_rates.class);	
	 //** do something/  
	    startActivity(client);
	}
	
	/** Called when the user clicks the Logs Button */
	public void logs(View view) {
	    Intent client= new Intent(this,Logs.class);	
	 //** do something/  
	    startActivity(client);
	}
	
	/** Called when the user clicks the Check Balance Button */
	public void check_balance(View view) {
	    Intent client= new Intent(this,Check_bal.class);	
	 //** do something/  
	    startActivity(client);
	}
	
	/** Called when the user clicks the P2P Button */
	public void p2p(View view) {
	    Intent client= new Intent(this,P2P.class);	
	 //** do something/  
	    startActivity(client);
	}
	
	/** Called when the user clicks the Trusted Contacts Button */
	public void trusted_contacts(View view) {
	    Intent client= new Intent(this,Trusted_contacts.class);	
	 //** do something/  
	    startActivity(client);
	}
}
