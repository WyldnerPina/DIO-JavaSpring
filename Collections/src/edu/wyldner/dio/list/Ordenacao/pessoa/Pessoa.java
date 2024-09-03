package edu.wyldner.dio.list.Ordenacao.pessoa;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {// implementa comparable, pra comparar Pessoas
  //atributos
  private String nome;
  private int idade;
  private double altura;

  public Pessoa(String nome, int idade, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
  }

  @Override
  public int compareTo(Pessoa p) {// mét q vem com o comparable pra comparar
    return Integer.compare(idade, p.getIdade());// uso a classe Integer pq já tem um mét pra comparar valores e passo
    // a idade do objeto q está em questão e comparo com a idade do objeto passado
  }

  
  
  
  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }

  public double getAltura() {
    return altura;
  }

  @Override
  public String toString() {
    return "Pessoa{" +
        "nome='" + nome + '\'' +
        ", idade=" + idade +
        ", altura=" + altura +
        '}';
  }
}



// ela teve q fazer uma classe pq aqui é o comparator e não o comparable

// aqui compara-se a altura de duas pessoas recebidas
class ComparatorPorAltura implements Comparator<Pessoa> {
  @Override
  public int compare(Pessoa p1, Pessoa p2) {
    return Double.compare(p1.getAltura(), p2.getAltura());
  }
}