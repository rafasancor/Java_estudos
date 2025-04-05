public class ProdutoSG {
    // Atributos privados
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // Construtor com parâmetros para inicializar todos os atributos
    public ProdutoSG(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Getters e setters para acessar e modificar os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Método para atualizar o estoque
    public void atualizarEstoque(int quantidade) {
        if (quantidadeEmEstoque + quantidade >= 0) {
            quantidadeEmEstoque += quantidade;
        } else {
            System.out.println("Erro: a quantidade de estoque não pode ser negativa.");
        }
    }

    // Método para mostrar informações do produto
    public void mostrarInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade em Estoque: " + this.quantidadeEmEstoque);
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criação de um objeto Produto
        Produto produto = new Produto("Bola", 5.0, 10);
        
        // Exibindo as informações iniciais
        produto.mostrarInformacoes();
        
        // Atualizando o estoque (aumento de 5 unidades)
        produto.atualizarEstoque(5);
        produto.mostrarInformacoes();  // Exibe após aumento
        
        // Atualizando o estoque (diminui 20 unidades, causando erro)
        produto.atualizarEstoque(-20);
        produto.mostrarInformacoes();  // Exibe após tentativa de diminuição inválida
    }
}
