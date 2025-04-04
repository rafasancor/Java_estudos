public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    
    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    
    public void envelhecer() {
        idade++;
        if (idade < 21) {
            altura += 0.01; // Cresce 1cm
        }
    }
    
    public void engordar(double quilos) {
        if (quilos > 0) {
            peso += quilos;
        }
    }
    
    public void emagrecer(double quilos) {
        if (quilos > 0 && peso - quilos > 0) {
            peso -= quilos;
        }
    }
    
    public String toString() {
        return "Nome: " + nome + 
               "\nIdade: " + idade + 
               "\nPeso: " + peso + 
               "\nAltura: " + altura;
    }
}

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 18, 70.5, 1.75);
        System.out.println("Estado inicial:");
        System.out.println(pessoa);
        
        pessoa.envelhecer();
        pessoa.engordar(2.5);
        pessoa.emagrecer(1.0);
        
        System.out.println("\nApós alterações:");
        System.out.println(pessoa);
    }
}