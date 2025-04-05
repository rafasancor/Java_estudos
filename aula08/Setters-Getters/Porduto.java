public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // Construtor
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Método para atualizar estoque
    public void atualizarEstoque(int quantidade) {
        if (quantidadeEmEstoque >= 0) {
            if (quantidade >= 0) {
                quantidadeEmEstoque += quantidade;
            } else {
                quantidadeEmEstoque -= quantidade;
            }
        } else {
            System.out.println("Erro, alteração não permitida.");
        }
    }

    // Método para mostrar informações
    public void mostrarInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade em Estoque: " + this.quantidadeEmEstoque);
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Bola", 5.0, 10);
        produto.mostrarInformacoes();  // Exibe as informações do produto
        produto.atualizarEstoque(5);  // Aumenta a quantidade em estoque
        produto.mostrarInformacoes();  // Exibe as informações atualizadas
    }
}
