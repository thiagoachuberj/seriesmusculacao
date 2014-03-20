package br.com.seriesmusculacao.bean.tiposeries;

import br.com.seriesmusculacao.activities.SerieABActivity;
import android.app.Activity;
import android.content.Intent;

public class TipoSerieAB extends ATipoSerie {

	@Override
	public Intent preparaTelaTipoObjetivo(Activity activity,
			ATipoSerie tipoSerie) {
		Intent intent = new Intent(activity, SerieABActivity.class);
		intent.putExtra("key.serieAB.boasVindas", "Seja bem vindo a série AB!");
		
		return intent;
	}

}
