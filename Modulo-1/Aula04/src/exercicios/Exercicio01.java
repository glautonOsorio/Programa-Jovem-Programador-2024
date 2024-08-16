
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int[] numbers = new int[10];

        int result = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Insira um numero na array");
            int num = read.nextInt();
            numbers[i] = num;
        }

        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }

        System.out.printf("A soma total da array é: %s", result);
        read.close();
    }

}
