/* 7 - Instanciamento dos carros */
/* 8 - Testes de classes */
class Main {
    public static void main(String[] args) {
        Carros C1 = new Carros();
        C1.setModelo("Peugeot 208");
        C1.setCor("Azul");
        C1.setAno(2005);
        C1.setvelocidadeMaxima(50);
        C1.setvelocidadeAtual(0);

        Carros C2 = new Carros();
        C2.setModelo("Fiat Cronos");
        C2.setCor("Vermelho");
        C2.setAno(2020);
        C2.setvelocidadeMaxima(80);
        C2.setvelocidadeAtual(60);

        System.out.println("---------------------- Carro 1 ----------------------");
        C1.mostrarInformacoes();
        C1.aumentarVelocidade();
        C1.mostrarInformacoes();
        C1.diminuirVelocidade();
        C1.diminuirVelocidade();
        C1.mostrarInformacoes();

        System.out.println("\n---------------------- Carro 2 ----------------------");
        C2.mostrarInformacoes();
        C2.aumentarVelocidade();
        C2.mostrarInformacoes();
        C2.aumentarVelocidade();
        C2.aumentarVelocidade();
        C2.mostrarInformacoes();
    }

}

/* 1- Crie a classe de carros */
class Carros{
    private String modelo;
    private String cor;
    private int ano;
    private int velocidadeMaxima;
    private int velocidadeAtual;

    /* 2- Crie o construtor de classe */
    public Carros() {
        this.modelo = "m";
        this.cor = "c";
        this.ano = 0;
        this.velocidadeMaxima = 100;
        this.velocidadeAtual = 0;
    }

    public Carros(String modelo, String cor, int ano, int velocidadeMaxima, int velocidadeAtual) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
    }

    /* 3 - Crie os setter e getters */
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo (String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }
    
    public void setCor (String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }
    
    public void setAno (int ano) {
        this.ano = ano;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    
    public void setVelocidadeMaxima (int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
    
    public void setVelocidadeAtual (int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    /* 4 - Método público aumentar velocidade */
    public void aumentarVelocidade(){
        if (this.velocidadeAtual < this.velocidadeMaxima) {
            this.velocidadeAtual = this.velocidadeAtual + 10;
        } else {
            System.out.println("O veículo já está em sua velocidade máxima.");
        }
    }

    /* 5 - Método público diminuir velocidade */
    public void diminuirVelocidade(){
        if (this.velocidadeAtual == 0) {
            System.out.println("O veículo está parado.");
        } else {
            velocidadeAtual = velocidadeAtual - 10;
        }
    }


    /* 6 - Método público mostrar informações */
    public void mostrarInformacoes (){
        if (this.velocidadeAtual == 0) {
            System.out.println("O carro " + modelo + " " + cor + " está parado.");
        } else if (this.velocidadeAtual >= this.velocidadeMaxima) {
            System.out.println("O carro " + modelo + " " + cor + " atingiu sua velocidade máxima.");
        } else {
            System.out.println("O carro " + modelo + " " + cor + " está a velocidade de " + velocidadeAtual + "km/h.");
        }
    }
}