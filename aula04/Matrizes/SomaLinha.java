// Escreva um programa que leia uma matriz de 5 x 5 elementos e, utilizando estruturas de repetição, apresente na tela a soma de todos os elementos da terceira linha da matriz

import java.util.Scanner;

class SomaLinha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int i, j, soma = 0;
        int matriz[][] = new int[5][5];
        
        // Leitura da matriz
        for(i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
                System.out.printf("Escreva um numero para preencher a matriz[%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        // Soma dos elementos da terceira linha (linha com índice 2)
        for(j = 0; j < 5; j++) {
            soma += matriz[2][j];  // A terceira linha tem o índice 2
        }
        
        // Exibe a soma dos elementos da terceira linha
        System.out.printf("Soma da terceira linha: %d", soma);
        
        scanner.close();
    }
}
