package br.com.seriesmusculacao.activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class CarregaSeriesActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Bundle mensagem = getIntent().getExtras();
		
		if(mensagem != null) {
			TextView msg = new TextView(this);
			msg.setText(mensagem.getString("key.serie.grdMuscular.selecionado"));
			setContentView(msg);
		}
	}
}
