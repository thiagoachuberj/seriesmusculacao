package br.com.seriesmusculacao.activities;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import br.com.seriesmusculacao.R;
import br.com.seriesmusculacao.adapter.TipoGrupamentoAdapter;
import br.com.seriesmusculacao.bean.grupamentoseries.ATipoGrupamentoSerie;
import br.com.seriesmusculacao.bean.grupamentoseries.PeitoTriceps;

public class SerieABCActivity extends Activity implements OnItemClickListener {

	private ListView lstView;
	private ArrayList<ATipoGrupamentoSerie> lista;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.serieabc_activity);
		
		PeitoTriceps pt = new PeitoTriceps();
		pt.setNome("Peito/Tríceps");
		pt.setDescricao("Séries relacionado aos grupamentos Peito e Tríceps");
		
		PeitoTriceps pt1 = new PeitoTriceps();
		pt1.setNome("Costas/Bíceps");
		pt1.setDescricao("Séries relacionado aos grupamentos Costas e Bíceps");
		
		PeitoTriceps pt2 = new PeitoTriceps();
		pt2.setNome("Ombro/Perna");
		pt2.setDescricao("Séries relacionado aos grupamentos Ombro e Perna");
		
		lista = new ArrayList<ATipoGrupamentoSerie>();
		lista.add(pt);
		lista.add(pt1);
		lista.add(pt2);
		
		lstView = (ListView) findViewById(R.id.lstTipoGrupamento);
		lstView.setAdapter(new TipoGrupamentoAdapter(lista, this));
		lstView.setOnItemClickListener(this);
	}
	
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		Intent intent = null;
		
		ATipoGrupamentoSerie tipoGrupamento = lista.get(position);
		
		intent = tipoGrupamento.preparaTelaSeries(this, tipoGrupamento);
		
		startActivity(intent);
	}
	
}
