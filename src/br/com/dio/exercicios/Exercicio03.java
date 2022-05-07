package br.com.dio.exercicios;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		double salario, valorEmprestimo, condicaoRenda = 0 , renda30 = 0;
		int parcelaPagar = 0;
		
		Scanner rendaMensal = new Scanner(System.in);
		
		System.out.println("Qual é o valor do Empréstimo?");
		valorEmprestimo = rendaMensal.nextDouble();
		System.out.println("Qual é o seu salário?");
		salario = rendaMensal.nextDouble();
		System.out.println("E em quantas vezes você deseja pagar?");
		parcelaPagar = (int) rendaMensal.nextDouble();
		
		double emprestimo = emprestimo(valorEmprestimo, salario, parcelaPagar, condicaoRenda, renda30);
		
		condicaoRenda = valorEmprestimo / parcelaPagar;
		renda30 = salario * 0.3;
		
	}
	
	
	
	public static double emprestimo(double valorEmprestimo, double salario, double parcelaPagar, double condicaoRenda, double renda30) {
		if(valorEmprestimo > (salario * 10) && (condicaoRenda >= renda30)){
			System.out.println("emprestimo concedido!");
		} else {
			System.out.println("Impossivel conceder!");
		};
		
		return 0;
	}
	
	
}
