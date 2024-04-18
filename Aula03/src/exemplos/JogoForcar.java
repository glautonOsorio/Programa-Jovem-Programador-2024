
import java.util.Scanner;

public class JogoForcar {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String secretWord = "programmer";

        StringBuilder word = new StringBuilder("__________");

        int maxAttempts = 6;
        int attempts = 0;
        boolean rightWord = false;

        while (true) {

            System.out.println(word);
            System.out.println("Digite uma letra para descobrir qual é a palavra:");
            char letter = read.nextLine().charAt(0);

            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == letter) {
                    word.setCharAt(i, letter);
                    rightWord = true;
                }
            }

            if (!rightWord) {
                attempts++;
                System.out.println("Você errou a palavra");
            }
            if (attempts == maxAttempts) {
                System.out.println("Você gastou todas as tentativas");
                break;

            }

            if (rightWord == true) {
                System.out.println("Você acertou uma palvra");
            }
            if (secretWord.equals(word.toString())) {
                System.out.println("Parabens você ganhou uma batata");
                return;

            }

        }
        read.close();

    }

}
