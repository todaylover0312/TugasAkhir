package com.kuliner.kulinerjambi2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Sipin4Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sipin4);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sipin4, menu);
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
	public void opendinechat(View v){
	Intent a = new Intent(getApplicationContext(),DineChatActivity.class);
	startActivity(a);
	}
	public void opensarinande(View v){
	Intent a = new Intent(getApplicationContext(),SarinandeActivity.class);
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
