
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		System.out.println("Digite um numero para ver se é par ou impar:");
		int num1 = read.nextInt();

		int result = num1 % 2;

		read.close();

		if (result != 0) {
			System.out.println("O numero é impar");
		} else {

			System.out.println("O numero é par");
		}

	}

}
