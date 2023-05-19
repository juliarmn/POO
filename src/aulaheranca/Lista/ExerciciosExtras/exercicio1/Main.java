package aulaheranca.Lista.ExerciciosExtras.exercicio1;

public class Main {
    public static void main(String[] args) {
        Mamiferos mamifero = new Mamiferos("cachorro");
        Ave ave = new Ave("Bem-te-vi");
        Reptil reptil = new Reptil("Cobra");
        Anfibio anfibio = new Anfibio("Sapinho");
        Peixe peixe = new Peixe("Peixinho dourado");

        Animal []bichos = {mamifero, ave, reptil, anfibio, peixe};

        for (int i = 0; i < bichos.length; i ++) {
            System.out.println("=================");
            if (bichos[i] instanceof Mamiferos) {
                System.out.println(bichos[i].toString());
                System.out.println("Tipo: " + ((Mamiferos) bichos[i]).getTipo());
                bichos[i].seMovimentar();
                bichos[i].fazerSom();
            }
            if (bichos[i] instanceof Ave) {
                System.out.println(bichos[i].toString());
                System.out.println("Tipo: " + ((Ave) bichos[i]).getTipo());
                bichos[i].seMovimentar();
                bichos[i].fazerSom();
            }
            if (bichos[i] instanceof Peixe) {
                System.out.println(bichos[i].toString());
                System.out.println("Tipo: " + ((Peixe) bichos[i]).getTipo());
                bichos[i].seMovimentar();
                bichos[i].fazerSom();
            }
            if (bichos[i] instanceof Reptil) {
                System.out.println(bichos[i].toString());
                System.out.println("Tipo: " + ((Reptil) bichos[i]).getTipo());
                bichos[i].seMovimentar();
                bichos[i].fazerSom();
            }
            if (bichos[i] instanceof Anfibio) {
                System.out.println(bichos[i].toString());
                System.out.println("Tipo: " + ((Anfibio) bichos[i]).getTipo());
                bichos[i].seMovimentar();
                bichos[i].fazerSom();
            }
        }
    }
}
