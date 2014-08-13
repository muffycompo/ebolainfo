package ng.edu.binghamuni.gdg.ebolainfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DoNoBeDeceived extends Activity implements OnClickListener {

	Button btHoaxNext;
	Button btHoaxPrev;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.avoiding_ebola_hoax);
		
		btHoaxNext = (Button) findViewById(R.id.btHoaxNext);
		btHoaxPrev = (Button) findViewById(R.id.btHoaxPrev);
		
		btHoaxNext.setOnClickListener(this);
		btHoaxPrev.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btHoaxNext:			
			Intent itNext = new Intent(this, WhatDoIDoNow.class);
			startActivity(itNext);			
			break;
			
		case R.id.btHoaxPrev:			
			Intent itPrev = new Intent(this, HowDoIPreventEbola.class);
			startActivity(itPrev);			
			break;

		default:
			break;
		}

	}
}
