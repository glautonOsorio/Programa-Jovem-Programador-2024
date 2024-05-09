package exercicios;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite uma letra do alfabeto: ");
        char letter = read.nextLine().toLowerCase().charAt(0);
        read.close();
        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Sua letra é uma vogal");

                break;

            default:
                System.out.println("Sua letra é uma consoante");
                break;
        }

    }

}
