package Exercicios;

public class Exercicio01 {

	public static void main(String[] args) {

		double[] scores = { 5.0, 2.0, 4.0, 8.0, 10.0, 6.0 };

		System.out.println("Media " + Students(scores, "media"));
		System.out.println("Maior nota " + Students(scores, "maior"));
		System.out.println("Menor nota " + Students(scores, "menor"));

	}

	public static double Students(double[] vetor, String type) {
		double average = 0.0;
		double highScore = 0.0;
		double lowScore = 10.0;

		for (int i = 0; i < vetor.length; i++) {

			average += vetor[i];

			if (vetor[i] > highScore) {
				highScore = vetor[i];
			}

			if (vetor[i] < lowScore) {
				lowScore = vetor[i];
			}

		}

		if (type == "media") {

			double result = average / vetor.length;

			return result;

		} else if (type == "maior") {
			return highScore;

		} else {

			return lowScore;
		}
	}

}
