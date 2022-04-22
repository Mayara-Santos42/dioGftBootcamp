package br.com.dio.testevariaveis;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		System.out.println("PréPro");
		prePos();
		System.out.println("Operadores aritméticos");
		aritmeticos();
		System.out.println("Atribuições");
		atribuicao();
		System.out.println("Precedência");
		precedencia();
	}
	
	private static void prePos() {
		
		int k = 10;
		
		int l = ++k;
		int j = k--;
		int x = k;
		
		System.out.println("b = " + l);
		System.out.println("j = " + j);
		System.out.println("x = " + x);
				
	}
	

	private static void aritmeticos() {
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;
		
		int soma = a + b;
		int subtrai = b - a;
		int divide = d / a;
		int multiplica = a * e;
		int restoDaDivisao = c % b;
		
		System.out.println("Soma " + soma);
		System.out.println("Subtração " + subtrai);
		System.out.println("Divisão " + divide);
		System.out.println("Multiplica " + multiplica);
		System.out.println("Resto da Divisão " + restoDaDivisao);
	}
	
	private static void atribuicao() {
		int i = 1500;
		short j = 15;
		long l = 500L;
		int k = 35;
		float f = 3.5f;
		double d = f;
		
		System.out.println("d = " + d);
		
		System.out.println("Operações");
		i += 5;
		j -= 3;
		l *= 3;
		d /= 2.7d;
		k %= 2;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(l);
		System.out.println(k);
		System.out.println(f);
		System.out.println(d);
		
		i = k = j;
		
		System.out.println("k = "  + k);
		System.out.println("i = " + i);
		
	}
	
	private static void precedencia() {
		
		int i = 10;
		int j = 20;
		int k = 30;
		
		int a = i++ + --j * k; //o valor é 580
		
		System.out.println(a);
		System.out.println(i);
		System.out.println(j);
		
		int b = k / --i % 3 + 1; 
		
		System.out.println(b);
		System.out.println(i);
		
		int c = 2;
		
		c *= i += 5;
		
		System.out.println(c);
		
	}
	
	
}
