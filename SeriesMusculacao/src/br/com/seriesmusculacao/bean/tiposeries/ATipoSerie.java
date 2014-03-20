package br.com.seriesmusculacao.bean.tiposeries;

import android.app.Activity;
import android.content.Intent;
import android.widget.ImageView;

public abstract class ATipoSerie {

	private String nome;
	private String descricao;
	private ImageView icone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ImageView getIcone() {
		return icone;
	}
	
	public void setIcone(ImageView icone) {
		this.icone = icone;
	}

	public abstract Intent preparaTelaTipoObjetivo(Activity activity, ATipoSerie tipoSerie);
}
