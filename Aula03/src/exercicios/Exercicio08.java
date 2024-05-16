package Aula03.src.exercicios;

import java.util.Scanner;

public class Exercicio08 {

      public static void main(String[] args) {

            Scanner read = new Scanner(System.in);

            int in = 0;
            int out = 0;
            int numOperations;
            int num1;
            int again;

            while (true) {
                  System.out.println("Quantas operações de divisão você quer fazer?");
                  numOperations = read.nextInt();
                  if (numOperations == 0) {
                        System.out.println("A aplicação encerrou");
                        break;
                  } else {

                        for (int i = 1; i <= numOperations; i++) {

                              System.out.println("Digite um numero:");
                              num1 = read.nextInt();

                              if (num1 >= 10 && num1 <= 20) {
                                    in++;
                              } else {
                                    out++;
                              }
                        }

                        System.out.printf("Os numeros que estão dentro são: %s%n", in);
                        System.out.println(" ");
                        System.out.printf("Os numeros que estão fora são: %s%n", out);
                        System.out.println(" ");

                        System.out.println("Quer continuar o progrma? 1 = sim | 2 = não");
                        again = read.nextInt();

                        if (again == 2) {
                              System.out.println("Termino da aplicação");
                              break;
                        } else if (again != 1 && again != 2) {
                              System.out.println("Digitou o numero errado, a aplicação ira fechar");
                              break;
                        } else {
                              System.out.println("A Aplicação ira reiniciar");

                        }

                  }

            }

            read.close();
      }

}