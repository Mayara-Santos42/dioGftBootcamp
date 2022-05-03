package br.com.dio.exercicios;

import java.util.Calendar;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Calendar horas = Calendar.getInstance();
		int horarioAtual = horas.get(Calendar.HOUR_OF_DAY);
		
		int getMensagem = getMensagem(horarioAtual);

		System.out.println("São "  + getMensagem + " Horas");
		
		
	}
	
	public static int getMensagem(int horarioAtual) {
		
		if(horarioAtual >= 6 && horarioAtual < 12){
			System.out.println("Bom dia!");
		} else if (horarioAtual >= 12 && horarioAtual < 18){
			System.out.println("Boa tarde!");			
		} else {
			System.out.println("Boa noite");
		}
		return horarioAtual;		
	}
}





	

