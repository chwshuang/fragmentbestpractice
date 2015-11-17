package com.example.fragmentbestpractice;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
/**
 * 主活动
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
	}

}
