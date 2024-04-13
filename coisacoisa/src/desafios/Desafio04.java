package desafios;

import java.util.Scanner;

public class Desafio04 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite sua renda: Ex.1550,15");
        double num = read.nextDouble();

        read.close();

        double discount;
        double discount2;
        double discount3;
        double tax = 2000.00;
        double tax2 = 1000.00;
        double tax3 = 1500.00;
        double taxEvade;
        double taxEvade2;
        double taxEvade3;
        double finalValue;

        String discountFormat;

        if (num >= 2001.01 && num <= 3000.00) {
            taxEvade = num - tax;
            discount = (taxEvade / 100) * 8;
            discountFormat = String.format("%.2f", discount);
            System.out.printf("O seu imposto de renda é R$%s", discountFormat);
        } else if (num >= 3001.01 && num <= 4500.00) {
            taxEvade = (num - tax);
            discount = (taxEvade / 100) * 8;
            taxEvade2 = taxEvade - tax2;
            discount2 = (taxEvade2 / 100) * 18;
            finalValue = discount + discount2;
            discountFormat = String.format("%.2f", finalValue);
            System.out.printf("O seu imposto de renda é R$%s", discountFormat);
        } else if (num >= 4501.00) {
            taxEvade = (num - tax);
            taxEvade2 = num - (tax + tax2);
            taxEvade3 = num - (tax + tax2 + tax3);
            discount = (taxEvade / 100) * 8;
            discount2 = (taxEvade2 / 100) * 18;
            discount3 = (taxEvade3 / 100) * 28;
            finalValue = discount + discount2 + discount3;
            discountFormat = String.format("%.2f", finalValue);
            System.out.printf("O seu imposto de renda é R$%s", discountFormat);
        } else {
            System.out.println("Você está isento de imposto");
        }
    }

}
