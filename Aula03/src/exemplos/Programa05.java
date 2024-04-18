
import java.util.Random;
import java.util.Scanner;

public class Programa05 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Random aleatorio = new Random();
        int numeroAleatorio = aleatorio.nextInt(0, 100);
        int tentativas = 0;

        System.out.println("Digite um numero: ");
        while (true) {
            int numero = leia.nextInt();
            tentativas++;
            if (numero == numeroAleatorio) {
                System.out.println("Parabéns você ganhou");
                break;
            } else if (numero > numeroAleatorio) {
                System.out.println("Digite um número menor: ");
            } else {
                System.out.println("Digite um número maior: ");
            }

        }

        System.out.println("Numero de tentativas: " + tentativas);
        leia.close();

    }

}
