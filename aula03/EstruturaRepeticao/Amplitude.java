/*A definição de "amplitude" em Estatística é dada pela grandeza numérica resultante da diferença
entre o maior valor e o menor valor do conjunto de valores de uma amostra. Escreva programa que
leia uma sequencia de números reais positivos terminada em zero (o número zero não deve ser
processado pois serve para marcar o final da entrada de dados). O programa deve determinar e
mostrar o valor da amplitude estatística dos valores. Exemplo: para a sequencia 4.5, 5.2, 1.7, 1.3, 1.9,
2.2, 8.3, 9.1, 5.4 e 0, teremos o resultado de 7.8 como amplitude.*/
import java.util.Scanner;

class Amplitude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float num;
        float maior = -1.0f;
        float menor = 10000.0f;
        
        do {
            System.out.printf("Digite um num (0 para parar): ");
            num = scanner.nextFloat();
            
            if (num > maior && num != 0) {
                maior = num;
            }
            if (num < menor && num != 0) {
                menor = num;
            }
        } while (num != 0);
        
        float amplitude = maior - menor;
        System.out.printf("Amplitude: %.2f", amplitude);

        scanner.close();
        
    }
}