// Escreva um programa que alimente um vetor com 5 números inteiros e apresente na tela o vetor em ordem inversa

import java.util.Scanner;

class ImprimeContrario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int vetor[] = new int[5];
        int i;
        
        for(i=0; i<5; i++) {
            System.out.println("Escreva um numero para preencher o vetor[5]: ");
            vetor[i] = scanner.nextInt();
        }
        
        for(i=4; i>=0; i--) {
            System.out.printf("%d ", vetor[i]);
        }
        
        
        scanner.close();
    }
}