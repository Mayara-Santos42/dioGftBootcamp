package br.com.dio.testevariaveis;

public class TesteVariaveis {

	public static void main(String[] args) {
		
		int i;
		//int i;
		int I;
		//int 1a;
		int _1a;
		int $aq;
		
		i = 5;
		I = 10;
		_1a = 20;
		$aq = 7;
		
		final int j = 10; //e uma variavel constante, sempre mantendo o mesmo valor
		//j = 15;  nao e possivel mudar apos a definicao de seu valor
		int asrn24678md;
		int asrn2$4678_md = 10;
		// int asrn2$46%78_md;
		
		asrn24678md = 100;
		// asrn244678md_md = 10;
		
		int quantidadeProduto = 50;
		// int QuantidadeProduto;
		final int NUMERO_TENTATIVAS = 5; //essa e a regra de sua nomeclatura
		// final int numeroTentativas = 5;
		int QUANTIDADE_OPCOES = 25; // nao e uma boa pratica
		// int qtdProd; falta de expressividade
		
		System.out.println(i);
		System.out.println(I);
		System.out.println(_1a);
		System.out.println($aq);
		
		System.out.println(j);
		System.out.println(asrn24678md);
		System.out.println(asrn2$4678_md);
		
		System.out.println(quantidadeProduto);
		System.out.println(NUMERO_TENTATIVAS);
		System.out.println(QUANTIDADE_OPCOES);
		
	}

}
