package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
 */
public class FunctionExample {
  public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    
    // O TIPO T = Integer O TIPO R = Integer, em todos os streams vc gera o q quer e passa o q precisa
    
    // Usar a Function com expressão lambda para dobrar todos os números
    Function<Integer, Integer> dobrar = numero -> numero * 2;
    
    
    

    // Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
    List<Integer> numerosDobrados = numeros.stream()
        .map(n -> n * 2)
        //.toList(); O CÓDIGO PARARIA AQUI, mas a jdk q utilizo é a 11 e o toList só a partir da 16
        // pra corrigir usei o cód abaixo q é como era feito antigamente
        .collect(Collectors.toList());
    
    
    

    // Imprimir a lista de números dobrados
    numerosDobrados.forEach(System.out::println);
  }
}
