package ng.edu.binghamuni.gdg.ebolainfo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class WhatDoIDoNow extends Activity implements OnClickListener {

	Button btWhatToDoNext;
	Button btWhatToDoPrev;
	TextView first_number, second_number, third_number, fourth_number,
			fift_number, sixth_number;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.what_to_do);

		btWhatToDoNext = (Button) findViewById(R.id.btWhatToDoNext);
		btWhatToDoPrev = (Button) findViewById(R.id.btWhatToDoPrev);

		first_number = (TextView) findViewById(R.id.first_number);
		second_number = (TextView) findViewById(R.id.second_number);
		third_number = (TextView) findViewById(R.id.third_number);
		fourth_number = (TextView) findViewById(R.id.fourth_number);
		fift_number = (TextView) findViewById(R.id.fift_number);
		sixth_number = (TextView) findViewById(R.id.sixth_number);

		btWhatToDoNext.setOnClickListener(this);
		btWhatToDoPrev.setOnClickListener(this);

		first_number.setOnClickListener(this);
		second_number.setOnClickListener(this);
		third_number.setOnClickListener(this);
		fourth_number.setOnClickListener(this);
		fift_number.setOnClickListener(this);
		sixth_number.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btWhatToDoNext:
			Intent itNext = new Intent(this, MainActivity.class);
			startActivity(itNext);
			break;

		case R.id.btWhatToDoPrev:
			Intent itPrev = new Intent(this, DoNoBeDeceived.class);
			startActivity(itPrev);
			break;

		case R.id.first_number:
			Intent firstN = new Intent(Intent.ACTION_CALL, Uri.parse("tel:0800326524357"));
			firstN.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(firstN);
			break;

		case R.id.second_number:
			Intent secondN = new Intent(Intent.ACTION_CALL, Uri.parse("tel:08023169485"));
			secondN.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(secondN);
			break;

		case R.id.third_number:
			Intent thirdN = new Intent(Intent.ACTION_CALL, Uri.parse("tel:08033086660"));
			thirdN.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(thirdN);
			break;

		case R.id.fourth_number:
			Intent fourthN = new Intent(Intent.ACTION_CALL, Uri.parse("tel:08033065303"));
			fourthN.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(fourthN);
			break;

		case R.id.fift_number:
			Intent fiftN = new Intent(Intent.ACTION_CALL, Uri.parse("tel:08055281442"));
			fiftN.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(fiftN);
			break;

		case R.id.sixth_number:
			Intent sixthN = new Intent(Intent.ACTION_CALL, Uri.parse("tel:08055329229"));
			sixthN.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(sixthN);
			break;

		default:
			break;
		}

	}
}
