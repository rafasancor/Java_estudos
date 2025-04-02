// Escreva um programa que leia uma matriz de 5 x 5 elementos e, utilizando estruturas de repetição, apresente na tela o menor valor da matriz, o maior valor da matriz, a soma dos valores da matriz e a média dos valores da matriz

import java.util.Scanner;

class ComparaMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int i, j, soma = 0;
        int menor = 10000, maior = -1;
        float media = 0;
        int matriz[][] = new int[5][5];
        
        for(i=0; i<5; i++) {
            for(j=0; j<5; j++) {
                System.out.printf("Escreva um numero para preencher a matriz[%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j];
            }
        }
        
        for(i=0; i<5; i++) {
            for(j=0; j<5; j++) {
                
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
                
                if (matriz[i][j] < maior) {
                    maior = matriz[i][j];
                }
            
            }
        }
        
        media = float (soma) / 25;
        System.out.printf("Menor: %d", menor);
        System.out.printf("Maior: %d", maior);
        System.out.printf("Soma: %d", soma);
        System.out.printf("Media: %.2f", media);
        
        
        scanner.close();
    }
}