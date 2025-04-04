import java.util.Scanner;

public class BombaDeCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando uma bomba de combustível com dados iniciais
        Bomba bomba = new Bomba();
        bomba.numeroBomba = 1;
        bomba.tipoCombustivel = "Gasolina";
        bomba.valorLitro = 5.50;  // R$ por litro
        bomba.quantidadeCombustivel = 500.0;  // 500 litros de combustível

        // Exibindo o status inicial
        bomba.status();

        // Escolha de ação
        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Abastecer por valor");
        System.out.println("2 - Abastecer por litro");
        System.out.println("3 - Alterar valor do litro");
        System.out.println("4 - Alterar quantidade de combustível");
        System.out.println("5 - Mostrar status da bomba");
        
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                bomba.abastecerPorValor(scanner);
                break;
            case 2:
                bomba.abastecerPorLitro(scanner);
                break;
            case 3:
                bomba.alterarValor(scanner);
                break;
            case 4:
                bomba.alterarQuantidadeCombustivel(scanner);
                break;
            case 5:
                bomba.status();
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}

class Bomba {
    int numeroBomba;
    String tipoCombustivel;
    double valorLitro;  // Preço por litro
    doubl
