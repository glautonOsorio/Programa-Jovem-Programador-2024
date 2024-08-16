package Aula03.src.exercicios;

public class Exercicio11 {
    public static void main(String[] args) {

        int result;

        for (int i = 1; i <= 20; i++) {
            result = i % 2;
            if (result == 0) {
                System.out.printf("Par: %s%n", i);
            }
        }

    }

}