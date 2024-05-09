package exercicios;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite um numero entre 1 e 12 para escolher um mes do ano:");
        int month = read.nextInt();

        read.close();

        switch (month) {
            case 1:
                System.out.println("Você escolheu Janeiro");
                break;
            case 2:
                System.out.println("Você escolheu Fevereiro");
                break;
            case 3:
                System.out.println("Você escolheu Março");
                break;
            case 4:
                System.out.println("Você escolheu Abril");
                break;
            case 5:
                System.out.println("Você escolheu Maio");
                break;
            case 6:
                System.out.println("Você escolheu Junho");
                break;

            case 7:
                System.out.println("Você escolheu Julho");
                break;
            case 8:
                System.out.println("Você escolheu Agosto");
                break;
            case 9:
                System.out.println("Você escolheu Setembro");
                break;
            case 10:
                System.out.println("Você escolheu Outubro");
                break;
            case 11:
                System.out.println("Você escolheu Novembro");
                break;
            case 12:
                System.out.println("Você escolheu Dezembro");
                break;

            default:
                System.out.println("Please bote entre 1 a 12");
                break;
        }
    }

}
