package br.com.dio;

import br.com.dio.model.DioGato;

public class DioPrimeiroPrograma {

	public static void main(String[] args) {

		DioGato gato = new DioGato();
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
		/*
		 * int a = 2; int b = 3; 
		 * System.out.println("Hello World!" + (a+b));
		 */
	}
}


class Livros {
	private String nome;
	private String npag;
}