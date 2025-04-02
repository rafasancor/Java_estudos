import java.util.Scanner;

public class SalarioProf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite quantas horas aulas foram ministradas: ");
        int horas = scanner.nextInt();

        System.out.printf("Qual o nível do professor (1, 2, 3): ");
        int nivel = scanner.nextInt();

        // Chama o método Calculo e armazena o valor retornado em 'total'
        float total = Calculo(horas, nivel);

        // Verifica se o valor retornado é válido (não foi um erro)
        if (total >= 0) {
            // Exibe o salário formatado com 2 casas decimais
            System.out.printf("Salário: R$ %.2f\n", total);
        }

        scanner.close();
    }

    public static float Calculo(int horas, int nivel) {
        float total = -1;  // Inicializa com -1 para indicar erro em caso de nível inválido

        if (nivel == 1) {
            total = horas * 20.00f;
        } else if (nivel == 2) {
            total = horas * 25.00f;
        } else if (nivel == 3) {
            total = horas * 30.00f;
        } else {
            System.out.println("Nível Inválido.");
        }

        return total;
    }
}
