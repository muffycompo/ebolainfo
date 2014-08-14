package ng.edu.binghamuni.gdg.ebolainfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class WhatAreTheSymptoms extends Activity implements OnClickListener {

	Button btSymptomsNext;
	Button btSymptomsPrev;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.symptoms_of_ebola);
		
		btSymptomsNext = (Button) findViewById(R.id.btSymptomsNext);
		btSymptomsPrev = (Button) findViewById(R.id.btSymptomsPrev);
		
		btSymptomsNext.setOnClickListener(this);
		btSymptomsPrev.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btSymptomsNext:			
			Intent itNext = new Intent(this, HowDoIPreventEbola.class);
			startActivity(itNext);			
			break;
			
		case R.id.btSymptomsPrev:			
			Intent itPrev = new Intent(this, HowDoIContactEbola.class);
			startActivity(itPrev);			
			break;

		default:
			break;
		}

	}
}
