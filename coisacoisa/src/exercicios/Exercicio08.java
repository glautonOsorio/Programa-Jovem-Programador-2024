package exercicios;
import java.util.Scanner;

public class Exercicio08 {
    
      
      public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Bem-vindo ao caixa eletrônico!");
      System.out.print("Digite o valor que deseja sacar: ");
      int valorSaque = scanner.nextInt();
      
      int notas100 = valorSaque / 100;
      valorSaque %= 100;
      int notas50 = valorSaque / 50;
      valorSaque %= 50;
      int notas20 = valorSaque / 20;
      valorSaque %= 20;
      int notas10 = valorSaque / 10;
      valorSaque %= 10;
      int notas5 = valorSaque / 5;
      valorSaque %= 5;
      int notas2 = valorSaque / 2;
      valorSaque %= 2;
      int notas1 = valorSaque;
      
      System.out.println("Você receberá as seguintes notas:");
      if (notas100 > 0) {
      System.out.println(notas100 + " nota(s) de R$100");
      }
      if (notas50 > 0) {
      System.out.println(notas50 + " nota(s) de R$50");
      }
      if (notas20 > 0) {
      System.out.println(notas20 + " nota(s) de R$20");
      }
      if (notas10 > 0) {
      System.out.println(notas10 + " nota(s) de R$10");
      }
      if (notas5 > 0) {
      System.out.println(notas5 + " nota(s) de R$5");
      }
      if (notas2 > 0) {
      System.out.println(notas2 + " nota(s) de R$2");
      }
      if (notas1 > 0) {
      System.out.println(notas1 + " nota(s) de R$1");
      }
      }
      
     
}

