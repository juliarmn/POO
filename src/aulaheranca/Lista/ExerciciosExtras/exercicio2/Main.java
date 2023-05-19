package aulaheranca.Lista.ExerciciosExtras.exercicio2;

public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(5);
        Retangulo r = new Retangulo(5, 4);
        Triangulo t = new Triangulo(3, 4, 5, 4);

        FormaGeometrica []formas = {c, r, t};

        for (int i = 0; i < formas.length; i ++) {
            System.out.println("===============");
            if (formas[i] instanceof Circulo) {
                System.out.println("Tipo: " + formas[i].toString());
                System.out.println("Área: " + formas[i].calcularArea());
                System.out.println("Perímetro: " + formas[i].perimetro());
            }
            if (formas[i] instanceof Triangulo) {
                System.out.println("Tipo: " + formas[i].toString());
                System.out.println("Área: " + formas[i].calcularArea());
                System.out.println("Perímetro: " + formas[i].perimetro());
            }
            if (formas[i] instanceof Retangulo) {
                System.out.println("Tipo: " + formas[i].toString());
                System.out.println("Área: " + formas[i].calcularArea());
                System.out.println("Perímetro: " + formas[i].perimetro());
            }
        }
    }
}
