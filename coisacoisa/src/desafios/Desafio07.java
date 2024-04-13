package desafios;

import java.util.Scanner;

public class Desafio07 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        double firstSalary;
        double secondSalary;
        double thirdSalary;

        System.out.println("Media do salario bruto que Funcionário 1 recebeu semana passada:");

        System.out.print("Digite o número de horas trabalhadas na semana passada: ");
        int workedHours1 = read.nextInt();

        System.out.print("Digite o salário-hora do empregado: ");
        double hourWage1 = read.nextDouble();

        if (workedHours1 <= 40) {
            firstSalary = workedHours1 * hourWage1;
        } else {
            int horasExtras = workedHours1 - 40;
            firstSalary = 40 * hourWage1 + horasExtras * hourWage1 * 1.5;
        }
        System.out.printf("Salário bruto do empregado: R$%.2f%n", firstSalary);

        System.out.println("\nSalário bruto que Funcionário 2 recebeu semana passada:");

        System.out.print("Digite o número de horas trabalhadas na semana passada: ");
        int workedHours2 = read.nextInt();

        System.out.print("Digite o salário-hora do empregado: ");
        double hourWage2 = read.nextDouble();

        if (workedHours2 <= 40) {
            secondSalary = workedHours2 * hourWage2;
        } else {
            int horasExtras = workedHours2 - 40;
            secondSalary = 40 * hourWage2 + horasExtras * hourWage2 * 1.5;
        }
        System.out.printf("Salário bruto do Funcionário 2: R$%.2f%n", secondSalary);

        System.out.println("\nSalário bruto que Funcionário 3 recebeu semana passada:");

        System.out.print("Digite o número de horas trabalhadas na semana passada: ");
        int workedHours3 = read.nextInt();

        System.out.print("Digite o salário-hora do empregado: ");
        double hourWage3 = read.nextDouble();

        if (workedHours3 <= 40) {
            thirdSalary = workedHours3 * hourWage3;
        } else {
            int horasExtras = workedHours3 - 40;
            thirdSalary = 40 * hourWage3 + horasExtras * hourWage3 * 1.5;
        }
        System.out.printf("Salário bruto do Funcionário 3: R$%.2f%n", thirdSalary);

        read.close();
    }

}
