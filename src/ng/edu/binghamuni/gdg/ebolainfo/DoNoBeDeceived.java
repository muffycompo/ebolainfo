package ng.edu.binghamuni.gdg.ebolainfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DoNoBeDeceived extends Activity implements OnClickListener {

	Button hoaxNextBtn, hoaxPrevBtn;
	TextViewEx tvPrayer, tvBitter, tvSalt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.avoid_hoax);
		
		hoaxNextBtn = (Button) findViewById(R.id.hoaxNextBtn);
		hoaxPrevBtn = (Button) findViewById(R.id.hoaxPrevBtn);
		
		tvPrayer = (TextViewEx) findViewById(R.id.prayer_houses_msg);
		tvBitter = (TextViewEx) findViewById(R.id.bitter_kola_msg);
		tvSalt = (TextViewEx) findViewById(R.id.salt_water_msg);
		
		tvPrayer.setText(R.string.john_g_lake_msg, true);
		tvBitter.setText(R.string.bitter_kola_msg, true);
		tvSalt.setText(R.string.salt_water_msg, true);
		
		hoaxNextBtn.setOnClickListener(this);
		hoaxPrevBtn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.hoaxNextBtn:			
			Intent itNext = new Intent(this, WhatDoIDoNow.class);
			startActivity(itNext);			
			break;
			
		case R.id.hoaxPrevBtn:			
			Intent itPrev = new Intent(this, HowDoIPreventEbola.class);
			startActivity(itPrev);			
			break;

		default:
			break;
		}

	}
}
