package br.com.seriesmusculacao.adapter;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import br.com.seriesmusculacao.R;
import br.com.seriesmusculacao.bean.tiposeries.ATipoSerie;

public class TipoSerieAdapter extends BaseAdapter {

	private List<ATipoSerie> lista;
	private Context context;
	
	public TipoSerieAdapter(Context context, List<ATipoSerie> lista) {
		this.context = context;
		this.lista = lista;
	}
	
	@Override
	public int getCount() {
		return lista.size();
	}

	@Override
	public Object getItem(int position) {
		ATipoSerie to = lista.get(position);
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
			holder.descricao = (TextView) view.findViewById(R.id.descricao);
			
			view.setTag(holder);
		}
		else {
			holder = (ViewHolder) view.getTag();
		}
		
		ATipoSerie bean = (ATipoSerie) getItem(position);
		holder.nome.setText(bean.getNome());
		holder.descricao.setText(bean.getDescricao());
		
		return view;
	}
	
	private class ViewHolder {
		private TextView nome;
		private TextView descricao;
		private ImageView icone;
	}

}