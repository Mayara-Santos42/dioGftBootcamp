package br.com.dio.exercicios;

import java.util.Scanner;

public class Exercicio08IF {

	public static void main(String[] args) {
		
		int mesNumero;
		String diaSemana;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite por favor o número do mês que você deseja saber: ");
		mesNumero = scan.nextInt();

		exercicioIf(mesNumero);
		
		System.out.println("Escreva o dia da semana sem feira, e com letras minusculas: ");
		diaSemana = scan.next();
		numeroSemana(diaSemana);
		
		
	}

	public static void exercicioIf(int mesNumero) {
		if( mesNumero == 2) {
			System.out.println("Fevereiro!");
		} else if (mesNumero == 2) {
			System.out.println("Março!");
		} else if (mesNumero == 4) {
		   System.out.println("Abril!");
	    } else if (mesNumero == 5) {
	       System.out.println("Maio!"); 
	    } else if (mesNumero == 6) {
	       System.out.println("Junho!");
	    } else if (mesNumero == 8) {
	    	System.out.println("Agosto!");
	    } else if (mesNumero == 9) {
	    	System.out.println("Setembro!");
	    } else if (mesNumero == 10) {
	    	System.out.println("Outubro!");
	    } else if (mesNumero == 11) {
	    	System.out.println("Novembro");
	    } else if ((mesNumero == 1) || (mesNumero == 7) || (mesNumero == 12))
	    	System.out.println("Férias!!!");
		
	}
	
	public static String numeroSemana(String diaSemana) {
		switch(diaSemana) {
		case "segunda":
			System.out.println("Numero 02");
			break;
			
		case "terça":
			System.out.println("Numero 03");
			break;
			
		case "quarta":
			System.out.println("Numero 04");
			break;
			
		case "quinta":
			System.out.println("Numero 05");
			break;
			
		case "sexta":
			System.out.println("Numero 06");
			break;
			
		case "sabado":
			System.out.println("Numero 07");
			break;
			
		case "domingo":
			System.out.println("Numero 01");
			break;
			
		} 
			
		return null;
		
	}
	
	
}
