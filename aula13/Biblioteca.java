class Biblioteca {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Carlos Silva", 25);
        Cliente cliente2 = new Cliente("Ana Pereira", 30);

        Livro livro1 = new Livro("Quincas Borba", "Machado de Assis");
        Livro livro2 = new Livro("A revolucao dos bichos", "George Orwell");

        Emprestimo emprestimo1 = new Emprestimo(cliente1, livro1, "08/04/2025");
        Emprestimo emprestimo2 = new Emprestimo(cliente2, livro2, "08/04/2025");

        emprestimo1.exibirDetalhes();
        System.out.println(); // linha em branco
        emprestimo2.exibirDetalhes();
    }
}

class Cliente {
    private String nome;
    private int idade;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}

class Emprestimo {
    private Cliente cliente;
    private Livro livro;
    private String dataEmprestimo;

    public Emprestimo(Cliente cliente, Livro livro, String dataEmprestimo) {
        this.cliente = cliente;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
    }

    public void exibirDetalhes() {
        System.out.println("Dados do emprestimo:");
        System.out.println("Cliente: " + cliente.getNome() + " (Idade: " + cliente.getIdade() + ")");
        System.out.println("Livro: " + livro.getTitulo() + " por " + livro.getAutor());
        System.out.println("Data do Emprestimo: " + dataEmprestimo);
    }
}
