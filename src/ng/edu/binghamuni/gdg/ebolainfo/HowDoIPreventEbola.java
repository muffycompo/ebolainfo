package ng.edu.binghamuni.gdg.ebolainfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HowDoIPreventEbola extends Activity implements OnClickListener {

	Button btPreventNext;
	Button btPreventPrev;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.how_to_prevent_ebola);
		
		btPreventNext = (Button) findViewById(R.id.btPreventNext);
		btPreventPrev = (Button) findViewById(R.id.btPreventPrev);
		
		btPreventNext.setOnClickListener(this);
		btPreventPrev.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btPreventNext:			
			Intent itNext = new Intent(this, DoNoBeDeceived.class);
			startActivity(itNext);			
			break;
			
		case R.id.btPreventPrev:			
			Intent itPrev = new Intent(this, WhatAreTheSymptoms.class);
			startActivity(itPrev);			
			break;

		default:
			break;
		}

	}
}
