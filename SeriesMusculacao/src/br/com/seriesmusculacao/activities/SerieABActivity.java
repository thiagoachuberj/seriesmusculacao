package br.com.seriesmusculacao.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SerieABActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Bundle bundle = getIntent().getExtras();
		
		if(!bundle.isEmpty() || bundle != null) {
			String str = bundle.getString("key.serieAB.boasVindas");
			TextView tv = new TextView(this);
			tv.setText(str);
			
			setContentView(tv);
		}
	}
}
