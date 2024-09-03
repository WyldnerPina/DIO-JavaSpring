package edu.wyldner.dio.list.Ordenacao.pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
  //atributo. lista de pessoas
  private List<Pessoa> pessoaList;

  
  // contrutor gera lista vazia
  public OrdenacaoPessoas() {
    this.pessoaList = new ArrayList<>();
  }

  
//=========================================================================
  // adiciona
  public void adicionarPessoa(String nome, int idade, double altura) {
    pessoaList.add(new Pessoa(nome, idade, altura));
  }

  
//=========================================================================
  // faz ordenação
  public List<Pessoa> ordenarPorIdade() {
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);// gera uma nova lista q recebe a lista normal
    
    if (!pessoaList.isEmpty()) {// se cheia
    	
      Collections.sort(pessoasPorIdade);
      return pessoasPorIdade;
      
      
      
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  
  
//=========================================================================
  public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
    
    
    if (!pessoaList.isEmpty()) {
    	
      Collections.sort(pessoasPorAltura, new ComparatorPorAltura());// outra classe lembra, se não fizer isso ele faz por comparable
      return pessoasPorAltura;
      
      
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  
  //=========================================================================
  public static void main(String[] args) {
  // Criando uma instância da classe OrdenacaoPessoas
    OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

    // Adicionando pessoas à lista
    ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
    ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
    ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
    ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

    // Exibindo a lista de pessoas adicionadas
    System.out.println(ordenacaoPessoas.pessoaList);

    // Ordenando e exibindo por idade
    System.out.println(ordenacaoPessoas.ordenarPorIdade());

    // Ordenando e exibindo por altura
    System.out.println(ordenacaoPessoas.ordenarPorAltura());
  }
}
