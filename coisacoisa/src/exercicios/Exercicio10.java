package exercicios;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Vamos calcular o seu IMC,aceite o destino e responda de forma seria!");
        System.out.println("Qual o seu Peso em KG? Digite em números:");
        int weight = read.nextInt();
        System.out.println("Qual a sua Altura em Metros? Digite em números:");
        double height = read.nextDouble();

        double imcMath = weight / (height * height);
        String imcResult = String.format("%.2f", imcMath);

        if (imcMath < 18.5) {
            System.out.println("Você está abaixo do peso.");
            System.out.printf("Seu IMC é %s", imcResult);
        } else if (imcMath >= 18.5 && imcMath < 25) {
            System.out.println("Seu peso está normal.");
            System.out.printf("Seu IMC é %s", imcResult);
        } else if (imcMath >= 25 && imcMath < 30) {
            System.out.println("Você está com sobrepeso.");
            System.out.printf("Seu IMC é %s", imcResult);
        } else {
            System.out.println("Você está obeso.");
            System.out.printf("Seu IMC é %s", imcResult);
        }

    }

}
