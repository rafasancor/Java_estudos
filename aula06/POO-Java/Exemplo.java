class Exemplo {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Rafael";
        p1.idade = 21;
        
        Pessoa p2 = new Pessoa();
        p2.nome = "Carol";
        p2.idade = 20;
        
        p1.status();
        p1.comer("Banana");
        p2.comer("Manga");
        p1.falar();
        p2.parar_comer();
        p2.falar();
        
        //p1.status();
        
    }
}

class Pessoa {
    String nome;
    int idade;
    boolean falando = false;
    boolean comendo = false;
    
    public void status(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Falando: " + this.falando);
        System.out.println("Comendo: " + this.comendo);
    }
    
    public void falar () {
        
        if (this.comendo == true) {
            System.out.println(this.nome + " nao pode falar comendo.");
        }
        
        else if (this.falando == true) {
            System.out.println(this.nome + "ja esta falando.");
        } else {
            this.falando = true;
            System.out.println(this.nome + " esta falando.");
        }
        //this.falando = true;
    }
    
    public void parar_falar() {
        if (this.falando == false) {
            System.out.println(this.nome + " nao esta falando.");
        }
        else {
            this.falando = false;
            System.out.println(this.nome + " parou de falar.");
        }
    }
    
    public void comer (String alimento) {
        
        if (falando == true) {
            System.out.println(this.nome + " nao pode comer falando.");
        }
        
        else if (comendo == true) {
            System.out.println(this.nome + " ja esta comendo.");
        } else {
            this.comendo = true;
            System.out.println(this.nome + " esta comendo " + alimento);
        }
    }
    
    public void parar_comer() {
        if (this.comendo == false) {
            System.out.println(this.nome + " nao esta comendo.");
        }
        else {
            this.comendo = false;
            System.out.println(this.nome + " parou de comer.");
        }
    }
    
}