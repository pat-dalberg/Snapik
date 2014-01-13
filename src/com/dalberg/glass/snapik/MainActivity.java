package com.dalberg.glass.snapik;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		takePicture();
	}

	private void takePicture() {
		Intent takePictureIntent = new Intent(
				"android.intent.action.CAMERA_BUTTON");
		getApplicationContext().sendBroadcast(takePictureIntent);
		finish();
	}

}
