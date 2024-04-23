package Aula03.src.exercicios;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        

        Scanner read = new Scanner(System.in);

        int secretPassword = 2002;

        int password;

        while (true) {

            System.out.println("Digite a sua senha");
            password = read.nextInt();

            if (password == secretPassword) {
                System.out.println("Você esta logado! Bem vindo!!");
                break;                
            }else{
                System.out.println("Você errou a senha tente novamente");
            }
            
        }

    }
    
}
