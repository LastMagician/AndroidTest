package com.example.uiwidgettest;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener {
	
	private Button button;
	private EditText editText;
	private ImageView imageView;
	private ProgressBar progressBar;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.btn1);
        editText=(EditText)findViewById(R.id.edittext);
        imageView=(ImageView)findViewById(R.id.image_view);
        progressBar=(ProgressBar)findViewById(R.id.progress_bar);
        button.setOnClickListener(this);
    }
    
    public void onClick(View v) {
		Log.d("button", "msg");
		switch (v.getId()) {
		case R.id.btn1:
			//Alert Input Text
//			String inputText=editText.getText().toString();
//			Toast.makeText(this, inputText, Toast.LENGTH_SHORT).show();
			
			//set Image
//			imageView.setImageResource(R.drawable.image_view);
			
//			//Switch ProgressBar
//			if (progressBar.getVisibility()==View.GONE) {
//				progressBar.setVisibility(View.VISIBLE);
//			} else {
//				progressBar.setVisibility(View.GONE);
//			}
			
			//Set Progress
//			int progress=progressBar.getProgress();
//			if (progress == 100) {
//				progressBar.setProgress(0);
//			} else {
//				progress = progress + 10;
//				progressBar.setProgress(progress);				
//			}
			
			//AlertDialog
//			AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);
//			dialog.setTitle("This is Dialog");
//			dialog.setMessage("Something important.");
//			dialog.setCancelable(false); //设置true点dialog意外的地方关闭dialog
//			dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
//				
//				@Override
//				public void onClick(DialogInterface dialog, int which) {
//					// TODO Auto-generated method stub
//					Toast.makeText(MainActivity.this, "OK", Toast.LENGTH_SHORT).show();
//				}
//			});
//			dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//				
//				@Override
//				public void onClick(DialogInterface dialog, int which) {
//					// TODO Auto-generated method stub
//					Toast.makeText(MainActivity.this, "Cancel", Toast.LENGTH_SHORT).show();
//					
//				}
//			});
//			dialog.show();
			
			ProgressDialog progressDialog=new ProgressDialog(MainActivity.this);
			progressDialog.setTitle("This is ProgressDialog");
			progressDialog.setMessage("Loading....");
			progressDialog.setCancelable(false);
			progressDialog.show();
			//Cancel ProgressDialog
//			progressDialog.dismiss(); 
			break;
		default:
			break;
		}
			
	}
}
