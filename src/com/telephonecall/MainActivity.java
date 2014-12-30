package com.telephonecall;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	private EditText editText;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		editText =(EditText)findViewById(R.id.editText);
		Button button =(Button)this.findViewById(R.id.button);
		button.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View button) {			
				String mobile = editText.getText().toString();
				Intent intent = new Intent();
				intent.setAction("android.intent.action.CALL");
				//intent.addCategory("android.intent.category.DEFAULT");
				intent.setData(Uri.parse("tel:"+mobile));
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
