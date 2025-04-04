class atividade_1 {
    public static void main(String[] args) {
        
        Conta c1 = new Conta();
        c1.numero_conta = 1;
        c1.nome_correntista = "Marcelo";
        c1.status();
        
        c1.deposito(500);
        c1.deposito(100);
        c1.saque(700);
    }
}
 
class Conta{
    
    /* Atributos da classe */
    int numero_conta;
    String nome_correntista;
    double saldo = 0;
    
    /* Metodos da classe */
    public void status(){
        System.out.printf("\nNumero conta: %d", this.numero_conta);
        System.out.printf("\nNome correntista: %s", this.nome_correntista);
        System.out.printf("\nSaldo: %.2f\n", this.saldo);
    }
    
    public void deposito(double valor){
        this.saldo += valor;
        this.status();
    }
    
     public void saque(double valor){
        
        if(this.saldo < valor){
            System.out.printf("\nNao e possivel realizar o saque de %.2f pois existe apenas %.2f de saldo.\n", valor, this.saldo);
        }
        else{
            this.saldo -= valor;
            this.status();  
        }
    }
}
