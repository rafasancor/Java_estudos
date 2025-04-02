/*3 - Escreva um método que calcule e retorne o valor da conta de 
energia a ser paga de acordo com a quantidade de kW consumidos, sendo 
que o valor do kW é 0,60 (pessoa física), 0,48 (comércio) e 1,29 (indústria). */

import java.util.Scanner;

public class ContaEnergia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Quantidade de kW consumidos: ");
        int consumo = scanner.nextInt();
        
        System.out.printf("Tipo de estabelecimento: ");
        int estabelecimento = scanner.nextInt();
        
        float total = Calcular(consumo, estabelecimento);

        System.out.printf("Total: %.2f", total);
        
        scanner.close();
    }
    
    public static float Calcular(int consumo, int estabelecimento) {

        float total = 0;

        switch (estabelecimento) {
            case 1:
            total = consumo * 0.60f;
            break;

            case 2:
            total = consumo * 0.48f;
            break;

            case 3:
            total = consumo * 1.29f;
            break;

            default:
            System.out.printf("Errado.");
        }
        return total;
    }
}
