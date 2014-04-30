package br.com.seriesmusculacao.bean;

import android.content.Intent;
import br.com.seriesmusculacao.activities.AbdomenActivity;
import br.com.seriesmusculacao.activities.GrupoMuscularListActivity;


public class Abdomen extends AGrupamentoMuscular {

	@Override
	public Intent preparaTelaGrupamento(
			GrupoMuscularListActivity grupoMuscularActivity,
			AGrupamentoMuscular grupamento) {
		
		Intent intent = new Intent(grupoMuscularActivity, AbdomenActivity.class);
		
		return intent;
	}

	

}
