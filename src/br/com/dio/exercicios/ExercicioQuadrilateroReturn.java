package br.com.dio.exercicios;

public class ExercicioQuadrilateroReturn {
	
	public static double area(double lado, double quadrado) {
		quadrado = lado * lado;
		return quadrado;
	}
	
	public static double area(double lado1, double lado2, double retangulo) {
		retangulo = lado1 * lado2;
		return retangulo;

		
	}
	
	public static float area(float baseMaior, float baseMenor, float altura, float trapezio) {
		trapezio = ((baseMaior + baseMenor)* altura) / 2;
		return trapezio;
				
	}

}
