package Exemplos;

public class Programa01 {

	public static void main(String[] args) {

		// invocar função
		int numero1 = 50;
		int numero2 = 20;
		int res = somar(numero1, numero2);
		System.out.println("O resultado é " + res);
		
		saudacoes("Rogério");
		
		// Invocando a função da media do vetor
		double[] alturas = { 1.60, 1.80, 1.70, 1.50 };
		double media = vetorMedia(alturas);
		System.out.println("A média é " + media);

	}

	public static int somar(int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}

	// Void - não retorna valor
	public static void saudacoes(String nome) {
		System.out.println("Bem vindo " + nome);

	}

	public static double vetorMedia(double[] vetor) {
		double soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma = soma + vetor[i];
		}
		double media = soma / vetor.length;
		return media;
	}
}
