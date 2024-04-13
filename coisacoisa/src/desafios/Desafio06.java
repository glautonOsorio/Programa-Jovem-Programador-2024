package desafios;

import java.util.Scanner;

public class Desafio06 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println(
                "Você foi em 3 viagens e precisamos saber o quantos Kms você dirigiu e quantos litros de gasolina você usou ");
        System.out.println("Quantos Km você percorreu na primeira viagem?");
        int km1 = read.nextInt();
        System.out.println("Quantos litros de gasolina você usou na primeira viagem?");
        int li1 = read.nextInt();
        System.out.println("Em relação a segunda viagem:");
        System.out.println("Quantos Km você percorreu na segunda viagem?");
        int km2 = read.nextInt();
        System.out.println("Quantos litros de gasolina você usou na segunda viagem?");
        int li2 = read.nextInt();
        System.out.println("Em relação a terceira viagem:");
        System.out.println("Quantos Km você percorreu na terceira viagem?");
        int km3 = read.nextInt();
        System.out.println("Quantos litros de gasolina você usou na terceira viagem?");
        int li3 = read.nextInt();
        read.close();

        double firstTrip = (double) km1 / li1;
        double secondTrip = (double) km2 / li2;
        double thirdTrip = (double) km3 / li3;
        double totalKm = km1 + km2 + km3;
        double totalLiter = li1 + li2 + li3;
        double total = totalKm / totalLiter;

        System.out.println("Com isso calculamos que:");
        System.out.printf("A media de consumo de Km/Litros na primeira viagem foi de %.2f%n", firstTrip);
        System.out.printf("A media de consumo de Km/Litros na segunda viagem foi de %.2f%n", secondTrip);
        System.out.printf("A media de consumo de Km/Litros na terceira viagem foi de %.2f%n", thirdTrip);
        System.out.printf("O total de Km foi %.2f e litros foi %.2f, e a media total é %.2f%n", totalKm, totalLiter,
                total);
    }

}
