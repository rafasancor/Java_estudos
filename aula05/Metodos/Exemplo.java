import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        imprimir(nome, idade);
        
        scanner.close();
    }
    
    public static void imprimir(String nome, int idade) {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
