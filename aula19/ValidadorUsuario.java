public class ValidadorUsuario {
    public static void main(String[] args) {
        try {
            Usuario usuario = new Usuario("Rafael", 21, "rafa@gmail.com");
            usuario.mostrarInformacoes();
        } catch (Exception e) {
            System.out.println("Erro(s) no cadastro do usuário:");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Sistema finalizado com sucesso.");
        }
        
    }
}

class Usuario {
    private String nome;
    private int idade;
    private String email;

    public Usuario(String nome, int idade, String email){

        StringBuilder erros = new StringBuilder();

        if(nome.length() <=3) {
            erros.append("Erro no cadastro: o nome deve conter pelo menos 3 caracteres.");
        }

        if ((idade < 18) || idade > 99) {
            erros.append("Erro no cadastro: A idade deve estar entre 18 e 99 anos.");
        }

        if (!email.contains("@")) {
            erros.append("Erro no cadastro: O email deve conter o caractere '@'.");
        }

        if (erros.length() > 0) {
            throw new IllegalArgumentException(erros.toString());
        }

        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public void mostrarInformacoes(){
        // Usuario cadastrado: Joao (19 anos, usuario@email.com)
        System.out.println("Usuario cadastrado: " + nome +  " (" + idade + " anos, " + email + ")");
    }
}
