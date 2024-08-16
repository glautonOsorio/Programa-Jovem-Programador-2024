import java.util.Scanner;

public class Programa07 {

    public static void main(String[] args) {

        /*
         * for (int i = 0; i <= 10; i++) {
         * 
         * System.out.print("Numero " + i + "|");
         * }
         * 
         * System.out.print("-------------------------------------------------");
         * 
         * int i = 0;
         * 
         * while (i <= 10) {
         * 
         * System.out.print("Numero " + i + "|");
         * i++;
         * 
         * }
         */

        Scanner read = new Scanner(System.in);

        System.out.println("Digite um numero para saber a tabuada");
        int num = read.nextInt();

        for (int j = 1; j <= 10; j++) {

            int mult = num * j;

            System.out.printf("%s X %s = %s|%n", num, j, mult);

        }
        read.close();

    }
}
