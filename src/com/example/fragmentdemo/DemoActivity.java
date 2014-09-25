package com.example.fragmentdemo;

import com.example.fragmentdemo.MainFragment.OnSubmitListener;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DemoActivity extends Activity implements OnSubmitListener {

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

	public void onSubmission(String text) {
		SecondFragment fragment = (SecondFragment) getFragmentManager()
				.findFragmentById(R.id.fragmentSecond);
		if (fragment != null && fragment.isInLayout()) {
			TextView tv1 = (TextView) findViewById(R.id.TextView1);
			tv1.setText(text); //TODO: make update persist rotation
		}
	}

}
