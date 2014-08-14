package ng.edu.binghamuni.gdg.ebolainfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class WhatIsEbola extends Activity implements OnClickListener {
	
	Button btNext;
	TextView tvWhatIs;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.what_is_ebola);
		
		btNext = (Button) findViewById(R.id.btWhat);
		tvWhatIs = (TextView) findViewById(R.id.tvContact4);
		
		tvWhatIs.setText(R.string.it_is_contagious_msg);
		
		btNext.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		Intent itNext = new Intent(this, HowDoIContactEbola.class);
		startActivity(itNext);

	}
}
