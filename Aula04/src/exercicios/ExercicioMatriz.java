package Testando;

public class ExercicioMatriz {


    public static void main(String[] args) {
        
        int[][] matriz = {
            {50,261,701},
            {12,100,1},
            {18,1,91}
        };
        
        int[][] matriz2 = {
            {50,261,701},
            {12,100,1},
            {18,1,91}
        };
        
        int[][] matriz3 = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz3[i][j] = matriz[i][j] + matriz2[i][j]; 
            }
        }

        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                System.out.println(matriz3[i][j]);
            }
        }


    }
    
}
