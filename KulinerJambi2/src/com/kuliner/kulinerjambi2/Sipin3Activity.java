package com.kuliner.kulinerjambi2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Sipin3Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sipin3);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sipin3, menu);
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
	public void opensipin(View v){
		Intent a = new Intent(getApplicationContext(),SipinActivity.class);
		startActivity(a);
	}
	public void openmain(View v){
		Intent a = new Intent(getApplicationContext(),MainActivity.class);
		startActivity(a);
	}
	public void opensaimen(View v){
	Intent a = new Intent(getApplicationContext(),SaimenActivity.class);
	startActivity(a);
	}
	public void openpiza(View v){
	Intent a = new Intent(getApplicationContext(),PizaActivity.class);
	startActivity(a);
	}
	public void opensipin2(View v){
	Intent a = new Intent(getApplicationContext(),Sipin2Activity.class);
	startActivity(a);
	}
	public void opensipin3(View v){
		Intent a = new Intent(getApplicationContext(),Sipin3Activity.class);
		startActivity(a);
		}
	public void opensipin4(View v){
		Intent a = new Intent(getApplicationContext(),Sipin4Activity.class);
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
	public void opentjg(View v){
		Intent a = new Intent(getApplicationContext(),TanjungActivity.class);
		startActivity(a);
	}
}
