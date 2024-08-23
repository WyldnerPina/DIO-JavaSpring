package edu.wyldner.dio.excecao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Excecao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		// try/catch e finally(executa independente do erro)
		try {
	
			System.out.println("Digite seu nome");
			String nome = scanner.next();
	
			System.out.println("Digite seu sobrenome");
			String sobrenome = scanner.next();
	
			System.out.println("Digite sua idade");
			int idade = scanner.nextInt();
			
			System.out.println("Digite sua altura");
			double altura = scanner.nextDouble();
	
			System.out.println("Olá " + nome + " " + sobrenome + "\n "
								+ "Sua idade é " + idade + ", e sua altura " + altura);
		} catch (InputMismatchException e) {
			System.err.println("Deu ruim!/nProcure um psiquiatra pq não tá respondendo corretamente às perguntas");			
		}
		
		System.out.println("Digite seu CEP");
		String cep = scanner.next();
		Number cepNum;
		
		try {
			String cepFormatado = formatarCep(cep);
		} catch (CepInvalidoException e1) {
			e1.printStackTrace();
			System.out.println(e1);
		}

		
		try {
			cepNum = NumberFormat.getInstance().parse(cep);
		} catch (ParseException e) {			
			e.printStackTrace();
		}
			
	}
	
	static String formatarCep(String cep) throws CepInvalidoException{
		if(cep.length() != 8) 
			throw new CepInvalidoException();
		
		return "238025-292";//formatado
		
	}
}
