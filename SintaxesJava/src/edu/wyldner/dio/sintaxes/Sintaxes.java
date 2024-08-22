package edu.wyldner.dio.sintaxes;//com (comercial se for ganhar algo)/org se não etc, nome da empresa, app, o pacote

public class Sintaxes {

	public static void main(String[] args) {
		System.out.println("iniciando");
		//======================================================= VARIÁVEIS
		
		final String BR = "Brasil";// exemplo de constante
		char sexo = 'M';
		int anoFabricacao = 2002;
		boolean vdd = true;
		System.out.println(BR + anoFabricacao + vdd + sexo);
		
		//======================================================= MÉTODOS
		String primeiroNome = "João";
		String segundoNome = "Sem Nome";
		
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		System.out.println(nomeCompleto);
		
		//======================================================= TIPOS DE VARS
		// → aumentando → (int mais usado pq java converte as outras na maioria das vezes. e double pra garantir as casas já q é >)
		// byte short int long // se começar com zero melhor usar string
		// float double // float encerrar com F... 0.3F, long tbm 1324564987654L
		// boolean
		// char
		
		short numCurto = 1;
		int numMaior = numCurto;
		short numCurto2 = (short) numMaior;//sempre q vc vem de uma maior para uma menor vc precisa fazer o casting (casting)
		System.out.println(numCurto + " " + numMaior + " " + numCurto2);
		
		
		operadores();
		metodos();
	}
	
	

	//======================================================= MÉT CHAMADO
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return "Resultado do Método" + primeiroNome.concat(" ").concat(segundoNome);
	}
	
	
	//======================================================= OPERADORES
	public static void operadores () {
		// de atribuição → =
		// aritiméticos → + - * / %    + tbm contatena string
		// unário + num(positivo) - (negativo) ++(soma 1) --(menos) !(negação)
		// =+2; =-2;
		int num = 5;
		System.out.println(num++);// só incrementa depois = 5 no print, depois =6
		System.out.println(num);
		System.out.println(++num);// pra fazer o cálculo antes
		
		// operador ternário → forma resumida de uma condição (um if de uma linha) ?:
		// <condição> ? <se true> : <se false>
		int a, b;
		a = 5;
		b = 6;
		
		String resultado = a==b ? "verdadeira":"falsa";// pode ser string ou int, só q apenas 2
		System.out.println(resultado);
		
		
		//===================================== OPERADORES RELACIONAIS
		// == < > <= >= <> !=
		// OBJETOS ou textos usamos .equals
		
		//===================================== OPERADORES LÓGICOS
		// && ||
	}
	
	//======================================================= MÉTS	
	private static void metodos() {
		// MET → são ações
		// o q vai fazer? tem retorno, qual? parâmetros? exceções? visibilidade
		// camelCase = vars. ser verbo (única responsa)
		
	}
	
	// na linguagem existem tags pra determinar algumar coisas, ex: @version, @since, @return etc. procurar melhor
	// usadas nos comentários. Java doc tbm ajuda com código para fazer documentação automática	
}
