//6. Escreva um programa que solicite do usuário o valor de um saque em caixa eletrônico, sendo que
estarão disponíveis cédulas de 5, 10, 20, 50 e 100. O programa deve apresentar a menor quantidade
de cédulas possível de acordo com o saque. Exemplos:
400,00: 4 cédulas de 100, 0 cédulas de 50, 0 cédulas de 20, 0 cédulas de 10 e 0 cédulas de 5.
350,00: 3 cédulas de 100, 1 cédulas de 50, 0 cédulas de 20, 0 cédulas de 10 e 0 cédulas de 5.
385,00: 3 cédulas de 100, 1 cédula de 50, 1 cédula de 20, 1 cédula de 10 e 1 cédula de 5

import java.util.Scanner;

public class SaqueCaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do saque: ");
        int saque = scanner.nextInt();
        
        int[] cedulas = {100, 50, 20, 10, 5};
        int[] quantidadeCedulas = new int[cedulas.length];
        
        for (int i = 0; i < cedulas.length; i++) {
            quantidadeCedulas[i] = saque / cedulas[i];
            saque %= cedulas[i];
        }
        
        System.out.println("Distribuição de cédulas:");
        for (int i = 0; i < cedulas.length; i++) {
            System.out.println(quantidadeCedulas[i] + " cédula(s) de " + cedulas[i]);
        }
        
        scanner.close();
    }
}
