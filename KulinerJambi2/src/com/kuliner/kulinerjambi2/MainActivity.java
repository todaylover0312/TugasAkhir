package com.kuliner.kulinerjambi2;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
	 public void openthehok(View v){
			Intent a = new Intent(getApplicationContext(),ThehokActivity.class);
			startActivity(a);
		}
	    public void opentalang(View v){
	  		Intent a = new Intent(getApplicationContext(),TalangActivity.class);
	  		startActivity(a);
	  	}
	    public void opentjg(View v){
	  		Intent a = new Intent(getApplicationContext(),TanjungActivity.class);
	  		startActivity(a);
	  	}
	    public void opensipin(View v){
	  		Intent a = new Intent(getApplicationContext(),SipinActivity.class);
	  		startActivity(a);
	  	}
	    public void opennasgor(View v){
			Intent a = new Intent(getApplicationContext(),NasigorrajActivity.class);
			startActivity(a);
		}
	    public void openbakso1(View v){
			Intent a = new Intent(getApplicationContext(),Bakso1Activity.class);
			startActivity(a);
		}
	    public void opensaimen(View v){
			Intent a = new Intent(getApplicationContext(),SaimenActivity.class);
			startActivity(a);
		}
	    public void openmartabak1(View v){
			Intent a = new Intent(getApplicationContext(),Martabak1Activity.class);
			startActivity(a);
		}
}
