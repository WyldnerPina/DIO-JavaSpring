package edu.wyldner.dio.set.OperacoesBasicas.convidado;

import java.util.Objects;

public class Convidado {
  //atributos
  private String nome;
  private int codigoConvite;

  public Convidado(String nome, int codigoConvite) {
    this.nome = nome;
    this.codigoConvite = codigoConvite;
  }

  public String getNome() {
    return nome;
  }

  public int getCodigoConvite() {
    return codigoConvite;
  }

  
  //============================================================  
//esse méts EQUALS e HASHCODE são criados para dizer qual o atributo da classe q deve ser comparado para q o elemento seja único
  // Criado como um construtor ou tostring ctrl+shift+s → generate hashcode() and equals()
  
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Convidado convidado)) return false;
    return getCodigoConvite() == convidado.getCodigoConvite();
  }

  
  
  @Override
  public int hashCode() {
    return Objects.hash(getCodigoConvite());
  }
  
  
  
  //============================================================
  @Override
  public String toString() {
    return "Convidado{" +
        "nome='" + nome + '\'' +
        ", codigoConvite=" + codigoConvite +
        '}';
  }
}
