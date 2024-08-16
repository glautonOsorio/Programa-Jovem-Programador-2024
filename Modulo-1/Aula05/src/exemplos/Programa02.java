package Exemplos;

import java.util.Arrays;

public class Programa02 {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] impNums = Impares(numbers);

		System.out.println(Arrays.toString(impNums));

	}

	public static int[] Impares(int[] vetor) {

		int count = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 != 0) {
				count++;
			}

		}
		int[] impar = new int[count];
		int j = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 != 0) {
				impar[j] = vetor[i];
				j++;
			}

		}

		return impar;
	}

}
