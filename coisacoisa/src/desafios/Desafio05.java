package desafios;

import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Digite Qual item iras comprar:");
        System.out.println("Digite 1 Consultar o Saldo:");
        System.out.println("Digite 2 Sacar Dinheiro:");
        System.out.println("Digite 3 Depositar Dinheiro:");
        System.out.println("Digite 4 Transferir Dinheiro:");
        System.out.println("Digite 5 Encerrar:");
        int num = read.nextInt();
        read.nextLine();

        switch (num) {
            case 1:
            case 2:
            case 3:
            case 4:

                String passwordStored = "batata69";

                double account = 1234.56;
                double account2 = 6543.21;
                double transfer;
                double getMoney;
                String format;

                System.out.println("Qual a sua senha?");
                String password = read.nextLine();

                if (passwordStored.equals(password)) {

                    if (num == 1) {

                        System.out.printf("Ola o seu saldo e R$%s", account);
                        read.close();

                    } else if (num == 2) {
                        System.out.println("Digite o quanto vc quer sacar:");
                        double get = read.nextDouble();

                        if (get > account) {
                            System.out.println("Você esta tentando roubar o banco");
                            read.close();

                        } else {

                            getMoney = account - get;
                            format = String.format("%.2f", getMoney);

                            System.out.printf("O dinheiro que você sacou é R$%s e restou %s%n", get, format);
                            read.close();

                        }

                    } else if (num == 3) {
                        System.out.println("Digite o quanto vc quer depositar:");
                        double insert = read.nextDouble();

                        if (insert < 0) {
                            System.out.println("Você esta tentando roubar o banco de forma negativa");
                            read.close();

                        } else {

                            getMoney = account + insert;
                            format = String.format("%.2f", getMoney);

                            System.out.printf("O dinheiro que você depositou R$%s e sua conta agora tem  %s%n", insert,
                                    format);
                            read.close();

                        }
                    } else {
                        System.out.println("Digite o quanto vc quer transferir:");
                        transfer = read.nextDouble();
                        if (transfer > account) {
                            System.out.println("Você esta tentando roubar o banco");
                            read.close();

                        } else {

                            getMoney = account - transfer;
                            format = String.format("%.2f", getMoney);
                            account2 += transfer;

                            System.out.printf("O dinheiro que você transferiu é %s%n", transfer);
                            System.out.printf("O dinheiro que restou em sua conta é %s%n", format);
                            System.out.printf("E a conta transferida esta com %s%n", account2);
                            read.close();

                        }
                    }

                } else {

                    System.out.println("Você digitou a senha errado");
                    read.close();
                }

                break;
            case 5:
                System.out.println("Você encerrou a operação");
                read.close();
                break;

            default:
                System.out.println("Digitou errado");
                read.close();
                break;
        }

    }

}
