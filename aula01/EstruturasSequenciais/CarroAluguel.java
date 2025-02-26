//Escreva um programa que pergunte ao usuário a quantidade de km percorridos por um carro alugado e a quantidade de dias pelos quais ele foi alugado. Calcule e mostre o valor a pagar, sabendo que o carro custa R$ 70,00 por dia e R$ 0,15 por km rodado

import java.util.Scanner;

public class CarroAluguel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a quantidade km percorridos com o carro: ");
        int quilometragem = input.nextInt();
        
        System.out.print("Digite a quantidade de dias que o carro foi alugado: ");
        int dias = input.nextInt();
        
        double total_quilometragem = quilometragem * 0.15;
        double total_dias = dias * 70.00;
        
        double custo_total = total_quilometragem + total_dias;
        
        System.out.println("Custo total: " + custo_total);

        
        input.close();
    }
}
