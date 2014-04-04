package br.com.seriesmusculacao.activities;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import br.com.seriesmusculacao.R;
import br.com.seriesmusculacao.adapter.TipoSerieAdapter;
import br.com.seriesmusculacao.bean.tiposeries.ATipoSerie;
import br.com.seriesmusculacao.bean.tiposeries.TipoSerieAB;
import br.com.seriesmusculacao.bean.tiposeries.TipoSerieABC;

public class GrupoMuscularActivity extends Activity implements OnItemClickListener {

	private TextView tv;
	private ListView lstView;
	private ArrayList<ATipoSerie> lista;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.grupo_muscular_activity);
		
		Bundle it = getIntent().getExtras();
		
		if(it != null) {
			tv = (TextView) findViewById(R.id.boasVindas);
			tv.setText(tv.getText() + " " + it.getString("login") + "!");
		}
		
		TipoSerieAB to1 = new TipoSerieAB();
		to1.setNome("Série - AB");
		to1.setDescricao("Série AB é para um treino mais intenso.");
		
		TipoSerieABC to2 = new TipoSerieABC();
		to2.setNome("Série - ABC");
		to2.setDescricao("Série AB é para um treino mais intenso.");
		
		lista = new ArrayList<ATipoSerie>();
		lista.add(to1);
		lista.add(to2);
		
		lstView = (ListView) findViewById(R.id.lstGrMusculo);
		lstView.setAdapter(new TipoSerieAdapter(this, lista));
		lstView.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		Intent intent = null;
		
		ATipoSerie tipoSerie = lista.get(position);
		
		intent = tipoSerie.preparaTelaTipoObjetivo(this, tipoSerie);
		
		startActivity(intent);
	}
	
}
