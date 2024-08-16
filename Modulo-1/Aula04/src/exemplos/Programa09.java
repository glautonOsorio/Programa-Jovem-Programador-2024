package Aula04.src.exemplos;

public class Programa09 {
    public static void main(String[] args) {
		
		int[][] mapaAssentos = {
				{1,1,0,0,0},
				{0,0,0,0,1},
				{0,0,1,1,1},
				{0,0,1,1,1}
		};
		// 0 - Ocupado
		// 1 - Disponivel		
		boolean assentoDisponivel = mapaAssentos[2][3] == 1;
		System.out.println("O assento esta disponivel: " + assentoDisponivel);

	}

}
