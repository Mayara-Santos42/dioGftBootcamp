package br.com.dio.exercicios;

public class Exercicio05 {

	public static void main(String[] args) {
		
		int i1 = 30;
		int i2 = 22;
		
		float f1 = 0.22f;
		float f2 = 55.4f;
		
		double d1 = 59.6d;
		
		char c1 = 'w';
		char c2 = 'y';
		
		String s1 = "Fulano"; 
		String s2 = "Ciclano";
		String s3 = "Fulano";
		
		boolean b1 = true;
		boolean b2 = false;
		
		long l1 = 19856L;
		long l2 =  126L;
		
		byte y1 = 1;
		short h1 = 25;
		
		System.out.println("i1 == i2 " + (i1 == i2));
		System.out.println("i1 != i2 " + (i1 != i2));
		System.out.println("i1 > i2 " + (i1 > i2));
		System.out.println("i2 <= i1 " + (i2 <= i1));
		
		System.out.println("f1 == f2 " + (f1 == f2));
		System.out.println("f1 != f2 " + (f1 != f2));
		System.out.println("f1 >= f2 " + (f1 > f2));
		System.out.println("f1 < f2 " + (f1 < f2));
		
		System.out.println("c1 == c2 " + (c1 == c2));
		System.out.println("c1 != c2 " + (c1 != c2));
		System.out.println("c1 > c2 " + (c1 > c2));
		System.out.println("c1 <= c2 " + (c1 <= c2));
		
		System.out.println("s1 == s2 " + (s1 == s2));
		System.out.println("s1 == s3 " + (s1 == s3));
		System.out.println("s1 != s2 " + (s1 != s2));
		//System.out.println("s1 >= s2 " + (s1 >= f2));
		//System.out.println("s1 < s3 " + (s1 < s3));
		
		System.out.println("b1 == b2 " + (b1 == b2));
		System.out.println("b1 != b2 " + (b1 != b2));
		//System.out.println("b1 > b2 " + (b1 > b2));
		//System.out.println("b1 <= b2 " + (b1 <= b2));
		
		System.out.println("i2 > f1 " + (i1 > f1));
		System.out.println("d1 == h1 " + (d1 == h1));
		//System.out.println("s2 != c1 " + (s2 != c1));
		//System.out.println("s3 != i1 " + (s3 != i1));
		
		System.out.println("l1 == i2 " + (l1 == i2));
		System.out.println("l2 >= i1 " + (l2 >= i1));
		System.out.println("y1 != h1 " + (y1 != h1));
		

		
	}

}
