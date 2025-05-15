class Avaliacao {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Rafael", 21);
        Curso curso = new Curso("Matemática", 10);
        Aluno aluno = new Aluno(pessoa.getNome(), pessoa.getIdade(), "A0001", 10, 10, curso);
        
        Pessoa pessoa2 = new Pessoa("Luiz", 20);
        Curso curso2 = new Curso("Português", 20);
        Aluno aluno2 = new Aluno(pessoa2.getNome(), pessoa2.getIdade(), "A0002", 6, 6, curso2);

        aluno.exibirInformacoes();
        aluno.verificarSituacao();
        System.out.println();
        aluno2.exibirInformacoes();
        aluno2.verificarSituacao();
    }
}

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

class Curso {
    private String nome;
    private int cargaHoraria;

    public Curso(String nome, int cargaHoraria){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome(){
        return nome;
    }

    public int getCargaHoraria(){
        return cargaHoraria;
    }

    public void exibirInformacoes(){
        System.out.println("Nome do curso: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria + "h.");
    }
}

class Aluno extends Pessoa {
    private String matricula;
    private Curso curso;
    private double nota1;
    private double nota2;

    public Aluno(String nome, int idade, String matricula, double nota1, double nota2, Curso curso){
        super(nome, idade);
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.curso = curso;
    }

    public void verificarSituacao() {
        double soma = nota1 + nota2;
        if (soma >= 14) {
            System.out.println("Situação: Aprovado.");
        } else {
            System.out.println("Situação: Reprovado.");
        }
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Matrícula: " + matricula);
        curso.exibirInformacoes();
        double media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);
    }
}

