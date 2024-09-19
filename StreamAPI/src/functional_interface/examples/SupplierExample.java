package functional_interface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
public class SupplierExample {
  public static void main(String[] args) {
	  
	 // String é o retorno... 
	  
    // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
    Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

    
    
    
    // Usar o Supplier para obter uma lista com 5 saudações
    List<String> listaSaudacoes = Stream.generate(saudacao)
        .limit(5)
      //.toList(); O CÓDIGO PARARIA AQUI, mas a jdk q utilizo é a 11 e o toList só a partir da 16
        // pra corrigir usei o cód abaixo        
        .collect(Collectors.toList());

    
    
    
    // Imprimir as saudações geradas
    listaSaudacoes.forEach(System.out::println);
  }
}
