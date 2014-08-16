package ng.edu.binghamuni.gdg.ebolainfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HowDoIPreventEbola extends Activity implements OnClickListener {

	Button preventNextBtn, preventPrevBtn;
	TextViewEx tvWash, tvClean, tvReport, tvProtect;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.how_prevent);
		
		preventNextBtn = (Button) findViewById(R.id.preventNextBtn);
		preventPrevBtn = (Button) findViewById(R.id.preventPrevBtn);
		
		tvWash = (TextViewEx) findViewById(R.id.wash_hands_msg);
		tvClean = (TextViewEx) findViewById(R.id.keep_clean_ev_msg);
		tvReport = (TextViewEx) findViewById(R.id.report_msg);
		tvProtect = (TextViewEx) findViewById(R.id.protect_yourself_msg);
		
		tvWash.setText(R.string.wash_hands_msg, true);
		tvClean.setText(R.string.keep_clean_ev_msg, true);
		tvReport.setText(R.string.report_msg, true);
		tvProtect.setText(R.string.protect_yourself_msg, true);
		
		preventNextBtn.setOnClickListener(this);
		preventPrevBtn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.preventNextBtn:			
			Intent itNext = new Intent(this, DoNoBeDeceived.class);
			startActivity(itNext);			
			break;
			
		case R.id.preventPrevBtn:			
			Intent itPrev = new Intent(this, WhatAreTheSymptoms.class);
			startActivity(itPrev);			
			break;

		default:
			break;
		}

	}
}
