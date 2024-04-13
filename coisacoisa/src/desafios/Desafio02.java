package desafios;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite Qual sera o valor de x, Ex: 2,0");
        double x = read.nextDouble();
        System.out.println("Digite Qual sera o valor de y, Ex: -2,0");
        double y = read.nextDouble();
        read.close();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }
    }

}
