import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.util.Scanner;
 
public class HoraTrabalho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Informe o horario de entrada (hh:mm): ");
        String horarioStringEntrada = scanner.nextLine();
        
        System.out.print("Informe o horario de saida (hh:mm): ");
        String horarioStringSaida = scanner.nextLine();
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        
        LocalTime horarioEntrada = LocalTime.parse(horarioStringEntrada, formato);
        
        LocalTime horarioSaida = LocalTime.parse(horarioStringSaida, formato);
        
        Duration diferenca = Duration.between(horarioEntrada, horarioSaida);
        
        long horas = diferenca.toHours();
        long minutos = diferenca.toMinutes() % 60;
        
        System.out.println("Nome: " + nome);
        System.out.println("Entrada: " + horarioEntrada);
        System.out.println("Saida: " + horarioSaida);
        System.out.println("Horas trabalhadas: " + horas + " horas e " + minutos + " minutos");
        System.out.println("Horas extras: " + (horas > 8 ? "Sim" : "Nao"));
    }
}