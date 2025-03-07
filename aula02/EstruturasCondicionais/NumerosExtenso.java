//Escreva um programa que converta números inteiros, de sua representação numérica para representação em extenso. O programa deverá solicitar ao usuário um número inteiro (de 0 a 9) e mostrar na tela o valor em extenso. Por exemplo, se o usuário digitar "7", o programa deverá mostrar "Sete". Se o usuário digitar um valor fora da faixa prevista (de 0 a 9), o programa deverá mostrar "Valor inválido!".
import java.util.Scanner;

public class NumerosExtenso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero de 0 a 9: ");
        int num = scanner.nextInt();
        
            switch (num) {
            case 0:
            System.out.print("Zero");
            break;
            
            case 1:
            System.out.print("Um");
            break;
            
            case 2:
            System.out.print("Dois");
            break;
            
            case 3:
            System.out.print("Tres");
            break;
            
            case 4:
            System.out.print("Quatro");
            break;
            
            case 5:
            System.out.print("Cinco");
            break;
            
            case 6:
            System.out.print("Seis");
            break;
            
            case 7:
            System.out.print("Sete");
            break;
            
            case 8:
            System.out.print("Oito");
            break;
            
            case 9:
            System.out.print("Nove");
            break;
            
            default:
            System.out.print("Numero Invalido.");
        }

        scanner.close();
    }
}
