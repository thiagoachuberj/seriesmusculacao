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
		
		TipoSerieABC to3 = new TipoSerieABC();
		to3.setNome("Série - ABC");
		to3.setDescricao("Série AB é para um treino mais intenso.");
		TipoSerieABC to4 = new TipoSerieABC();
		to4.setNome("Série - ABC");
		to4.setDescricao("Série AB é para um treino mais intenso.");
		TipoSerieABC to5 = new TipoSerieABC();
		to5.setNome("Série - ABC");
		to5.setDescricao("Série AB é para um treino mais intenso.");
		TipoSerieABC to6 = new TipoSerieABC();
		to6.setNome("Série - ABC");
		to6.setDescricao("Série AB é para um treino mais intenso.");
		TipoSerieABC to7 = new TipoSerieABC();
		to7.setNome("Série - ABC");
		to7.setDescricao("Série AB é para um treino mais intenso.");
		TipoSerieABC to8 = new TipoSerieABC();
		to8.setNome("Série - ABC");
		to8.setDescricao("Série AB é para um treino mais intenso.");
		TipoSerieABC to9 = new TipoSerieABC();
		to9.setNome("Série - ABC");
		to9.setDescricao("Série AB é para um treino mais intenso.");
		TipoSerieABC to10 = new TipoSerieABC();
		to10.setNome("Série - ABC");
		to10.setDescricao("Série AB é para um treino mais intenso.");
		
		lista = new ArrayList<ATipoSerie>();
		lista.add(to1);
		lista.add(to2);
		lista.add(to3);
		lista.add(to4);
		lista.add(to5);
		lista.add(to6);
		lista.add(to7);
		lista.add(to8);
		lista.add(to9);
		lista.add(to10);
		
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
