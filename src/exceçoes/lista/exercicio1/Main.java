package exceçoes.lista.exercicio1;

public class Main {
    public static void main(String[] args) {
        Retangulo r = new Retangulo(3.2, 1.2);
        Circulo c = new Circulo(4.15);

        System.out.println("Área do retângulo = " + r.calcularArea());
        System.out.println("Perímetro do ratângulo = " + r.calcularPerimetro());

        System.out.println("=========================================");
        System.out.println("Área do circunferência = " + c.calcularArea());
        System.out.println("Perímetro da circunferência = " + c.calcularPerimetro());
    }
}
