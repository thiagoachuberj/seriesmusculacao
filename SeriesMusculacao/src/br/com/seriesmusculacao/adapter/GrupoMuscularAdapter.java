package br.com.seriesmusculacao.adapter;

import java.util.List;

import br.com.seriesmusculacao.to.GrupoMuscularTO;
import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;

public class GrupoMuscularAdapter extends BaseAdapter {

	private Context context;
	private List<GrupoMuscularTO> lista;
	
	public GrupoMuscularAdapter(Context context, List<GrupoMuscularTO> lista) {
		this.context = context;
		this.lista = lista;
	}
	
	@Override
	public int getCount() {
		return lista.size();
	}

	@Override
	public Object getItem(int position) {
		GrupoMuscularTO to = lista.get(position);
		return to;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		GrupoMuscularTO to = lista.get(position);
		if (convertView == null) {
			
		}
		
		
		return null;
	}

}
