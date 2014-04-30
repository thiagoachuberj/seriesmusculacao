/**
 * 
 */
package br.com.seriesmusculacao.bean;

import br.com.seriesmusculacao.activities.GrupoMuscularListActivity;
import android.content.Intent;

/**
 * @author 2226974
 *
 * Grupamento muscular é a interface para todos os grupamentos.
 */
public abstract class AGrupamentoMuscular {

	private String nome;
	private String tipo;
	private String descricao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public abstract Intent preparaTelaGrupamento(GrupoMuscularListActivity grupoMuscularActivity, AGrupamentoMuscular grupamento);
	
}
