import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String[] names = new String[10];
        String[] emails = new String[10];

        System.out.println("Digite quantos quarto serão alugados");
        int rooms = read.nextInt();

        for (int i = 0; i < rooms; i++) {

            System.out.println("Aluguel#" + (i + 1));
            System.out.println("Quarto: ");
            int room = read.nextInt() - 1;

            if (names[room] == null) {
                read.nextLine(); // limpeza de buffer

                System.out.println("Nome:");
                names[room] = read.nextLine();

                System.out.println("Email:");
                emails[room] = read.nextLine();

            } else {
                System.out.println("Quarto já reservado");
                i--;
            }

        }

        System.out.println("Quartos ocupados");
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println((i + 1) + ": " + names[i] + ", " + emails[i]);
            }
        }

    }
}