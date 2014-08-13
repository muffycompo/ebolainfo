package ng.edu.binghamuni.gdg.ebolainfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HowDoIContactEbola extends Activity implements OnClickListener {

	Button btContactNext;
	Button btContactPrev;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.how_to_contact_ebola);
		
		btContactNext = (Button) findViewById(R.id.btContactNext);
		btContactPrev = (Button) findViewById(R.id.btContactPrev);
		
		btContactNext.setOnClickListener(this);
		btContactPrev.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btContactNext:			
			Intent itNext = new Intent(this, WhatAreTheSymptoms.class);
			startActivity(itNext);			
			break;
			
		case R.id.btContactPrev:			
			Intent itPrev = new Intent(this, WhatIsEbola.class);
			startActivity(itPrev);			
			break;

		default:
			break;
		}

	}
}
