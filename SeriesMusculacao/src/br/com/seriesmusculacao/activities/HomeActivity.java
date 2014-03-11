package br.com.seriesmusculacao.activities;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.TextView;
import br.com.seriesmusculacao.R;
import br.com.seriesmusculacao.to.GrupoMuscularTO;

public class HomeActivity extends Activity {

	private TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.home_activity);
		
		Bundle it = getIntent().getExtras();
		
		if(it != null) {
			tv = (TextView) findViewById(R.id.boasVindas);
			tv.setText(tv.getText() + " " + it.getString("login") + "!");
		}
		
		GrupoMuscularTO to1 = new GrupoMuscularTO();
		to1.setNome("Peitoral");
		to1.setTipo("Body");
		to1.setDescricao("Peitoral");
		
		ArrayList<GrupoMuscularTO> lstGrupoMuscular = new ArrayList<GrupoMuscularTO>();
		lstGrupoMuscular.add(0, to1);
		
		
	}
	
	
}
