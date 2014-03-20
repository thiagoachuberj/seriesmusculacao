package br.com.seriesmusculacao.bean.tiposeries;

import br.com.seriesmusculacao.activities.SerieABCActivity;
import android.app.Activity;
import android.content.Intent;

public class TipoSerieABC extends ATipoSerie {

	@Override
	public Intent preparaTelaTipoObjetivo(Activity activity, ATipoSerie tipoSerie) {
		Intent intent = new Intent(activity, SerieABCActivity.class);
		intent.putExtra("key.serieABC.boasvindas", "Seja bem vindo a Série ABC!");
		
		return intent;
	}

}
