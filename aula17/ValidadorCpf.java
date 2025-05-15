import java.util.Scanner;
 
public class ValidadorCPF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean iguais = true;
        String cpf;
        int soma, resto, digVerificador;
        
        System.out.print("Informe o CPF: ");
        cpf = scanner.next();
        
        /* Verifica se todos os dígitos são iguais. */
        for (int i = 1; i < 11; i++) {
            if (cpf.charAt(i) != cpf.charAt(0)) {
                iguais = false;
            }
        }
        
        /* Caso todos os gígitos sejam iguais, o programa é encerrado. */
        if (iguais == true) {
            System.out.println("CPF invalido (digitos iguais)!");
            return;
        }
        
        /* Calcula o primeiro dígito verificador. */
        soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - 48) * (10 - i);
        }
        
        resto = soma % 11;
        
        if (11 - resto > 9) {
            digVerificador = 0;
        } else {
            digVerificador = 11 - resto;
        }
        
        /* Caso o primeiro dígito verificador seja inválido, o programa é encerrado. */
        if ((cpf.charAt(9) - 48) != digVerificador) {
            System.out.println("O CPF e invalido!");
            return;
        }
        
        /* Calcula o segundo dígito verificador. */
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - 48) * (11 - i);
        }
        
        resto = soma % 11;
        
        if (11 - resto > 9) {
            digVerificador = 0;
        } else {
            digVerificador = 11 - resto;
        }
        
        /* Caso o segundo dígito verificador seja inválido, o programa é encerrado. */
        if ((cpf.charAt(10) - 48) != digVerificador) {
            System.out.println("O CPF e invalido!");
            return;
        }
        
        System.out.println("O CPF e valido!");
        
        scanner.close();
    }
}