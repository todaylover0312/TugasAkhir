package com.kuliner.kulinerjambi2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class TanjungActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tanjung);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tanjung, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	public void opentjg(View v){
		Intent a = new Intent(getApplicationContext(),TanjungActivity.class);
		startActivity(a);
	}
	public void openmain(View v){
		Intent a = new Intent(getApplicationContext(),MainActivity.class);
		startActivity(a);	
	}
	public void openrajawali(View v){
	Intent a = new Intent(getApplicationContext(),NasigorrajActivity.class);
	startActivity(a);
	}
	public void opensiobak(View v){
	Intent a = new Intent(getApplicationContext(),SiobakActivity.class);
	startActivity(a);
	}
	public void opentjg2(View v){
	Intent a = new Intent(getApplicationContext(),Tanjung2Activity.class);
	startActivity(a);
	}
	public void opentalang(View v){
		Intent a = new Intent(getApplicationContext(),TalangActivity.class);
		startActivity(a);
	}
	public void openthehok(View v){
		Intent a = new Intent(getApplicationContext(),ThehokActivity.class);
		startActivity(a);
	}
	public void opensipin(View v){
		Intent a = new Intent(getApplicationContext(),SipinActivity.class);
		startActivity(a);
	}
}
