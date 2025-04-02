/*4 - Escreva um método receba o nome de um produto, o preço desse produto
 e o valor em dinheiro entregue ao vendedor. Em seguida, deve ser mostrada
  uma mensagem baseada no seguinte exemplo: "Você comprou um produto (mouse) 
  por R$ 185,00 e entregou ao vendedor R$ 200,00 em dinheiro. Você vai receber 
  R$ 15,00 de troco. Volte sempre!". */

import java.util.Scanner;

public class CompraProduto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o nome do produto: ");
        String produto = scanner.nextLine();
        
        System.out.printf("Preço do produto: ");
        double preco = scanner.nextDouble();
        
        System.out.printf("Valor pago: ");
        double pago = scanner.nextDouble();
        
        Calcular(produto, preco, pago);
        
        scanner.close();
    }
    
    public static void Calcular(String nome, double preco, double pago) {

        double troco = pago - preco;

        // Exibe os valores formatados corretamente
        System.out.printf("Você comprou um produto (%s) por R$ %.2f e entregou ao vendedor R$ %.2f em dinheiro. Você vai receber R$ %.2f de troco. Volte sempre!\n", nome, preco, pago, troco);
    }
}
