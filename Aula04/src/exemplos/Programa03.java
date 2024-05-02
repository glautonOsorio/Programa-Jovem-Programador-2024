package Aula04.src.exemplos;

public class Programa03 {
    public static void main(String[] args) {
		
		int[] numeros = {10,15,36,2,9,8,14,16,99,88,57,41};
		int encontrar = 98;		
		int indiceEncontrado = -1;		
		for (int i = 0; i < numeros.length; i++) {			
			if (numeros[i] == encontrar) {
				indiceEncontrado = i;
				break;
			}			
		}		
		if (indiceEncontrado == -1) {
			System.out.println("O numero não foi encontrado");
		} else {
			System.out.println("O numero foi "
					+ "encontrado na posição " + indiceEncontrado);
		}
		
	}
}
