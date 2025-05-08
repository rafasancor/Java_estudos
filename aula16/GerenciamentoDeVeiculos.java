import java.util.List;
import java.util.ArrayList;

class GerenciamentoDeVeiculos {
    public static void main(String[] args) {
        List<Veiculo> frotas = new ArrayList<>();

        Carro c1 = new Carro("Vw", "Gol", 2020, 20, 13.3);
        Moto m1 = new Moto("Honda", "CG", 2021, 50, 32);

        frotas.add(c1);
        frotas.add(m1);

        System.out.println("\nToda frota de veículos:");
        for (Veiculo veiculo : frotas) {
            System.out.println("Marca: " + veiculo.getMarca() + ", Nome: " + veiculo.getModelo());
        }

        System.out.println("\nTeste de aceleração e frenagem do carro:");
        c1.acelerar();
        c1.frear();
        
        System.out.println("\nTeste de aceleração e frenagem da moto:");
        m1.acelerar();
        m1.frear();

        System.out.println("\nAutonomia do carro:");
        System.out.println("O veículo pode percorrer " + c1.calcularAutonomia() + " km com a quantidade de gasolina atual.");
        
        System.out.println("\nAutonomia da moto:");
        System.out.println("O veículo pode percorrer " + m1.calcularAutonomia() + " km com a quantidade de gasolina atual.");

        System.out.println("\nVerificação se precisa de abastecimento o carro:");
        System.out.println(c1.precisaAbastecimento() ? "Sim" : "Não");
        
        System.out.println("\nVerificação se precisa de abastecimento a moto:");
        System.out.println(m1.precisaAbastecimento() ? "Sim" : "Não");

        System.out.println("\nRealizar viagem de carro:");
        c1.realizarViagem(100);
        
        System.out.println("\nRealizar viagem de moto:");
        m1.realizarViagem(200);
        
        System.out.println("\nDetalhes dos veículos:");
        c1.mostrarDetalhes();
        System.out.println();
        m1.mostrarDetalhes();

        // Remoção de um veículo da frota
        frotas.remove(c1);
        
        System.out.println("\nToda frota de veículos atualizada:");
        for (Veiculo veiculo : frotas) {
            System.out.println("Marca: " + veiculo.getMarca() + ", Nome: " + veiculo.getModelo());
        }

    }
}

class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double combustivel;
    private double consumoMedio;

    public Veiculo(String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.combustivel = combustivel;
        this.consumoMedio = consumoMedio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }
    
    public double calcularAutonomia(){
        double autonomia = combustivel * consumoMedio;

        return autonomia;
    }

    public boolean precisaAbastecimento() {
        return calcularAutonomia() < 30;
    }

    public void realizarViagem(double distancia) {
        double autonomiaAtual = calcularAutonomia();
        if (distancia <= autonomiaAtual) {
            double combustivelUsado = distancia / consumoMedio;
            combustivel -= combustivelUsado;
            System.out.printf("Viagem realizada com sucesso! Restaram %.2f litros de combustível no veículo!\n", combustivel);
        } else {
            System.out.println("Não foi possível realizar a viagem!");
        }
    }

    public void mostrarDetalhes(){
        System.out.println("Veículo: " + getMarca() + " " + getModelo());
        System.out.println("Ano de fabricacao: " + getAnoFabricacao());
        System.out.println("Autonomia: " + calcularAutonomia() + " km");
        System.out.println("Precisa de abastecimento? " + (precisaAbastecimento() ? "Sim" : "Não"));
    }
    
    public void acelerar() {
        System.out.println("Veículo acelerando...");
    }

    public void frear() {
        System.out.println("Veículo freando...");
    }
}

    class Carro extends Veiculo {
        public Carro (String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio) {
            super(marca, modelo, anoFabricacao, combustivel, consumoMedio);
        }
        
        @Override
        public void acelerar(){
            System.out.println("Carro acelerando...");
        }
        
        @Override
        public void frear(){
            System.out.println("Carro freando...");
        }
    }

    class Moto extends Veiculo {
        public Moto (String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio) {
            super(marca, modelo, anoFabricacao, combustivel, consumoMedio);
        }
        
        @Override
        public void acelerar(){
            System.out.println("Moto acelerando...");
        }
        
        @Override
        public void frear(){
            System.out.println("Moto freando...");
        }
    }