package Aula03.src.exercicios;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int num = 0;

        for (int i = 1; i <= 100; i++) {

            num += i;

        }

        System.out.printf("Resultado da soma bizarra adventures %s", num);

    }

}
