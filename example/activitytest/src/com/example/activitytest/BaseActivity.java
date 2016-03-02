package com.example.activitytest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class BaseActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("FirstActivity", "(BaseActivity)This id is "
				+ getClass().getSimpleName());
		ActivityCollector.addActivity(this);
		// requestWindowFeature(Window.FEATURE_NO_TITLE);
		// setContentView(R.layout.third_layout);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		ActivityCollector.removeActivity(this);
	}
}