package br.com.seriesmusculacao.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class AbdomenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		TextView text = new TextView(this);
		text.setText("Abdomen");
		
		setContentView(text);
	}

}
