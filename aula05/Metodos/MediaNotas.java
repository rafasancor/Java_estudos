/*1 - Escreva um método que receba o nome e as 3 notas de um aluno e mostre o nome do aluno e a sua média aritmética. */

import java.util.Scanner;

class MediaNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.printf("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.printf("Digite sua nota 1: ");
        int nota1 = scanner.nextInt();

        System.out.printf("Digite sua nota 2: ");
        int nota2 = scanner.nextInt();

        System.out.printf("Digite sua nota 3: ");
        int nota3 = scanner.nextInt();

        imprimir(nome, nota1, nota2, nota3);

        scanner.close();
    }

    public static void imprimir(String nome, int nota1, int nota2, int nota3){
        System.out.printf("Nome: " + nome);
        int media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("\nMedia: " + media);
    }    
}