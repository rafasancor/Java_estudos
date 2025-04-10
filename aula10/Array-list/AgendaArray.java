import java.util.ArrayList;
import java.util.Scanner;

class AgendaArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Usando ArrayList para armazenar os contatos
        ArrayList<Contato> contatos = new ArrayList<>();

        while(true){
            System.out.println("[1] Adicionar contato");
            System.out.println("[2] Buscar contato");
            System.out.println("[3] Editar contato");
            System.out.println("[4] Excluir contato");
            System.out.println("[5] Listar contatos");
            System.out.println("[6] Sair");
            int opcao = input.nextInt();

            /* Limpa o buffer do teclado */
            input.nextLine();

            switch(opcao){
                 /* Adicionar contato */
                case 1:
                    // Verificar se a agenda tem capacidade (máximo de 10 contatos)
                    if (contatos.size() == 10) {
                        System.out.println("Não é possível adicionar mais contatos, a lista está com a capacidade máxima.");
                    } else {
                        System.out.print("Informe nome: ");
                        String nome = input.nextLine();
                        System.out.print("Informe telefone: ");
                        String telefone = input.nextLine();
    
                        Contato novoContato = new Contato(nome, telefone);
                        contatos.add(novoContato);
    
                        System.out.println("Contato cadastrado com sucesso!\n");
                    }
                    break;

                 /* Buscar contato */
                case 2:
                    // Verifica se a agenda não está vazia
                    if (contatos.isEmpty()) {
                        System.out.println("A agenda está vazia. Nenhum contato para buscar.");
                    } else {
                        System.out.print("Buscar contato: ");
                        String buscar = input.nextLine();

                        boolean encontrado = false;
                        // Realiza a busca comparando o nome do contato
                        for (int i = 0; i < contatos.size(); i++) {
                            // Comparando usando equals
                            if (contatos.get(i).getNome().equalsIgnoreCase(buscar)) { // Ignora maiúsculas/minúsculas
                                encontrado = true;
                                System.out.println("Contato encontrado na posição " + i);
                                System.out.println("Nome: " + contatos.get(i).getNome());
                                System.out.println("Telefone: " + contatos.get(i).getTelefone());
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("Contato não encontrado.");
                        }
                    }
                    break;

                /* Editar contato */
                case 3:
                    if (contatos.isEmpty()) {
                        System.out.println("A agenda está vazia. Nenhum contato para editar.");
                    } else {
                        System.out.println("Escolha o contato que deseja editar:\n");
                        System.out.println("-------------------------");
                        
                        for (int i = 0; i < contatos.size(); i++) {
                            System.out.println("Contato [" + i + "]:");
                            System.out.println("Nome: " + contatos.get(i).getNome());
                            System.out.println("Telefone: " + contatos.get(i).getTelefone());
                            System.out.println("-------------------------");
                        }
                        
                        System.out.print("Digite o número do contato que deseja editar: ");
                        int indice = input.nextInt();
                        input.nextLine(); // Limpa o buffer
                        
                        // Verifica se o índice é válido
                        if (indice < 0 || indice >= contatos.size()) {
                            System.out.println("Índice inválido! Tente novamente.");
                        } else {
                            System.out.print("Informe o novo nome: ");
                            String novoNome = input.nextLine();
                            
                            System.out.print("Informe o novo telefone: ");
                            String novoTelefone = input.nextLine();
                            
                            contatos.get(indice).setNome(novoNome);
                            contatos.get(indice).setTelefone(novoTelefone);
                            
                            System.out.println("Contato atualizado com sucesso!\n");
                        }
                    }
                    break;

                /* Excluir contato */
                case 4:
                    if (contatos.isEmpty()) {
                        System.out.println("A agenda está vazia. Nenhum contato para excluir.");
                    } else {
                        System.out.println("Escolha o contato que deseja excluir:\n");
                        System.out.println("-------------------------");
                
                        for (int i = 0; i < contatos.size(); i++) {
                            System.out.println("Contato [" + i + "]:");
                            System.out.println("Nome: " + contatos.get(i).getNome());
                            System.out.println("Telefone: " + contatos.get(i).getTelefone());
                            System.out.println("-------------------------");
                        }
                
                        System.out.print("Digite o número do contato que deseja excluir: ");
                        int indice = input.nextInt();
                        input.nextLine(); // Limpa o buffer
                
                        // Verifica se o índice é válido
                        if (indice < 0 || indice >= contatos.size()) {
                            System.out.println("Índice inválido! Tente novamente.");
                        } else {
                            // Remove o contato da lista
                            contatos.remove(indice);
                
                            System.out.println("Contato excluído com sucesso!\n");
                        }
                    }
                    break;

                /* Listar contatos */
                case 5:
                    if (contatos.isEmpty()) {
                        System.out.println("A agenda está vazia. Nenhum contato para listar.");
                    } else {
                        for (int i = 0; i < contatos.size(); i++) {
                            System.out.println("Contato: " + (i + 1));
                            System.out.println("Nome: " + contatos.get(i).getNome());
                            System.out.println("Telefone: " + contatos.get(i).getTelefone());
                            System.out.println("-------------------------");
                        }
                    }
                    break;

                /* Sair */
                case 6:
                    System.out.print("Programa finalizado!\n");
                    input.close();
                    return;

                default:
                    System.out.println("Opcao invalida!\n");
            }
        }
    }
}

class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }
}
