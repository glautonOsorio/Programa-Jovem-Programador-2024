package Aula04.src.exemplos;

public class Programa08 {
    
	public static void main(String[] args) {
		
		//[linha][coluna]
		int[][] matriz = new int[3][4];
		
		// Inserindo valor na matriz
		matriz[1][2] = 50;
		matriz[1][3] = 90;
		matriz[0][1] = 120;
		
		// Mostrando valor especifico da matriz
		System.out.println(matriz[1][3]);
		
		// Comprimento
		int linhas = matriz.length;
		int colunas = matriz[0].length;
		
		for (int i = 0; i < linhas; i++) {
			
			for (int j = 0; j < colunas; j++) {
				System.out.print(matriz[i][j] + " ");				
			}
			System.out.println();
		}
		

	}
}
