package edu.wyldner.dio.entradaDados;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		// pra executar com terminal, está dentro da pasta bin os bytecodes
		String nome = args[0];
		int idade = Integer.valueOf(args[1]);
		double altura = Double.valueOf(args[2]);
		
		System.out.println("olá, me chamo " + nome + ", tenho " + idade + " anos, e minha altura é de " + altura);
		
		// no terminal na pasta bin>java EntradaDados wyldner 37 1.66
		
		
		// outra forma de entrada de dados são os scanners
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("digite seu nome");
		nome = scanner.next();
		
		System.out.println("digite seu idade");
		idade = scanner.nextInt();
		
		System.out.println("digite seu altura");
		altura = scanner.nextDouble();
		
		System.out.println("olá, me chamo " + nome + ", tenho " + idade + " anos, e minha altura é de " + altura);

	}

}
