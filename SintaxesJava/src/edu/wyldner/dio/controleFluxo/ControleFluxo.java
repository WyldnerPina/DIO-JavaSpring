package edu.wyldner.dio.controleFluxo;

import java.util.concurrent.ThreadLocalRandom;

public class ControleFluxo {

	public static void main(String[] args) {
		// ========================= Estruturas condicionais
		int n1 = 1;
		int n2 = 2;

		// condicional simples
		if (n1 < n2)
			System.out.println("condicional simples");

		// condicional Composta
		if (n1 < n2) {
			n1 = n1 * 10;
		} else {
			n2 = n1;
		}

		// condicional encadeada
		if (n1 < n2) {
			n1 = n1 * 10;
		} else if (n1 == n2) {
			n2 = n2 * 10;
		} else {
			n2 = n1;
		}

		if (2 > n2) {
			System.out.println("se 2 maior q n2");
		} else {
			if (n2 > n1) {
				System.out.println("se 2 maior q n2 e se n2 maior q n1");
			} else {
				System.out.println("nenhum dos casos");
			}
		}

		System.out.println(n1 + " e " + n2);
		

		// condicional ternária
		String resultado = n1 > n2 ? "n1 maior" : "n2 maior";
		
		String resultado2 = n1 > n2 ? "n1 maior" : n2 == n1 && n2 > 0 ? "n2 maior": "são iguai";

		System.out.println(resultado);
		System.out.println(resultado2);
		
		
		
		// switch case
		switch(n1) {
		case 1 : System.out.println("é um");
			break;// pode ser: continue ou deixar sem
		case 2 : System.out.println("é dois");
			break;
		default : System.out.println("nem um nem dois");
		}

		// ========================= Estruturas de repetição
		// for
		for (int i = 0; i <= 20; i++) {
			System.out.println("contando " + i);			
		}
		
		String [] palavras = {"ASDF", "FGHJ", "Y7UYI"};
		for (int i = 0; i < palavras.length; i++) {
			if(i==1)
				continue;// apenas a segunda palavra não será printada, se usar break pára tudo 
			
			System.out.println(palavras[i]);			
		}
		
		
		for(String palavra:palavras) {// cadaPalavra de palavras
			System.out.println(palavra);
		}
		
		
		// while
		int cont = 0;
		int max = valorAleatorio();
		System.out.println(max);
		while (cont <= max) {
			System.out.println("contando " + cont);
			cont++;
		}
		
		// do while
		cont = 0;
		do {
			System.out.println("contando " + cont);
			cont++;
		} while (cont<=max);
		// ========================= Estruturas de exceções
		
		
		String[] nomes = {"Camila", "Venilton", "Leonardo", "Renan", "Rafael"}; System.out.print(nomes.length);
	}

	private static int valorAleatorio() {
		return ThreadLocalRandom.current().nextInt(2, 20);//
	}
}
