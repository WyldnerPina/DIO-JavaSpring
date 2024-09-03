package edu.wyldner.dio.list.Pesquisa.catalogo;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
  //atributo é a lista
  private List<Livro> livroList;

  
//======================================================================= 
  // sempre q iniciar catalogo, inicio uma lista
  public CatalogoLivros() {
    this.livroList = new ArrayList<>();
  }
  
  
//======================================================================= 
  // adiciono um livro com os parâmetros
  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    livroList.add(new Livro(titulo, autor, anoPublicacao));
  }

  
//=======================================================================
  // pesquisa por nome
  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> livrosPorAutor = new ArrayList<>();// pra pegar vários livros do mesmo autor
    
    if (!livroList.isEmpty()) {// se cheia
      for (Livro l : livroList) {
        if (l.getAutor().equalsIgnoreCase(autor)) {// comparo cada elemento com o nome do autor
          livrosPorAutor.add(l);// se igual, add na lista do autor
        }
      }
      return livrosPorAutor;// retorno essa lista
      
      
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  
  
//======================================================================= 
  // intervalo de anos
  public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {// recebo anoinical e final
	  
    List<Livro> livrosPorIntervaloAnos = new ArrayList<>(); // crio a lista pra receber todos q estiverem no intervalo
    
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {// comparo se o ano está entre
          livrosPorIntervaloAnos.add(l);// se estiver, add a lista com os livros do intervalo
        }
      }
      return livrosPorIntervaloAnos;// retorno lista
      
      
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  
  
//======================================================================= 
  // pesquisa de um livro por seu título
  public Livro pesquisarPorTitulo(String titulo) {// passo o livro
	  
    Livro livroPorTitulo = null; // crio o livro q vai ser
    
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getTitulo().equalsIgnoreCase(titulo)) {
          livroPorTitulo = l;// podia criar só aqui o livro, mas...
          break;
        }
      }
      return livroPorTitulo;// se não encontrar retorna null, por isso instanciou em cima
      
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  
  //======================================================================= main
  public static void main(String[] args) {
    // Criando uma instância do catálogo de livros
    CatalogoLivros catalogoLivros = new CatalogoLivros();

    // Adicionando livros ao catálogo
    catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
    catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
    catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
    catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

    // Exibindo livros pelo mesmo autor
    System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));

    // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
    System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));

    // Exibindo livros dentro de um intervalo de anos
    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));

    // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030));

    // Exibindo livros por título
    System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));

    // Exibindo livros por título (caso em que não há livros com o título especificado)
    System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
  }
}
