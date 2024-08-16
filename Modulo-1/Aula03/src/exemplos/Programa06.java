import java.util.Scanner;

public class Programa06 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int num = 0;

        while (num >= 0) {
            System.out.println("Digite um numero positivo para continuar ou negativo para encerrar");
            num = read.nextInt();

            System.out.printf("Você digitou %s", num);

        }
        read.close();
    }
}
