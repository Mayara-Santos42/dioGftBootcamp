package br.com.dio.exercicios;

import java.util.Calendar;

public class Exercicio02 {

	public static void main(String[] args) {
		Calendar horas = Calendar.getInstance();
		int horarioAtual = horas.get(Calendar.HOUR);
		
		int mensagem = mensagem();
	
		System.out.println(horarioAtual);
	}
	
	public static int mensagem() {
		
		int horarioAtual = 0;
		if(horarioAtual > 0 && horarioAtual <= 6) {
			System.out.println("Boa Madrugada!");
		}
		return mensagem();
	}
}


	

