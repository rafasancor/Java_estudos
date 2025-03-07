//Escreva um programa que mostre na tela a soma obtida dos 100 primeiros números inteiros (1 + 2 + 3 + 4 + 5 + ... + 100)

class Soma100 {
    public static void main(String[] args) {
        int num, soma = 0;
        for (num = 1; num <= 100; num++) {
            soma += num;
            //System.out.printf("%d\n", soma);
        }
        System.out.printf("Resultado da soma: %d\n", soma);
    }
}