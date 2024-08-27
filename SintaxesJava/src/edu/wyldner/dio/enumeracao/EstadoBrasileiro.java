package edu.wyldner.dio.enumeracao;

public enum EstadoBrasileiro {// enumera as coisas
	SAO_PAULO ("SP","São Paulo"),// repara q a separação é por vírgula, apenas no final é ponto e vírgula
	RIO_JANEIRO ("RJ", "Rio de Janeiro"),
	PIAUI ("PI", "Piauí"),
	MARANHAO ("MA","Maranhão") ;
	
	private String nome;
	private String sigla;
	
	// definimos as informação importantes na construção, uma vez q é tipo uma lista de constantes.
	private EstadoBrasileiro(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}
	
	// e nunca setamos valor, são imutáveis. só os pegamos
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
}
