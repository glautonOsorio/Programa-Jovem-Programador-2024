package Aula04.src.exemplos;

public class Programa07 {
    	public static void main(String[] args) {
		
		// Printando na tela
		Integer vetor[] = {1,10,5,18,24,22,60,45};
		System.out.println(Arrays.toString(vetor));
		
		// Ordenando um vetor em ordem crescente
		Arrays.sort(vetor);
		System.out.println("Vetor ordenado");
		System.out.println(Arrays.toString(vetor));
		
		// Ordenando um vetor em ordem crescente
		Arrays.sort(vetor, Comparator.reverseOrder());
		System.out.println("Vetor ordenado forma descrecente");
		System.out.println(Arrays.toString(vetor));
		
		// Comparação de igualdade
		int[] vetor1 = {1,2,3};
		int[] vetor2 = {1,2,3};
		System.out.println(Arrays.equals(vetor1, vetor2));
		
		// Copia entre vetores
		int[] array = {1,2,3,4,5,6};
		int[] copia = Arrays.copyOf(array, 6);
		System.out.println("Vetor original: " + Arrays.toString(array));
		System.out.println("Vetor copiado: " + Arrays.toString(copia));

		copia[2] = 99;
		System.out.println("Vetor original: " + Arrays.toString(array));
		System.out.println("Vetor copiado: " + Arrays.toString(copia));

		
		
		
		
		
		

	}
}
