//Escreva um programa que mostre todos os números pares existentes entre 1 e um número lido do teclado, bem como a quantidade de números apresentados.

import java.util.Scanner;

class Pares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quant = 0;
        
        System.out.printf("Digite um numero: ");
        int num = scanner.nextInt();
        
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d\n", i);
                
                quant++;
            }
        }
        
        System.out.printf("Quantidade de numeros apresentados: %d", quant);
        
        scanner.close();
    }
}