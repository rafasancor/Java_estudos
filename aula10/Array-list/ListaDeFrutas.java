import java.util.ArrayList;
 
public class ListaDeFrutas {
    public static void main(String[] args) {
        
        /* Criando uma lista de frutas */
        ArrayList<Fruta> frutas = new ArrayList<>();
        
        /* Adicionando frutas a lista */
        frutas.add(new Fruta("Maca", 50));
        frutas.add(new Fruta("Banana", 50));
        frutas.add(new Fruta("Laranja", 50));
        frutas.add(new Fruta("Mamao", 50));
        
        /* Mostrando o tamanho da lista */
        System.out.println("Tamanho da lista: " + frutas.size());
        
        /* Mostrando os elementos da lista - v1 */
        System.out.println("Elementos da lista:");
        for(Fruta elemento : frutas){
            elemento.mostrarInformacoes();
        }
        
        /* Mostrando os elementos da lista - v2 */
        System.out.println("Elementos da lista: ");
        for (int i = 0; i < frutas.size(); i++) {
            Fruta elemento = frutas.get(i); 
            elemento.mostrarInformacoes(); 
        }
              
        /* Verificando se Laranja existe na lista */
        boolean encontrouLaranja = false;
        for (Fruta elemento : frutas) {
            if (elemento.getNome().equalsIgnoreCase("Laranja")) {
                encontrouLaranja = true;
                break;
            }
        }
        
        if (encontrouLaranja == true) {
            System.out.println("Laranja existe na lista");
        } else {
            System.out.println("Laranja nao existe na lista");
        }
        
        /* Alterando a quantidade da fruta "Banana" para 60 */
        for (Fruta elemento : frutas) {
            if (elemento.getNome().equalsIgnoreCase("Banana")) {
                elemento.setQuantidade(60);
                break;
            }
        }
        
        /* Mostrando os elementos da lista */
        System.out.println("Elementos da lista:");
        for(Fruta elemento : frutas){
            elemento.mostrarInformacoes();
        }
        
        /* Removendo uma fruta da lista */
        for (int i = 0; i < frutas.size(); i++) {
                      
            Fruta elemento = frutas.get(i);
                      
            if (elemento.getNome().equalsIgnoreCase("Maca")) {
                
                frutas.remove(i);
                
                System.out.println("Maca foi removida da lista");
            }
        }
        
        /* Mostrando os elementos da lista */
        System.out.println("Elementos da lista:");
        for(Fruta elemento : frutas){
            elemento.mostrarInformacoes();
        }
        
        /* Limpando a lista */
        frutas.clear();
        
        /* verificando se a lista está vazia */
        if(frutas.isEmpty()){
            System.out.println("A lista esta vazia");
        }
    }
}
 
class Fruta{
    String nome;
    int quantidade;
    
    public Fruta(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome + " - Quantidade: " + quantidade);
    }
}