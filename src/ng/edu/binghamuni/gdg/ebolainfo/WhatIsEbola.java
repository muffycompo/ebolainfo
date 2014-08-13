package ng.edu.binghamuni.gdg.ebolainfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class WhatIsEbola extends Activity implements OnClickListener {
	
	Button btNext;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.what_is_ebola);
		
		btNext = (Button) findViewById(R.id.btWhat);
		btNext.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		Intent itNext = new Intent(this, HowDoIContactEbola.class);
		startActivity(itNext);

	}
}
