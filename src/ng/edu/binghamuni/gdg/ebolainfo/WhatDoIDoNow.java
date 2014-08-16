package ng.edu.binghamuni.gdg.ebolainfo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class WhatDoIDoNow extends Activity implements OnClickListener {

	Button whatNextPrevBtn, whatNextHomeBtn;
	TextViewEx tvWhatTo;
	TextView first_number, second_number, third_number;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.what_next);

		whatNextHomeBtn = (Button) findViewById(R.id.whatNextHomeBtn);
		whatNextPrevBtn = (Button) findViewById(R.id.whatNextPrevBtn);
		
		tvWhatTo = (TextViewEx) findViewById(R.id.what_to_do_string);
		first_number = (TextView) findViewById(R.id.first_number);
		second_number = (TextView) findViewById(R.id.second_number);
		third_number = (TextView) findViewById(R.id.third_number);
		
		tvWhatTo.setText(R.string.what_to_do_string, true);
		
		whatNextHomeBtn.setOnClickListener(this);
		whatNextPrevBtn.setOnClickListener(this);

		first_number.setOnClickListener(this);
		second_number.setOnClickListener(this);
		third_number.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.whatNextHomeBtn:
			Intent itNext = new Intent(this, WhatIsEbola.class);
			startActivity(itNext);
			break;

		case R.id.whatNextPrevBtn:
			Intent itPrev = new Intent(this, DoNoBeDeceived.class);
			startActivity(itPrev);
			break;

		case R.id.first_number:
			Intent firstN = new Intent(Intent.ACTION_CALL, Uri.parse("tel:0800326524357"));
			firstN.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(firstN);
			break;

		case R.id.second_number:
			Intent secondN = new Intent(Intent.ACTION_CALL, Uri.parse("tel:08037879701"));
			secondN.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(secondN);
			break;

		case R.id.third_number:
			Intent thirdN = new Intent(Intent.ACTION_CALL, Uri.parse("tel:08037154575"));
			thirdN.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(thirdN);
			break;

		default:
			break;
		}

	}
}
