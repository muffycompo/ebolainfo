package ng.edu.binghamuni.gdg.ebolainfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	Button btEnlighten;
	TextView tvPreamble;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		tvPreamble = (TextView) findViewById(R.id.tvPreamble);
		btEnlighten = (Button) findViewById(R.id.btEnlighten);

		tvPreamble.setText(R.string.preamble);
		
		btEnlighten.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		Intent it = new Intent(this, WhatIsEbola.class);
		startActivity(it);
	}
}
