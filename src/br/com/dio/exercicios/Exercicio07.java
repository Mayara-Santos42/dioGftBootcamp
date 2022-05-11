package br.com.dio.exercicios;

public class Exercicio07 {

	public static void main(String[] args) {
		
		boolean exem01 = true;
		boolean exem02 = true;
		boolean exem03 = false;
		boolean exem04 = false;
		
		System.out.println("exem01 && exem02 = " + (exem01 && exem02));
		System.out.println("exem01 && exem03 = " + (exem01 && exem03));
		System.out.println("exem01 && exem04 = " + (exem01 && exem04));
		
		
		System.out.println("exem02 || exem01= " +  (exem02 || exem01));
		System.out.println("exem02 || exem03 = " + (exem02 || exem03));
		System.out.println("exem02 || exem04 = " + (exem02 || exem04));
		
		System.out.println("exem01 || exem03 = " + (exem01 || exem03));
		System.out.println("exem01 || exem02 = " + (exem04 || exem01));
		
		System.out.println("!exem04 = " + !exem04);
		System.out.println("!exem01 = " + !exem01);

		
		int i1 = 10;
		int i2 = 5;
		
		float f1 = 20f;
		float f2 = 50f;
		
		System.out.println("(((i1 + i2) < (f2 - f1)) && true ))" + (((i1 + i2) < (f2 - f1)) && true));
		System.out.println("(i1 > i2) || (f2 < f1) " + ((i1 > i2) || (f1 < f2)));
		
		double salarioMensal = 11893.58d;
		double mediaSalario = 10500d;
		int quantidadeDependentes = 4;
		int mediaDependentes = 2;
		
		System.out.println("Comparando -> ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) " + ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)));
		
		boolean salarioBaixo = salarioMensal < mediaSalario;
		boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
		
		System.out.println(salarioBaixo && muitosDependentes);
		System.out.println(salarioBaixo || muitosDependentes);
		
		boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
		System.out.println(recebeAuxilio);
	}

}
