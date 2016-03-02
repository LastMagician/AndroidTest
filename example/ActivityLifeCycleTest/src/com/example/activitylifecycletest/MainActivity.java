package com.example.activitylifecycletest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("TAG", "onCreate");
		setContentView(R.layout.activity_main);

		if (savedInstanceState != null) {
			String tempData = savedInstanceState.getString("data_key");
			Log.d("TAG", tempData);
		}

		Button btn1 = (Button) findViewById(R.id.button1);
		Button btn2 = (Button) findViewById(R.id.button2);
		btn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,
						NormalActivity.class);
				startActivity(intent);
			}
		});
		btn2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,
						DialogActivity.class);
				startActivity(intent);
			}
		});

	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.d("TAG", "onSaveInstanceState");
		String tempData = "Something you just typed";
		outState.putString("data_key", tempData);

		// intent和bundle配合传值
		// Intent intent = new Intent();
		// intent.putExtras(outState);
		// Bundle bun = intent.getExtras();
		// Log.d("data_key", bun.getString("data_key"));
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.d("TAG", "onStart");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d("TAG", "onResume");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.d("TAG", "onPause");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.d("TAG", "onStop");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d("TAG", "onStop");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d("TAG", "onRestart");
	}
}
