package ng.edu.binghamuni.gdg.ebolainfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class WhatDoIDoNow extends Activity implements OnClickListener {

	Button btWhatToDoNext;
	Button btWhatToDoPrev;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.what_to_do);
		
		btWhatToDoNext = (Button) findViewById(R.id.btWhatToDoNext);
		btWhatToDoPrev = (Button) findViewById(R.id.btWhatToDoPrev);
		
		btWhatToDoNext.setOnClickListener(this);
		btWhatToDoPrev.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btWhatToDoNext:			
			Intent itNext = new Intent(this, MainActivity.class);
			itNext.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(itNext);			
			break;
			
		case R.id.btWhatToDoPrev:			
			Intent itPrev = new Intent(this, DoNoBeDeceived.class);
			startActivity(itPrev);			
			break;

		default:
			break;
		}

	}
}
