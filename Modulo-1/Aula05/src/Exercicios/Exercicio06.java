package src.Exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite uma batata em numero");
        int batata = read.nextInt();

        int result = calculateFactorial(batata);

        System.out.printf("O Fatorial de %d é : %d", batata, result);

        read.close();
    }

    public static int calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }

        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
