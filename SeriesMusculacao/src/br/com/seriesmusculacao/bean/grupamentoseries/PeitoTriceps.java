package br.com.seriesmusculacao.bean.grupamentoseries;

import br.com.seriesmusculacao.activities.ListSeriesPeitoTricepsActivity;
import android.app.Activity;
import android.content.Intent;

public class PeitoTriceps extends ATipoGrupamentoSerie {

	@Override
	public Intent preparaTelaSeries(Activity activity, ATipoGrupamentoSerie tipoGrupamentoSerie) {
		Intent intent = new Intent(activity, ListSeriesPeitoTricepsActivity.class);
		return intent;
	}

}
