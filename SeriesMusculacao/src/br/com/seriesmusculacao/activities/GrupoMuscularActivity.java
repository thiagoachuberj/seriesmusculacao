package br.com.seriesmusculacao.activities;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import br.com.seriesmusculacao.R;
import br.com.seriesmusculacao.adapter.GrupoMuscularAdapter;
import br.com.seriesmusculacao.bean.GrupoMuscularBean;

public class GrupoMuscularActivity extends Activity implements OnItemClickListener {

	private TextView tv;
	private ListView lstView;
	private ArrayList<GrupoMuscularBean> lista;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.grupo_muscular_activity);
		
		Bundle it = getIntent().getExtras();
		
		if(it != null) {
			tv = (TextView) findViewById(R.id.boasVindas);
			tv.setText(tv.getText() + " " + it.getString("login") + "!");
		}
		
		GrupoMuscularBean to1 = new GrupoMuscularBean();
		to1.setNome("Peito");

		GrupoMuscularBean to2 = new GrupoMuscularBean();
		to2.setNome("Costas");

		GrupoMuscularBean to3 = new GrupoMuscularBean();
		to3.setNome("Braço");
		
		GrupoMuscularBean to4 = new GrupoMuscularBean();
		to4.setNome("Perna");
				
		lista = new ArrayList<GrupoMuscularBean>();
		lista.add(to1);
		lista.add(to2);
		lista.add(to3);
		lista.add(to4);
		
		lstView = (ListView) findViewById(R.id.lstGrMusculo);
		lstView.setAdapter(new GrupoMuscularAdapter(this, lista));
		lstView.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		Intent intent = new Intent(this, CarregaSeriesActivity.class);
		
		String opcaoSelecionada = lista.get(position).getNome();
		
		if(opcaoSelecionada.equals("Peito")) {
			intent.putExtra("key.serie.grdMuscular.selecionado", "Você clicou na serie de Peito");
		}
		else if(opcaoSelecionada.equals("Costas")) {
			intent.putExtra("key.serie.grdMuscular.selecionado", "Você clicou na serie de Costas");
		}
		else if(opcaoSelecionada.equals("Braço")) {
			intent.putExtra("key.serie.grdMuscular.selecionado", "Você clicou na serie de Braço");
		}
		else {
			intent.putExtra("key.serie.grdMuscular.selecionado", "Você clicou na serie de Perna");
		}
		
		startActivity(intent);
	}
	
}
