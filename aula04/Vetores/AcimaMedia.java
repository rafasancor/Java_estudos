// Escreva um programa que alimente um vetor com 5 números e calcule a média destes valores. Na sequência, apresente na tela os valores que são iguais ou superiores à média.

import java.util.Scanner;

class AcimaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int vetor[] = new int[5];
        int i, soma = 0;
        float media = 0;
        
        for(i=0; i<5; i++) {
            System.out.println("Escreva um numero para preencher o vetor[5]: ");
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
        }
        
        media = soma / 5;
        System.out.printf("Media: %.2f\n", media);
        
        for(i=0; i<5; i++) {
            if (vetor[i] >= media) {
                System.out.printf("Valores acima da media: %d\n", vetor[i]);
            }
            
        }
        
        
        scanner.close();
    }
}