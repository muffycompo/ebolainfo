package ng.edu.binghamuni.gdg.ebolainfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class WhatIsEbola extends Activity implements OnClickListener {

	Button btWhatNextBtn;
	TextViewEx tvItIsBloody, tvItIsContagious, tvReallyDeadly, tvUntreatable;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.what);

		btWhatNextBtn = (Button) findViewById(R.id.whatNextBtn);
		
		tvItIsBloody = (TextViewEx) findViewById(R.id.it_is_bloody_msg);
		tvItIsContagious = (TextViewEx) findViewById(R.id.it_is_contagious_msg);
		tvReallyDeadly = (TextViewEx) findViewById(R.id.really_deadly_msg);
		tvUntreatable = (TextViewEx) findViewById(R.id.un_treatable_msg);

		tvItIsBloody.setText(R.string.it_is_bloody_msg, true);
		tvItIsContagious.setText(R.string.it_is_contagious_msg, true);
		tvReallyDeadly.setText(R.string.really_deadly_msg, true);
		tvUntreatable.setText(R.string.untreatable_msg, true);

		btWhatNextBtn.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		Intent itNext = new Intent(this, HowDoIContactEbola.class);
		startActivity(itNext);

	}
}
