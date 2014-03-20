package br.com.seriesmusculacao.activities;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import br.com.seriesmusculacao.bean.Serie;

public class ListSeriesPeitoTricepsActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Serie pt = new Serie();
		pt.setNomeAparelho("Supino Articulado");
		pt.setNumeroVezes("3");
		pt.setQtdRepeticao("12");
		Serie pt1 = new Serie();
		pt1.setNomeAparelho("Supino Inclinado - Hammer");
		pt1.setNumeroVezes("3");
		pt1.setQtdRepeticao("12");
		Serie pt2 = new Serie();
		pt2.setNomeAparelho("Voador");
		pt2.setNumeroVezes("3");
		pt2.setQtdRepeticao("12");
		Serie pt3 = new Serie();
		pt3.setNomeAparelho("Tríceps Pulley");
		pt3.setNumeroVezes("3");
		pt3.setQtdRepeticao("12");
		Serie pt4 = new Serie();
		pt4.setNomeAparelho("Tríceps Paralela");
		pt4.setNumeroVezes("3");
		pt4.setQtdRepeticao("12");
		Serie pt5 = new Serie();
		pt5.setNomeAparelho("Abdominal");
		pt5.setNumeroVezes("3");
		pt5.setQtdRepeticao("20");
		
		Serie []arrTipoValues = new Serie[] {pt, pt1, pt2, pt3, pt4, pt5};
		
		ArrayAdapter<Serie> adaptador = new ArrayAdapter<Serie>(this, android.R.layout.simple_list_item_1, arrTipoValues);
		
		setListAdapter(adaptador);
	}
}
