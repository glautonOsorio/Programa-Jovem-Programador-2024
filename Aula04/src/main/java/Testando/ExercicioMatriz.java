package Testando;

public class ExercicioMatriz {


    public static void main(String[] args) {
        
        int[][] matriz = {
            {50,261,701},
            {12,100,1},
            {18,1,91}
        };
        int result = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                result += matriz[i][j];
            }
        }

        System.out.println("O resultado da soma é " +result);


    }
    
}
