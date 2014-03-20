package br.com.seriesmusculacao.bean;

public class Serie {

	private String nomeAparelho;
	private String numeroVezes;
	private String qtdRepeticao;
	private Byte imagemIlustrativa;
	
	public String getNomeAparelho() {
		return nomeAparelho;
	}
	public void setNomeAparelho(String nomeAparelho) {
		this.nomeAparelho = nomeAparelho;
	}
	public String getNumeroVezes() {
		return numeroVezes;
	}
	public void setNumeroVezes(String numeroVezes) {
		this.numeroVezes = numeroVezes;
	}
	public String getQtdRepeticao() {
		return qtdRepeticao;
	}
	public void setQtdRepeticao(String qtdRepeticao) {
		this.qtdRepeticao = qtdRepeticao;
	}
	public Byte getImagemIlustrativa() {
		return imagemIlustrativa;
	}
	public void setImagemIlustrativa(Byte imagemIlustrativa) {
		this.imagemIlustrativa = imagemIlustrativa;
	}
	
}
