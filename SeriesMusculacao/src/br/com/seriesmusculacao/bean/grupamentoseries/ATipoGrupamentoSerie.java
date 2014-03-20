package br.com.seriesmusculacao.bean.grupamentoseries;

import android.app.Activity;
import android.content.Intent;

public abstract class ATipoGrupamentoSerie {
	
	private String nome;
	private String descricao;
	
	public abstract Intent preparaTelaSeries(Activity activity, ATipoGrupamentoSerie tipoGrupamentoSerie);

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
	
}
