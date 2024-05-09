package Testando;

import java.util.Scanner;

public class ExercicioMatriz02 {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        Scanner read = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite um numero");
                int num = read.nextInt();

                matriz[i][j] = num;
            }
        }

        int result = matriz[0][0] + matriz[1][1] + matriz[2][2];

        System.out.println("O resultado da soma é " + result);

        read.close();

    }

}
