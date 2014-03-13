package br.com.seriesmusculacao.activities;

import java.util.ArrayList;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import br.com.seriesmusculacao.R;
import br.com.seriesmusculacao.to.GrupoMuscularTO;

public class GrupoMuscularActivity extends Activity implements OnItemClickListener {

	private TextView tv;
	private ListView lstView;

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
		
		ArrayList<GrupoMuscularTO> lista = new ArrayList<GrupoMuscularTO>();
		lista.add(to1);
		
		lstView = (ListView) findViewById(R.id.lstGrMusculo);
		lstView.setAdapter(null);
		lstView.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		
	}
	
}
