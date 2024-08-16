import java.util.Scanner;

public class Programa08 {

    	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		while (true) {

			System.out.println("Digite o numero e veja a tabuada");
			int numero = leia.nextInt();
			
			if (numero == 0) {
				System.out.println("Saindo");
				break;
			}
			
			for (int i = 1; i <= 10; i++) {
				int resultado = numero * i;
				System.out.println(numero + " X " + i + " = " + resultado);
			}
		}

        
        leia.close();
	}
    
}
