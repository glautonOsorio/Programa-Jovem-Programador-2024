package exemplos;

import java.util.Scanner;

public class Tentativa {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira a receita Bruta: ");
		double receitaBruta = leia.nextDouble();
		
		System.out.println("Insira o numero de dependentes: ");
		double numDenpendetes = leia.nextInt();
		
		double rendaTributalvel = receitaBruta - 1000 - (numDenpendetes * 3000);
		
		double imposto = rendaTributalvel * 0.20;
		
		System.out.printf("Imposto pago :%s",imposto);

	}

}
