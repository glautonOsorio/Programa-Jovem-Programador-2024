package src.Exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

      
        System.out.print("Enter the base of the triangle: ");
        double base = read.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = read.nextDouble();

        double area = TriangleArea(base, height);

        System.out.println("The area of the triangle is: " + area);

        read.close();
    }
    public static double TriangleArea(double num1, double num2) {

        double result = (num1 * num2) / 2;

        return result;
    }

}