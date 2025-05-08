import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.util.Scanner;
 
public class HoraEstacionamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a placa do veiculo: ");
        String placa = scanner.nextLine();
        
        System.out.print("Informe o horario de entrada (hh:mm): ");
        String horarioStringEntrada = scanner.nextLine();
        
        System.out.print("Informe o horario de saida (hh:mm): ");
        String horarioStringSaida = scanner.nextLine();
        
        /* Calcula o tempo de permanencia */
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        
        LocalTime horarioEntrada = LocalTime.parse(horarioStringEntrada, formato);
        
        LocalTime horarioSaida = LocalTime.parse(horarioStringSaida, formato);
        
        Duration diferenca = Duration.between(horarioEntrada, horarioSaida);
        
        long minutos = diferenca.toMinutes();
        
        /* Apresenta o recibo */
        System.out.println("------------------------------");
        System.out.println("Recibo");
        System.out.println("------------------------------");
        System.out.println("Placa: " + placa);
        System.out.println("Entrada: " + horarioEntrada);
        System.out.println("Saida: " + horarioSaida);
        System.out.println("Tempo total (em minutos): " + minutos);
        
        /* Calcula o valor a pagar */
        double valorPagar = 5;
        
        if(minutos > 60){
                            
            minutos -= 60;
            
            valorPagar += Math.ceil(minutos / 15.0) * 2; /* A função ceil faz o arredondamento para cima */
        }
        
        System.out.println("Total a pagar: R$ " + valorPagar);
        System.out.println("------------------------------");
    }
}