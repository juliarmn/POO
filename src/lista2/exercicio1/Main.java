package lista2.exercicio1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tempo tempo1 = new Tempo();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite as horas, minutos e segundos");
        tempo1.setHoras(scan.nextInt());
        tempo1.setMinutos(scan.nextInt());
        tempo1.setSegundos(scan.nextInt());
        System.out.println("Digite as horas, minutos e segundos do segundo tempo");
        Tempo tempo2 = new Tempo (scan.nextInt(), scan.nextInt(), scan.nextInt());
        System.out.println("-----------------------------------------------------------");
        System.out.println("Tempo 1 formatado: " );
        tempo1.formataTempo(tempo1.getHoras(), tempo1.getMinutos(), tempo1.getSegundos());
        System.out.println("Tempo 2 formatado: " );
        tempo2.formataTempo(tempo2.getHoras(), tempo2.getMinutos(), tempo2.getSegundos());
        System.out.println("-----------------------------------------------------------");
        Tempo tempo3 = new Tempo();
        tempo3.subtrairTempo(tempo1, tempo2, tempo3);
        System.out.println("A subtração dos tempos é: " );
        tempo3.formataTempo(tempo3.getHoras(), tempo3.getMinutos(), tempo3.getSegundos());
        tempo3.somarTempo(tempo1, tempo2, tempo3);
        System.out.println("A soma dos tempos é: ");
        tempo3.formataTempo(tempo3.getHoras(), tempo3.getMinutos(), tempo3.getSegundos());
    }
}
