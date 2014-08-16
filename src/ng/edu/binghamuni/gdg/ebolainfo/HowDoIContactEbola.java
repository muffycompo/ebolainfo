package ng.edu.binghamuni.gdg.ebolainfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HowDoIContactEbola extends Activity implements OnClickListener {

	Button btContactNextBtn, btContactPrevBtn;
	TextViewEx tvContactMain, tvContactFluid, tvContactDead, tvContactAnimals;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.how_contact);
		
		btContactNextBtn = (Button) findViewById(R.id.contactNextBtn);
		btContactPrevBtn = (Button) findViewById(R.id.contactPrevBtn);
		
		tvContactMain = (TextViewEx) findViewById(R.id.howdo_you_contact_it_msg);
		tvContactFluid = (TextViewEx) findViewById(R.id.fluid_msg);
		tvContactDead = (TextViewEx) findViewById(R.id.dead_victims_msg);
		tvContactAnimals = (TextViewEx) findViewById(R.id.infected_animals_msg);

		tvContactMain.setText(R.string.howdo_you_contact_it_msg, true);
		tvContactFluid.setText(R.string.fluid_msg, true);
		tvContactDead.setText(R.string.dead_victims_msg, true);
		tvContactAnimals.setText(R.string.infected_animals_msg, true);
		
		btContactNextBtn.setOnClickListener(this);
		btContactPrevBtn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.contactNextBtn:			
			Intent itNext = new Intent(this, WhatAreTheSymptoms.class);
			startActivity(itNext);			
			break;
			
		case R.id.contactPrevBtn:			
			Intent itPrev = new Intent(this, WhatIsEbola.class);
			startActivity(itPrev);			
			break;

		default:
			break;
		}

	}
}
