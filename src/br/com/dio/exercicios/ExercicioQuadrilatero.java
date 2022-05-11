package br.com.dio.exercicios;

public class ExercicioQuadrilatero {
	
	public static void area(double lado, double quadrado) {
		quadrado = lado * lado;
		System.out.println("Area do Quadrado: " + quadrado);
	}
	
	public static void area(double lado1, double lado2, double retangulo) {
		retangulo = lado1 * lado2;
		System.out.println("Area do Retangulo: " + retangulo);
		
	}
	
	public static void area(double baseMaior, double baseMenor, double altura, double trapezio) {
		trapezio = ((baseMaior + baseMenor)* altura) / 2;
		System.out.println("Area do Trapezio: " + trapezio);
		
		
	}

}
