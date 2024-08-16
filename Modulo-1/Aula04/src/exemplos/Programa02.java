package Aula04.src.exemplos;

public class Programa02 {
	public static void main(String[] args) {

		// Declarando um vetor
		int[] numeros = new int[5];

		// Inserir valores em um vetor
		numeros[3] = 30;
		numeros[1] = 15;
		numeros[0] = 77;
		numeros[2] = 25;
		numeros[4] = 90;
		// numeros[10] = 1000; ERRO! Posição inexistente

		int comprimento = numeros.length;
		for (int i = 0; i < comprimento; i++) {
			System.out.println("Posição " + i + " Valor : " + numeros[i]);
		}
		// Atualizando
		numeros[2] = 255;

		// Fazendo permutação
		int aux = numeros[4];
		numeros[4] = numeros[0];
		numeros[0] = aux;
		for (int i = 0; i < comprimento; i++) {
			System.out.println("Posição " + i + " Valor : " + numeros[i]);
		}

		// Criando e adicionando os elementos
		String[] nomes = { "bob", "charlie", "meg" };
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Posição " + i + " Valor : " + nomes[i]);
		}
	}

}
