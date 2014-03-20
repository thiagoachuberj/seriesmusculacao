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
		pt.setDescricao("Séries relacionado aos grupamentos peito e tríceps");
		
		PeitoTriceps pt1 = new PeitoTriceps();
		pt1.setNome("Peito/Tríceps");
		pt1.setDescricao("Séries relacionado aos grupamentos peito e tríceps");
		
		PeitoTriceps pt2 = new PeitoTriceps();
		pt2.setNome("Peito/Tríceps");
		pt2.setDescricao("Séries relacionado aos grupamentos peito e tríceps");
		
		PeitoTriceps pt3 = new PeitoTriceps();
		pt3.setNome("Peito/Tríceps");
		pt3.setDescricao("Séries relacionado aos grupamentos peito e tríceps");
		
		lista = new ArrayList<ATipoGrupamentoSerie>();
		lista.add(pt);
		lista.add(pt1);
		lista.add(pt2);
		lista.add(pt3);
		
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
