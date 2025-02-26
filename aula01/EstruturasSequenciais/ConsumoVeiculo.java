//5. Escreva um programa que calcule e mostre o consumo médio e a autonomia que um veículo ainda
teria antes de um abastecimento de combustível. Considere que o veículo sempre seja abastecido até
encher o tanque e que são fornecidas apenas a capacidade do tanque, a quantidade de litros
abastecidos e a quilometragem percorrida desde o último abastecimento.

import java.util.Scanner;

public class ConsumoVeiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a capacidade total do tanque (litros): ");
        double capacidadeTanque = scanner.nextDouble();
        
        System.out.print("Digite a quantidade de litros abastecidos: ");
        double litrosAbastecidos = scanner.nextDouble();
        
        System.out.print("Digite a quilometragem percorrida desde o último abastecimento: ");
        double kmPercorridos = scanner.nextDouble();
        
        double consumoMedio = kmPercorridos / litrosAbastecidos;
        double autonomia = capacidadeTanque * consumoMedio;
        
        System.out.println("Consumo médio do veículo: " + consumoMedio + " km/l");
        System.out.println("Autonomia estimada com tanque cheio: " + autonomia + " km");
        
        scanner.close();
    }
}
