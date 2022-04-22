package br.com.dio.exercicios;

import java.util.Scanner;

public class Exercicio01 {


	public static void main(String[] args) {
		System.out.println("Calculo das 4 operações!");
		
		double primeiroValor, segundoValor;
		
		try (Scanner operacoes = new Scanner(System.in)) {
			System.out.println("Digite o primeiro valor");
			primeiroValor = operacoes.nextDouble();
			System.out.println("Digite o segundo Valor");
			segundoValor = operacoes.nextDouble();
		}
		
		double somar = somar(primeiroValor, segundoValor);
		double subtrai = subtrai(primeiroValor, segundoValor);
		double divide = divide(primeiroValor, segundoValor);
		double multiplica = divide(primeiroValor, segundoValor);
		
		System.out.println(somar);
		System.out.println(subtrai);
		System.out.println(divide);
		System.out.println(multiplica);

		int segundaSoma = segundaSoma(5, 2);
		int segundaSubtracao = segundaSubtracao(100, 89);
		int segundaDivisao = segundaDivisao(598, 2354);
		int segundaMultiplicacao = segundaMultiplicacao(782, 14558);
		
		System.out.println(segundaSoma);
		System.out.println(segundaSubtracao);
		System.out.println(segundaDivisao);
		System.out.println(segundaMultiplicacao);
		
	}

	public static double somar(double primeiroValor, double segundoValor) {
		return primeiroValor + segundoValor;
	}
	public static double subtrai(double primeiroValor, double segundoValor) {
		return primeiroValor - segundoValor;
	}
	public static double divide(double primeiroValor, double segundoValor) {
		return primeiroValor / segundoValor;
	}
	public static double multiplica(double primeiroValor, double segundoValor) {
		return primeiroValor * segundoValor;
	}
	
	public static int segundaSoma(int a, int b){
		return a + b ;
	}
	
	public static int segundaSubtracao(int a, int b){
		return a - b ;
	}
	
	public static int segundaDivisao(int a, int b){
		return a / b ;
	}
	
	public static int segundaMultiplicacao(int a, int b){
		return a * b ;
	}
	
}
