package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String inventory = "2 Dados";

        System.out.println("Você tem 2 dados em sua mão, cada um com números entre 1 e 6");
        System.out.println("Se você jogar eles e conseguir uma soma de 7 ou 11 você ganha um premio secreto");
        System.out.println("Porem se a soma der em 2, 3 ou 12 você perde, você ira jogar os dados? sim ou não:");
        char answer = read.nextLine().toLowerCase().charAt(0);

        if (answer == 'n') {
            System.out.println(
                    "Você usa seu julgamento e decidi não apostar na sorte, seus dados estão seguros em seu bolso para sobreviver mais um dia");
        } else if (answer != 'n' && answer != 's') {
            System.out.println("Você falha em decidir, e em sua indecisão alguém lhe derruba no chão...");
            inventory = "";
            System.out.println("Apos levantar você nota a ausência de algo e um peso em sua consciência...");
        } else {
            Random random = new Random();

            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;

            int result = dice1 + dice2;

            switch (result) {
                case 7:
                case 11:
                    System.out.println("Parabéns! O seu premio é uma batata");
                    inventory = "batata";
                    System.out.println("Gostaria de comer a batata?  sim ou não:");
                    char answer2 = read.nextLine().toLowerCase().charAt(0);

                    if (answer == 'n') {
                        System.out.println("Você decidiu guardar a batata para depois");
                        System.out.println(
                                "Afinal apos testar  a sua sorte e perder seus dados vc não tem a vontade para comer");
                    } else if (answer2 != 'n' && answer2 != 's') {
                        System.out.println("Você falha em decidir, e em sua indecisão algo lhe derruba no chão...");
                        inventory = "";
                        System.out.println("Um cachorro rouba sua batata ");
                        System.out.println("Ao invés de ficar com raiva, você faz carinho no cachorro ");
                        String dog = "batata";
                        System.out.printf("Você agora tem um novo amigo, e o nome dele é %s%n", dog);
                        System.out.println("Final feliz?");
                        ;
                    } else {
                        inventory = "";
                        System.out.println("Após comer sua batata e ganhar o jogo de dado");
                        System.out.println(
                                "Você se sente feliz, olhando para o por do sol você percebe o quão lindo e o lugar em que esta");
                        System.out.println(
                                "Depois de ficar 2 horas avaliando o canário, você volta para sua casa e tem um sono tranquilo");
                    }

                    break;

                case 2:
                case 3:
                case 12:
                    inventory = "";
                    System.out.println("Você não ganho nada, e perde os seus preciosos dados");
                    System.out.println("Você jura vingança contra o sistema");

                default:
                    System.out.println(
                            "Acaba em empate, você não fica nem feliz nem triste, porem você ainda tem os seus dados");
                    break;
            }

        }

    }

}
