package exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int num1 = read.nextInt();
        System.out.println("Digite o segundo numero:");
        int num2 = read.nextInt();

        read.close();

        int result = (num1 > num2) ? num1 : num2;

        System.out.printf("O numero %s é o maior ", result);

    }
}
