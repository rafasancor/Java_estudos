// Escreva um programa que efetue a leitura de um número inteiro e apresente se esse número é divisível por 2 ou divisível por 7.
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escreva um numero inteiro: ");
        int num = input.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("O numero eh divisivel por 2.");
        }
        if (num % 7 == 0) {
            System.out.println("O numero eh divisivel por 7.");
        }
        input.close();
    }
}