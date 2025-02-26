//Uma fabrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e
garrafa de 2 litros. Tomando por base que um comerciante compre uma determinada quantidade de
cada um dos formatos disponíveis, escreva um programa para calcular quantos litros de refrigerante
ele comprou.

import java.util.Scanner;

public class CompraRefrigerante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de latas de 350ml: ");
        int qtdLata = scanner.nextInt();
        
        System.out.print("Digite a quantidade de garrafas de 600ml: ");
        int qtdGarrafa600 = scanner.nextInt();
        
        System.out.print("Digite a quantidade de garrafas de 2 litros: ");
        int qtdGarrafa2L = scanner.nextInt();
        
        double totalLitros = (qtdLata * 0.35) + (qtdGarrafa600 * 0.6) + (qtdGarrafa2L * 2);
        
        System.out.println("Total de litros de refrigerante comprados: " + totalLitros + "L");
        
        scanner.close();
    }
}
