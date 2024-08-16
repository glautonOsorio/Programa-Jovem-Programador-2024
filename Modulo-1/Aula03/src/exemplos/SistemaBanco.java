import java.util.Scanner;

public class SistemaBanco {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		String emailJafeito = "ema";
		String senhaJafeito = "batata";
		int attempt = 0;
		double saldo = 6500;
		char choice;

		while (true) {

			System.out.println("Qual o seu email?");
			String email = read.nextLine();
			System.out.println("Qual a sua senha?");
			String senha = read.nextLine();

			if (email.equals(emailJafeito) && senha.equals(senhaJafeito)) {

				while (true) {

					System.out.println("Bem vindo " + email);
					System.out.println("Digite 1 para mostrar o saldo");
					System.out.println("Digite 2 para realizar um saque");
					System.out.println("Digite 3 para realizar um depósito");
					int opcao = read.nextInt();
					read.nextLine();
					switch (opcao) {
						case 1:
							System.out.println("Saldo atual: " + saldo);

							break;
						case 2:

							System.out.println("Digite o valor a sacar");
							double sacar = read.nextDouble();

							if (sacar <= saldo && sacar > 0) {
								saldo = saldo - sacar;
								System.out.println("Saque realizado com sucesso");
								System.out.println("Saldo atual: " + saldo);
							} else {
								System.out.println("Saldo insuficiente");
								System.out.println("Gostaria de analisar nossas opções de crédito? ");
							}

							break;
						case 3:

							System.out.println("Digite o valor a depositar");
							double depositar = read.nextDouble();

							if (depositar > 0) {
								saldo = saldo + depositar;
								System.out.println("Deposito realizado com sucesso");
								System.out.println("Saldo atual: " + saldo);
							} else {
								System.out.println("Valor de depósito inválido");
							}

							break;
						default:
							System.out.println("Opção inválida. Digite 1, 2 ou 3");

					}
					read.nextLine();

					System.out.println("Deseja fazer outra operação? [s/n]");
					choice = read.nextLine().charAt(0);
					if (choice == 'n') {
						System.out.println("Volte Semprea amiguinho");
						break;
					}
				}
				if (choice == 'n') {
					break;
				}

			} else {
				System.out.println("Credenciais inválidas");

				attempt++;

				if (attempt == 3) {
					System.out.println("Todas tentativas foram usadas sua senha foi bloqueada");
					break;
				}

			}
		}
		read.close();

	}
}
