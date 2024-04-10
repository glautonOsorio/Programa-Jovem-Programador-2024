package exercicios;

public class Exercicio01 {

	public static void main(String[] args) {

		int num1 = 10;
		
		int num2 = -10;
		
		
		
		String result = (num1 > 0) ? "Numero positivo" : "Numero Negativo";
		String result2 = (num2 > 0) ? "Numero positivo" : "Numero Negativo";
		
		System.out.printf("O primeiro resultado foi %s%n",result);
		System.out.printf("O segundo resultado foi %s",result2);
	}

}
