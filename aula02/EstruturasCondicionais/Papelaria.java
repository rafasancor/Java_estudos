import java.util.Scanner;

public class Papelaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número total de cópias
        System.out.print("Digite o número total de cópias: ");
        int numeroCopias = scanner.nextInt();

        // Calcula o valor a ser pago
        double valorTotal;

        if (numeroCopias <= 100) {
            // Se o número de cópias for até 100, o valor é R$ 0,25 por cópia
            valorTotal = numeroCopias * 0.25;
        } else {
            // Se o número de cópias for maior que 100, as primeiras 100 custam R$ 0,25 cada
            // e as cópias adicionais custam R$ 0,20 cada
            valorTotal = (100 * 0.25) + ((numeroCopias - 100) * 0.20);
        }

        // Exibe o valor total
        System.out.printf("O valor total a ser pago é: R$ %.2f\n", valorTotal);

        scanner.close();
    }
}
