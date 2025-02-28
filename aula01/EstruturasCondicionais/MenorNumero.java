// Escreva um programa que leia três números inteiros e apresente na tela o menor valor
import java.util.Scanner;

class MenorNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num, menor;
        
        System.out.println("Escreva o primeiro numero inteiro: ");
        menor = input.nextInt();
        
        System.out.println("Escreva o segundo numero inteiro: ");
        num = input.nextInt();
        
        if (num < menor) {
            menor = num;
        }

        System.out.println("Escreva o terceiro numero inteiro: ");
        num = input.nextInt();
        
        if (num < menor) {
            menor = num;
        }
        
        System.out.println("Menor numero: " + menor);
        input.close();
    }
}