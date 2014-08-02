package com.androdevs.patientrecord;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class LaunchActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_launch);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.launch, menu);
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

	public void addPatient(View view) {
		Toast.makeText(this, "Will be implemented later", Toast.LENGTH_SHORT)
				.show();
	}

	public void findPatient(View view) {
		Toast.makeText(this, "Will be implemented later", Toast.LENGTH_SHORT)
				.show();
	}

	public void viewAppointments(View view) {
		Toast.makeText(this, "Will be implemented later", Toast.LENGTH_SHORT)
				.show();
	}
}
