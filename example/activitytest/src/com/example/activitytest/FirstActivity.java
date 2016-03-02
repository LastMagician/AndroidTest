package com.example.activitytest;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends BaseActivity {

	protected void onCreate(Bundle saveInstanceState) {
		super.onCreate(saveInstanceState);
		// Log.d("FirstActivity", this.toString());
		Log.d("FirstActivity", "(FirstActivity)This id is " + getTaskId());
		// 设置Action Var隐藏
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.first_layout);

		Button btn1 = (Button) findViewById(R.id.button1);
		btn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// Toast.makeText(FirstActivity.this, "youl click button1",
				// Toast.LENGTH_SHORT).show();

				// 销毁活动
				// finish();

				// 显式Intent
				// Intent intent = new Intent(FirstActivity.this,
				// SecondActivity.class);
				// startActivity(intent);

				// 隐式Intent
				// Intent intent = new Intent(
				// "com.example.activitytest.ACTION_START");
				// intent.addCategory("com.example.activitytest.MY_CATEGORY");
				// startActivity(intent);

				// 调用打开浏览器
				// Intent intent = new Intent(Intent.ACTION_VIEW);
				// intent.setData(Uri.parse("http://www.baidu.com")); //
				// 注：http://要加
				// startActivity(intent);

				// 调用电话
				// Intent intent = new Intent(Intent.ACTION_DIAL);
				// intent.setData(Uri.parse("tel:10086"));
				// startActivity(intent);

				// Intent传递数据
				// String data = "Hello World！";
				// Intent intent = new Intent(FirstActivity.this,
				// SecondActivity.class);
				// intent.putExtra("extra_data", data);
				// startActivity(intent);

				// Intent传递数据
				// Intent intent = new Intent(FirstActivity.this,
				// SecondActivity.class);
				// startActivityForResult(intent, 1);

				// New Start Mode
				SecondActivity
						.actionStart(FirstActivity.this, "data1", "data2");
			}
		});

	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.d("FirstActivity", "onStart");
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch (requestCode) {
		case 1:
			if (resultCode == RESULT_OK) {
				String returnedData = data.getStringExtra("data_return");
				Toast.makeText(this, returnedData, Toast.LENGTH_SHORT).show();
			}
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.add_item:
			Toast.makeText(FirstActivity.this, "you click Add",
					Toast.LENGTH_SHORT).show();
			break;
		case R.id.remove_item:
			Toast.makeText(FirstActivity.this, "you click Remove",
					Toast.LENGTH_SHORT).show();
			break;
		default:
		}
		return true;
	}

}
