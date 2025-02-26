//1. Escreva um programa que leia dois números inteiros e os apresente em ordem crescente.

import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();
        
        if (num1 < num2) {
            System.out.println("Números em ordem crescente: " + num1 + ", " + num2);
        } else {
            System.out.println("Números em ordem crescente: " + num2 + ", " + num1);
        }
        
        scanner.close();
    }
}