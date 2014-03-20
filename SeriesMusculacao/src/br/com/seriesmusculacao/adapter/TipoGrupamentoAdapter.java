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
import br.com.seriesmusculacao.bean.grupamentoseries.ATipoGrupamentoSerie;

public class TipoGrupamentoAdapter extends BaseAdapter {
	
	private List<ATipoGrupamentoSerie> lstTipoGrupamentoSerie;
	private Context context;
	
	public TipoGrupamentoAdapter(List<ATipoGrupamentoSerie> lstATipoGrupamentoSeries, Context context) {
		this.lstTipoGrupamentoSerie = lstATipoGrupamentoSeries;
		this.context = context;
	}

	@Override
	public int getCount() {
		return lstTipoGrupamentoSerie.size();
	}

	@Override
	public Object getItem(int position) {
		ATipoGrupamentoSerie item = lstTipoGrupamentoSerie.get(position);
		return item;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		ViewHolder holder = null;
		
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
		
		if(view == null) {
			view = inflater.inflate(R.layout.tipo_grupamento_series, null);
			
			holder = new ViewHolder();
			holder.nome = (TextView) view.findViewById(R.id.nomeGrupamento);
			holder.descricao = (TextView) view.findViewById(R.id.descricaoGrupamento);
			
			view.setTag(holder);
		}
		else {
			holder = (ViewHolder) view.getTag();
		}
		
		ATipoGrupamentoSerie bean = (ATipoGrupamentoSerie) getItem(position);
		holder.nome.setText(bean.getNome());
		holder.descricao.setText(bean.getDescricao());
		
		return view;
	}

	private class ViewHolder {
		private TextView nome;
		private TextView descricao;
	}
	
}