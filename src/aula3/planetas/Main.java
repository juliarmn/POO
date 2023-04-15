package aula3.planetas;

public class Main {
    public static void main(String[] args) {
        for (Planetas planeta : Planetas.values()) {
            System.out.println("Dados do planeta: ");
            System.out.println("-------------------------");
            System.out.println("Nome: " + planeta.name());
            System.out.println("Massa(kg): " + planeta.calcularMassa());
            System.out.println("Raio(Km): " + planeta.getRaio());
            System.out.println("Diâmetro(Km): " + planeta.calcularDiametro());
            System.out.println("Gravidade suerficial: " + planeta.gravidadeSuperficial());
            System.out.println("-------------------------");
        }
    }
}
