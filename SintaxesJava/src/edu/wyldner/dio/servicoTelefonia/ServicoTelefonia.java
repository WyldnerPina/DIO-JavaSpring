package edu.wyldner.dio.servicoTelefonia;

import java.util.Scanner;

public class ServicoTelefonia {

	public static String verificarComboCompleto(String[] servicosContratados) {
		// Variáveis booleanas para verificar a contratação de cada serviço
		boolean movelContratado = false;
		boolean bandaLargaContratada = false;
		boolean tvContratada = false;

		// Itere sobre os serviços contratados
		for (String servico : servicosContratados) {
			switch (servico) {
			case "movel":
				movelContratado = true;
				break;
			case "banda larga":
				bandaLargaContratada = true;
				break;
			case "tv":
				tvContratada = true;
				break;
			}
		}

		// Verifique se todos os serviços foram contratados
		if (movelContratado && bandaLargaContratada && tvContratada) {
			return "Combo Completo";
		} else {
			return "Combo Incompleto";
		}
	}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicitando ao usuário a lista de serviços contratados
		String input = scanner.nextLine();

		// Convertendo a entrada em uma lista de strings
		String[] servicosContratados = input.split(",");

		// Verificando se o cliente contratou um combo completo
		String resultado = verificarComboCompleto(servicosContratados);

		// Exibindo o resultado
		System.out.println(resultado);

		// Fechando o scanner
		scanner.close();
	}

	
	/*
	 Entrada					Saída
	movel,banda larga,tv		Combo Completo
	movel,tv					Combo Incompleto
	banda larga,tv,movel		Combo Completo
	 */
}
