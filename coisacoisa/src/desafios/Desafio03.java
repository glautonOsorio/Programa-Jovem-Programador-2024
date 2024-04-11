package desafios;

import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite Qual item iras comprar:");
        System.out.println("Digite 1 para Playstation 5 R$4500.00:");
        System.out.println("Digite 2 para Yakuza Infinity Wealth R$350.00:");
        System.out.println("Digite 3 para HeartBound R$20.00:");
        System.out.println("Digite 4 para Street Fighter 6 Deluxe R$540.00:");
        System.out.println("Digite 5 para Batata R$3.00:");
        System.out.println("Digite 6 para não comprar nada:");
        int num1 = read.nextInt();
        if (num1 != 1 && num1 != 2 && num1 != 3 && num1 != 4 && num1 != 5 && num1 != 6) {
            System.out.println("Você digitou um numero errado");
            read.close();

        } else {
            System.out.println("Digite a Quantidade:");
            int quantity = read.nextInt();

            double value;
            double sale;
            double discount;
            double discount2;
            double discount3;
            double saleDiscount;

            switch (num1) {
                case 1:
                    value = 4500.00;

                    sale = value * quantity;

                    if (sale >= 100 && sale <= 500) {
                        discount = sale / 20;

                        saleDiscount = sale - discount;

                        System.out.printf("Você comprou um Playstation 5 e a compra deu %s", saleDiscount);

                    } else if (sale >= 501 && sale <= 1000) {
                        discount2 = sale / 10;

                        saleDiscount = sale - discount2;

                        System.out.printf("Você comprou um Playstation 5 e a compra deu %s", saleDiscount);

                    } else if (sale > 1001) {
                        discount = sale / 20;
                        discount2 = sale / 10;
                        discount3 = discount + discount2;

                        saleDiscount = sale - discount3;

                        System.out.printf("Você comprou um Playstation 5 e a compra deu %s", saleDiscount);

                    } else {
                        System.out.printf("Você comprou um Playstation 5 e a compra deu %s", sale);

                    }

                    break;
                case 2:
                    value = 350.00;
                    sale = value * quantity;

                    if (sale >= 100 && sale <= 500) {
                        discount = sale / 20;

                        saleDiscount = sale - discount;

                        System.out.printf("Você comprou um Yakuza Infinity Wealth e a compra deu %s", saleDiscount);

                    } else if (sale >= 501 && sale <= 1000) {
                        discount2 = sale / 10;

                        saleDiscount = sale - discount2;

                        System.out.printf("Você comprou um Yakuza Infinity Wealth e a compra deu %s", saleDiscount);

                    } else if (sale > 1001) {
                        discount = sale / 20;
                        discount2 = sale / 10;
                        discount3 = discount + discount2;

                        saleDiscount = sale - discount3;

                        System.out.printf("Você comprou um Yakuza Infinity Wealth e a compra deu %s", saleDiscount);

                    } else {
                        System.out.printf("Você comprou um Yakuza Infinity Wealth e a compra deu %s", sale);

                    }

                    break;
                case 3:
                    value = 20.00;
                    sale = value * quantity;

                    if (sale >= 100 && sale <= 500) {
                        discount = sale / 20;

                        saleDiscount = sale - discount;

                        System.out.printf("Você comprou um HeartBound e a compra deu %s", saleDiscount);

                    } else if (sale >= 501 && sale <= 1000) {
                        discount2 = sale / 10;

                        saleDiscount = sale - discount2;

                        System.out.printf("Você comprou um HeartBound e a compra deu %s", saleDiscount);

                    } else if (sale > 1001) {
                        discount = sale / 20;
                        discount2 = sale / 10;
                        discount3 = discount + discount2;

                        saleDiscount = sale - discount3;

                        System.out.printf("Você comprou um HeartBound e a compra deu %s", saleDiscount);

                    } else {
                        System.out.printf("Você comprou um HeartBound e a compra deu %s", sale);

                    }
                    break;
                case 4:
                    value = 540.00;
                    sale = value * quantity;
                    if (sale >= 100 && sale <= 500) {
                        discount = sale / 20;

                        saleDiscount = sale - discount;

                        System.out.printf("Você comprou um Street Fighter 6 Deluxe e a compra deu %s", saleDiscount);

                    } else if (sale >= 501 && sale <= 1000) {
                        discount2 = sale / 10;

                        saleDiscount = sale - discount2;

                        System.out.printf("Você comprou um Street Fighter 6 Deluxe e a compra deu %s", saleDiscount);

                    } else if (sale > 1001) {
                        discount = sale / 20;
                        discount2 = sale / 10;
                        discount3 = discount + discount2;

                        saleDiscount = sale - discount3;

                        System.out.printf("Você comprou um Street Fighter 6 Deluxe e a compra deu %s", saleDiscount);

                    } else {
                        System.out.printf("Você comprou um Street Fighter 6 Deluxe e a compra deu %s", sale);

                    }
                    break;
                case 5:
                    value = 3.00;
                    sale = value * quantity;
                    
                    if (sale >= 100 && sale <= 500) {
                        discount = sale / 20;

                        saleDiscount = sale - discount;

                        System.out.printf("Você comprou um Batata e a compra deu %s", saleDiscount);

                    } else if (sale >= 501 && sale <= 1000) {
                        discount2 = sale / 10;

                        saleDiscount = sale - discount2;

                        System.out.printf("Você comprou um Batata e a compra deu %s", saleDiscount);

                    } else if (sale > 1001) {
                        discount = sale / 20;
                        discount2 = sale / 10;
                        discount3 = discount + discount2;

                        saleDiscount = sale - discount3;

                        System.out.printf("Você comprou um Batata e a compra deu %s", saleDiscount);

                    } else {
                        System.out.printf("Você comprou um Batata e a compra deu %s", sale);

                    }
                    
                    break;
                case 6:
                    System.out.println("Você decidi não comprar nada");
                    break;

                default:
                    System.out.println("Você digitou algo errado");
                    break;
            }
        }

    }

}
