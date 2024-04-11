package desafios;

import java.util.Scanner;

public class Desafio01 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite Qual comida quer comprar:");
        System.out.println("Digite 1 para Cachorro Quente R$4.00:");
        System.out.println("Digite 2 para X-salada R$4.50:");
        System.out.println("Digite 3 para X-Bacon R$5.00: ");
        System.out.println("Digite 4 para Torrada Simples R$2.00:");
        System.out.println("Digite 5 para Refrigerante R$1.50:");
        int num1 = read.nextInt();
        if (num1 != 1 && num1 != 2 && num1 != 3 && num1 != 4 && num1 != 5) {
            System.out.println("Você digitou um numero errado");
            read.close();

        } else {

            System.out.println("Digite a Quantidade:");
            int quantity = read.nextInt();

            double value;
            double sale;
            read.close();

            switch (num1) {
                case 1:
                    value = 4.00;

                    sale = value * quantity;

                    System.out.printf("Você comprou %s Cachorro Quente e o valor deu R$%s ", quantity, sale);
                    break;
                case 2:
                    value = 4.50;
                    sale = value * quantity;

                    System.out.printf("Você comprou %s X-salada e o valor deu R$%s ", quantity, sale);
                    break;
                case 3:
                    value = 5.00;
                    sale = value * quantity;

                    System.out.printf("Você comprou %s X-Bacon e o valor deu R$%s ", quantity, sale);
                    break;
                case 4:
                    value = 2.00;
                    sale = value * quantity;
                    System.out.printf("Você comprou %s Torrada Simples e o valor deu R$%s ", quantity, sale);
                    break;
                case 5:
                    value = 1.50;
                    sale = value * quantity;
                    System.out.printf("Você comprou %s Refrigerante e o valor deu R$%s ", quantity, sale);
                    break;

                default:
                    System.out.println("Você digitou algo errado");
                    break;
            }

        }
    }

}
