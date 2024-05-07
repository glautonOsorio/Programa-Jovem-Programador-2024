package Testando;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int quantity = 0;

        System.out.println("Quantos numeros iras cadastrar?");
        int numbers = read.nextInt();

        int[] numArray = new int[numbers];

        for (int i = 0; i < numArray.length; i++) {

            System.out.println("Digite um numero para inserir na posição: " + i);
            int num = read.nextInt();

            numArray[i] = num;

        }

        for (int i = 0; i < numArray.length; i++) {
            int result = numArray[i] % 2;

            if (result == 0) {
                System.out.println(numArray[i]);
                quantity++;
            }
        }

        if (quantity > 0) {
            System.out.printf("A quantidade de numeros pares é: %s", quantity);
        } else {

            System.out.println("Nenhum numero par encontrado");
        }
        read.close();
    }

}
