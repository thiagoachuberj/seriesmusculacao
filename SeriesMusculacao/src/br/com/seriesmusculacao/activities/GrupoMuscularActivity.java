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
import br.com.seriesmusculacao.adapter.GrupoMuscularAdapter;
import br.com.seriesmusculacao.bean.AGrupamentoMuscular;
import br.com.seriesmusculacao.bean.Abdomen;
import br.com.seriesmusculacao.bean.Braco;
import br.com.seriesmusculacao.bean.Costas;
import br.com.seriesmusculacao.bean.Peito;
import br.com.seriesmusculacao.bean.Perna;

public class GrupoMuscularActivity extends Activity implements OnItemClickListener {

	private TextView tv;
	private ListView lstView;
	private ArrayList<AGrupamentoMuscular> lista;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.grupo_muscular_activity);
		
		Bundle it = getIntent().getExtras();
		
		if(it != null) {
			tv = (TextView) findViewById(R.id.boasVindas);
			tv.setText(tv.getText() + " " + it.getString("login") + "!");
		}
		
		Peito to1 = new Peito();
		to1.setNome("Peito");

		Costas to2 = new Costas();
		to2.setNome("Costas");

		Braco to3 = new Braco();
		to3.setNome("Braço");
		
		Perna to4 = new Perna();
		to4.setNome("Perna");
		
		Abdomen to5 = new Abdomen();
		to5.setNome("Abdômen");
				
		lista = new ArrayList<AGrupamentoMuscular>();
		lista.add(to1);
		lista.add(to2);
		lista.add(to3);
		lista.add(to4);
		lista.add(to5);
		
		lstView = (ListView) findViewById(R.id.lstGrMusculo);
		lstView.setAdapter(new GrupoMuscularAdapter(this, lista));
		lstView.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		Intent intent = null;
		
		AGrupamentoMuscular grupoMuscular = lista.get(position);
		
		intent = grupoMuscular.preparaTelaGrupamento(this, grupoMuscular);
		
		startActivity(intent);
	}
	
}
