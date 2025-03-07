// Escreva um programa que efetue a leitura de um número inteiro e apresente se esse número é divisível por 2 e divisível por 3.
import java.util.Scanner;

class Divisivel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escreva um numero inteiro: ");
        int num = input.nextInt();
        
        if (num % 6 == 0) {
            System.out.println("O numero eh divisivel por 2 e por 3.");
        } else {
            System.out.println("O numero nao eh divisivel por 2 e por 3.");
        }
        input.close();
    }
}