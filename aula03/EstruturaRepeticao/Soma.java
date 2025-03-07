//Escreva um programa que some os números fornecidos pelo usuário até que o número lido seja igual a zero. Ao final, mostre o resultado da soma

import java.util.Scanner;

class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0, soma = 0;
        
        do {
            System.out.printf("Digite um numero: ");
            num = scanner.nextInt();
            
            soma += num;
        } while (num != 0);
        
        System.out.printf("Soma dos numeros digitados: %d", soma);
        
        scanner.close();
    }
}