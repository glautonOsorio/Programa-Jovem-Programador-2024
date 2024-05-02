package Aula04.src.exemplos;

public class Programa01 {

	public static void main(String[] args) {
		
		int[] idades = {20,15,30,12,50};
		int campeao = idades[0];
		
		for (int i = 0; i < idades.length; i++) {			
			if ( campeao >  idades[i]) {
				campeao = idades[i];
			}			
		}		
		System.out.println("Menor idade: " + campeao);
		
		
		

	}


}