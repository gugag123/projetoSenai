package _01_estrututraSequencial;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a area do circulo: ");
        double raio = sc.nextDouble();
        double area = 3.14159 * raio * raio;

        System.out.printf("A area do circulo: %.4f%n", area);
        sc.close();


    }
}
