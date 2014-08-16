package ng.edu.binghamuni.gdg.ebolainfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	Button btEnlightenHome;
	TextViewEx tvPreamble;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.home);

		tvPreamble = (TextViewEx) findViewById(R.id.tvPre);
		btEnlightenHome = (Button) findViewById(R.id.btEnlightenHome);
		
		tvPreamble.setText(R.string.preamble,true);

		btEnlightenHome.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		Intent it = new Intent(getApplicationContext(), WhatIsEbola.class);
		startActivity(it);
	}
}
