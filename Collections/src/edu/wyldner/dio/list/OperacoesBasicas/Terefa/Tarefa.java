package edu.wyldner.dio.list.OperacoesBasicas.Terefa;

public class Tarefa {
  //atributo
  private String descricao;

  
  // construtor
  public Tarefa(String descricao) {
    this.descricao = descricao;
  }

  
  // retorna descrição q é criada no contrutor
  public String getDescricao() {
    return descricao;
  }

  
  @Override
  public String toString() {
    return  descricao;
  }
}
