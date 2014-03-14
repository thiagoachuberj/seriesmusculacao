package br.com.seriesmusculacao.adapter;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import br.com.seriesmusculacao.R;
import br.com.seriesmusculacao.bean.GrupoMuscularBean;

public class GrupoMuscularAdapter extends BaseAdapter {

	private List<GrupoMuscularBean> lista;
	private Context context;
	
	public GrupoMuscularAdapter(Context context, List<GrupoMuscularBean> lista) {
		this.context = context;
		this.lista = lista;
	}
	
	@Override
	public int getCount() {
		return lista.size();
	}

	@Override
	public Object getItem(int position) {
		GrupoMuscularBean to = lista.get(position);
		return to;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		ViewHolder holder = null;
		
		LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
		
		if(view == null) {
			view = layoutInflater.inflate(R.layout.lista_series, null);
			
			holder = new ViewHolder();
			holder.nome = (TextView) view.findViewById(R.id.nome);
			
			view.setTag(holder);
		}
		else {
			holder = (ViewHolder) view.getTag();
		}
		
		GrupoMuscularBean bean = (GrupoMuscularBean) getItem(position);
		holder.nome.setText(bean.getNome());
		
		return view;
	}
	
	@SuppressWarnings("unused")
	private class ViewHolder {
		private TextView nome;
		private TextView tipo;
		private TextView descricao;
	}

}
