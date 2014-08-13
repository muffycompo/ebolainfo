package ng.edu.binghamuni.gdg.ebolainfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	Button btEnlighten;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btEnlighten = (Button) findViewById(R.id.btEnlighten);

		btEnlighten.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Intent it = new Intent(this, WhatIsEbola.class);
		it.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(it);

	}
}
