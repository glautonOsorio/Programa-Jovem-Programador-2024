package exemplos;

public class Programa06 {

	public static void main(String[] args) {
		

		String email = "teste@teste.com";
		String senha = "admin";
		
		String emailTeste = "teste@admin.com";
		String senhaTeste = "batata";
		
		boolean condicao = senha.equals(senhaTeste)  && emailTeste == email;
		
		System.out.printf("Login é valido? : %s%n",condicao);
		
		
		email = "teste@admin.com";
		senha = "batata";
		
		boolean testeLogin = senha.equals(senhaTeste)  && emailTeste == email;
		
		System.out.printf("Login é valido? : %s%n",testeLogin);
		
		
		int num1 = 6;
		int num2 = 2;
		int num3 = 0;
		
	 boolean testNum1 = num1 >= num3;
	 boolean testNum2 = num1 % num2 == 0;
	 boolean testNum3 = testNum1 && testNum2;
	 
	 System.out.printf("O numero é positivo e é um par?: %s",testNum3);
		
		
		

	}

}
