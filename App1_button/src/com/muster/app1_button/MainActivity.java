package com.muster.app1_button;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
	private TextView nachricht;
	private EditText eingabe;
	private Button knopf;
	private boolean erster_klick;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		nachricht = (TextView) findViewById(R.id.nachricht);
		eingabe = (EditText) findViewById(R.id.eingabe);
		knopf = (Button) findViewById(R.id.button1);
		erster_klick = true;
		nachricht.setText(R.string.willkommen);
		knopf.setText(R.string.weiter);
		knopf.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				if (erster_klick) {
					nachricht.setText(getString(R.string.hallo,
							eingabe.getText()));
					eingabe.setVisibility(View.INVISIBLE);
					knopf.setText(R.string.fertig);
					erster_klick = false;
				} else {
					finish();
				}
			}
		});
	}
}
    
 
