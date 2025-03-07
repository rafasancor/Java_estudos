//Escreva um programa que apresente na tela a tabuada de um número lido do teclado. Por exemplo, considerando que o número lido é 2, o formato da apresentação deve ser o seguinte:

import java.util.Scanner;

class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Digite um numero para ver a tabuada: ");
        int num = scanner.nextInt();
        System.out.printf("Tabuada do %d\n", num);
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num*i);
        }
        
        scanner.close();
    }
}