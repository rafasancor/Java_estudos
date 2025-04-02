/*2 - Uma escola remunera seus professores por hora/aula ministrada. 
Escreva um método que calcule e retorne o salário de um professor, sendo que o valor 
hora/aula obedece aos seguintes critérios: 20,00 para o nível 1, 25,00 para
 o nível 2 e 30,00 para o nível 3. */

import java.util.Scanner;

public class SalarioProf {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite quantas horas aulas foram ministradas: ");
        int horas = scanner.nextInt();

        System.out.printf("Qual o nível do professor (1, 2, 3): ");
        int nivel = scanner.nextInt();   

        float total = Calculo(horas, nivel);

        if (total >= 0) {
            // Exibe o salário formatado com 2 casas decimais
            System.out.printf("Salário: R$ %.2f\n", total);
        }

        
        scanner.close();
    }
}

public static float Calculo(int horas, int nivel) {

    float total = -1;

    if (nivel == 1) {
        total = horas * 20.00f;
    }
    else if (nivel == 2) {
        total = horas * 25.00f;
    }
    else if (nivel == 3) {
        total = horas * 30.00f;
    }
    else{
        System.out.printf("Nivel Inválido.");
    }

    return total;
}
