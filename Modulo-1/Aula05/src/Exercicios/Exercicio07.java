package src.Exercicios;

public class Exercicio07 {
    public static void main(String[] args) {
        double[] scores = { 7.0, 6.5, 8.0, 5.5, 9.0 };

        String result = avaliarAluno(scores);
        System.out.println(result);
    }

    public static String avaliarAluno(double[] scores) {
        double soma = 0;
        for (double score : scores) {
            soma += score;
        }
        double average = soma / scores.length;

        if (average >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
