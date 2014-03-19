package br.com.seriesmusculacao.bean;

import android.content.Intent;
import br.com.seriesmusculacao.activities.AbdomenActivity;
import br.com.seriesmusculacao.activities.GrupoMuscularActivity;


public class Abdomen extends AGrupamentoMuscular {

	@Override
	public Intent preparaTelaGrupamento(
			GrupoMuscularActivity grupoMuscularActivity,
			AGrupamentoMuscular grupamento) {
		
		Intent intent = new Intent(grupoMuscularActivity, AbdomenActivity.class);
		
		return intent;
	}

	

}
