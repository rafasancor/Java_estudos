/*Altere o exemplo "Agenda de Contatos" com as seguintes implementações:

1 - Altere a classe "Contato" para incluir o telefone do contato.

2 - Adicionar contato: deve ser verificado se a agenda está cheia.

3 - Para as opções Buscar contato, Editar contato, Excluir contato e Listar contato deve
ser verificado se a agenda está vazia antes de iniciar o processo. */

import java.util.Scanner;

class Agenda {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Contato[] contato = new Contato[10];

        int numContatos = 0;

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

                    if (numContatos == 10) {
                        System.out.println("Não é possível adicionar mais contatos, a lista está com a capacidade máxima.");
                    } else {
                        System.out.print("Informe nome: ");
                        String nome = input.nextLine();
                        System.out.print("Informe telefone: ");
                        String telefone = input.nextLine();
    
                        contato[numContatos] = new Contato(nome, telefone);
    
                        System.out.println("Contato cadastrado com sucesso!\n");
                        
                        numContatos++;
                    }

                    break;

                 /* Buscar contato */
                case 2:
                    // Verifica se a agenda não está vazia
                    if (numContatos == 0) {
                        System.out.println("A agenda está vazia. Nenhum contato para buscar.");
                    } else {
                        System.out.print("Buscar contato: ");
                        String buscar = input.nextLine();

                        boolean encontrado = false;
                            // Realiza a busca comparando o nome do contato
                            for (int i = 0; i < numContatos; i++) {
                                // Comparando usando equals
                                if (contato[i].getNome().equalsIgnoreCase(buscar)) { // Ignora maiúsculas/minúsculas
                                    encontrado = true;
                                    System.out.println("Contato encontrado na posição " + i);
                                    System.out.println("Nome: " + contato[i].getNome());
                                    System.out.println("Telefone: " + contato[i].getTelefone());
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
                    if (numContatos == 0) {
                        System.out.println("A agenda está vazia. Nenhum contato para editar.");
                    } else {
                        System.out.println("Escolha o contato que deseja editar:\n");
                        System.out.println("-------------------------");
                        
                        for (int i = 0; i < numContatos; i++) {
                            System.out.println("Contato [" + i + "]:");
                            System.out.println("Nome: " + contato[i].getNome());
                            System.out.println("Telefone: " + contato[i].getTelefone());
                            System.out.println("-------------------------");
                        }
                        
                        System.out.print("Digite o número do contato que deseja editar: ");
                        int indice = input.nextInt();
                        input.nextLine(); // Limpa o buffer
                        
                        // Verifica se o índice é válido
                        if (indice < 0 || indice >= numContatos) {
                            System.out.println("Índice inválido! Tente novamente.");
                        } else {
                            System.out.print("Informe o novo nome: ");
                            String novoNome = input.nextLine();
                            
                            System.out.print("Informe o novo telefone: ");
                            String novoTelefone = input.nextLine();
                            
                            contato[indice].setNome(novoNome);
                            contato[indice].setTelefone(novoTelefone);
                            
                            System.out.println("Contato atualizado com sucesso!\n");
                        }
                    }
                    break;

                /* Excluir contato */
                case 4:
                    if (numContatos == 0) {
                        System.out.println("A agenda está vazia. Nenhum contato para excluir.");
                    } else {
                        System.out.println("Escolha o contato que deseja excluir:\n");
                        System.out.println("-------------------------");
                
                        for (int i = 0; i < numContatos; i++) {
                            System.out.println("Contato [" + i + "]:");
                            System.out.println("Nome: " + contato[i].getNome());
                            System.out.println("Telefone: " + contato[i].getTelefone());
                            System.out.println("-------------------------");
                        }
                
                        System.out.print("Digite o número do contato que deseja excluir: ");
                        int indice = input.nextInt();
                        input.nextLine(); // Limpa o buffer
                
                        // Verifica se o índice é válido
                        if (indice < 0 || indice >= numContatos) {
                            System.out.println("Índice inválido! Tente novamente.");
                        } else {
                            // Remove o contato deslocando os elementos para a esquerda
                            for (int j = indice; j < numContatos - 1; j++) {
                                contato[j] = contato[j + 1];
                            }
                
                            // Define o último elemento como null e reduz o contador de contatos
                            contato[numContatos - 1] = null;
                            numContatos--;
                
                            System.out.println("Contato excluído com sucesso!\n");
                        }
                    }
                    break;


                /* Listar contatos */
                case 5:
                    if (numContatos == 0) {
                        System.out.println("A agenda está vazia. Nenhum contato para listar.");
                    } else {
                        for(int i = 0; i < numContatos; i++){
                        System.out.println("Contato: " + (i + 1));
                        System.out.println("Nome: " + contato[i].getNome());
                        System.out.println("Telefone: " + contato[i].getTelefone());
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

class Contato{
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

    /*Adicionar Telefone*/

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

}