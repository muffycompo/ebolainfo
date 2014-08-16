package ng.edu.binghamuni.gdg.ebolainfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class WhatAreTheSymptoms extends Activity implements OnClickListener {


	Button symptomsNextBtn, symptomsPrevBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.what_symptoms);
		
		symptomsNextBtn = (Button) findViewById(R.id.symptomsNextBtn);
		symptomsPrevBtn = (Button) findViewById(R.id.symptomsPrevBtn);
		
		symptomsNextBtn.setOnClickListener(this);
		symptomsPrevBtn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.symptomsNextBtn:			
			Intent itNext = new Intent(this, HowDoIPreventEbola.class);
			startActivity(itNext);			
			break;
			
		case R.id.symptomsPrevBtn:			
			Intent itPrev = new Intent(this, HowDoIContactEbola.class);
			startActivity(itPrev);			
			break;

		default:
			break;
		}

	}
}
