package com.example.activitytest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class SecondActivity extends BaseActivity {
	protected void onCreate(Bundle saveInstanceState) {
		super.onCreate(saveInstanceState);
		// Log.d("SecondActivity", this.toString());
		Log.d("FirstActivity", "(SecondActivity)This id is " + getTaskId());
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.second_layout);
		Intent intent = getIntent();
		String data = intent.getStringExtra("extra_data");

		Button btn1 = (Button) findViewById(R.id.button1);
		btn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// ------With Intent Dissemination of data-------
				// Intent intent = new Intent();
				// intent.putExtra("data_return", "按了按钮");
				// setResult(RESULT_OK, intent);
				// finish();
				Intent intent = new Intent(SecondActivity.this,
						ThirdActivity.class);
				startActivity(intent);
			}
		});
	}

	// Start Method
	public static void actionStart(Context context, String data1, String data2) {
		Intent intent = new Intent(context, SecondActivity.class);
		intent.putExtra("param1", data1);
		intent.putExtra("param2", data2);
		context.startActivity(intent);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d("SecondActivity", "onDestroy");
	}

	@Override
	public void onBackPressed() {
		Intent intent = new Intent();
		intent.putExtra("data_return", "按了返回键");
		setResult(RESULT_OK, intent);
		finish();
	}
}
