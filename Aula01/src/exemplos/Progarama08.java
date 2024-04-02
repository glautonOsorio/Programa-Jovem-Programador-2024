package exemplos;
import java.util.Random;


public class Progarama08 {

	public static void main(String[] args) {
		
		Random aleatorio = new Random();
		
		int numeroAleatorio = aleatorio.nextInt();
		
		System.out.println(numeroAleatorio);
		int numeroAleatorioEspecifico = aleatorio.nextInt(100) +50;
		
		System.out.println(numeroAleatorioEspecifico);
		
		double potencia = Math.pow(2, 3);
		System.out.println(potencia);

		
		double quadrada = Math.sqrt(25);
		System.out.println(quadrada);
		
		int valorAbsoluto = Math.abs(-50);
		System.out.println(valorAbsoluto);
		
		int num1 = 100;
		int num2 = 50;
		
		int maximo = Math.max(num2,num1);
		int minimo = Math.min(num2,num1);
		
		
		
		System.out.println(maximo + " coisa " + minimo);

		
		
		

	}

}
