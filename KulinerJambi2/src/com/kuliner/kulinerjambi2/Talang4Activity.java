package com.kuliner.kulinerjambi2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Talang4Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_talang4);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.talang4, menu);
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
	public void opentalang(View v){
		Intent a = new Intent(getApplicationContext(),TalangActivity.class);
		startActivity(a);
	}
	public void openmain(View v){
		Intent a = new Intent(getApplicationContext(),MainActivity.class);
		startActivity(a);
	}
	public void openmitra1(View v){
	Intent a = new Intent(getApplicationContext(),Mitra1Activity.class);
	startActivity(a);
	}
	public void openbakso1(View v){
	Intent a = new Intent(getApplicationContext(),Bakso1Activity.class);
	startActivity(a);
	}
	public void opentalang2(View v){
	Intent a = new Intent(getApplicationContext(),Talang2Activity.class);
	startActivity(a);
	}
	public void opentalang3(View v){
		Intent a = new Intent(getApplicationContext(),Talang3Activity.class);
		startActivity(a);
		}
	public void opentalang4(View v){
		Intent a = new Intent(getApplicationContext(),Talang4Activity.class);
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
	public void opentjg(View v){
		Intent a = new Intent(getApplicationContext(),TanjungActivity.class);
		startActivity(a);
	}
}
