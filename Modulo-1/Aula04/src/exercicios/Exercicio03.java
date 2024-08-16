package Testando;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner read = new Scanner(System.in);
        System.out.println("Digite quantas ações ira fazer:");
        int quantity = read.nextInt();
        read.nextLine();

        int infant = 0;
        double avaregeHeight = 0.0;

        String[] names = new String[quantity];
        int[] ages = new int[quantity];
        double[] heights = new double[quantity];

        for (int i = 0; i < quantity; i++) {
            System.out.println("Digite um nome");
            String name = read.nextLine();
            names[i] = name;
            System.out.println("Digite a idade");
            int age = read.nextInt();
            if (age < 16) {
                infant++;
            }
            ages[i] = age;
            read.nextLine();

            System.out.println("Digite a altura");
            double height = read.nextDouble();
            heights[i] = height;
            read.nextLine();
        }

        for (int i = 0; i < heights.length; i++) {
            avaregeHeight += heights[i];
        }
        System.out.println("A altura media dos alunos é: " + avaregeHeight / heights.length);

        if (infant > 0) {

            System.out.println("A quantidade de aluno com menos de 16 anos é " + infant);

            for (int i = 0; i < ages.length; i++) {

                if (ages[i] < 16) {
                    System.out.println(names[i]);
                }
            }

        } else {
            System.out.println("Nenhum aluno com idade menor que 16");
        }
        read.close();
    }

}
