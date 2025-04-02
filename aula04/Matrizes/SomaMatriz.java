// Escreva um programa que alimente uma matriz de 2 x 3 elementos inteiros e, utilizando estruturas de repetição, apresente na tela a soma de todos os elementos da matriz

import java.util.Scanner;

class SomaMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num, i, j, soma = 0;
        int matriz[][] = new int[2][3];
        float media = 0;
        
        for(i=0; i<2; i++) {
            for(j=0; j<3; j++) {
                System.out.printf("Escreva um numero para preencher a matriz[%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j];
            }
        }

        System.out.printf("Soma: %d", soma);
        
        scanner.close();
    }
}