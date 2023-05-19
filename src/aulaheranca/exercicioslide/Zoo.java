package aulaheranca.exercicioslide;

public class Zoo {
    public static void main(String[] args) {
        Gato gato = new Gato("Chihiro", 4, "amarelo", 5, "Maine Coon");
        Ovelha ovelha =  new Ovelha("Totoro", 4, "Valais Blacknose", 3, "branca");
        Vaca vaca = new Vaca("Sophie",4, "malhada", 6, 8);
        Animal bichos[]= {vaca, gato, ovelha};
        if(vaca instanceof Animal) {
            System.out.println("Vaca é um animal");
        }
        if(ovelha instanceof Animal) {
            System.out.println("Ovelha é um animal");

        }
        if(gato instanceof Animal) {
            System.out.println("Gato é um animal");

        }

        for(int i = 0; i < bichos.length; i ++) {
            System.out.println("==================");
            System.out.println("Nome: " + bichos[i].getNome());
            if (bichos[i] instanceof Vaca) {
                System.out.println("É uma vaca, tem " + bichos[i].getNumeroPatas() + " patas e " + ((Vaca) bichos[i]).getIdade() + " anos de idade");
                System.out.println("Sua cor é " + ((Vaca) bichos[i]).getCor());
                System.out.println("Seu leite é classificado (no padrão de 1 a 10) com pontuação " + ((Vaca) bichos[i]).getQualidadeDoLeite());
                System.out.println("Seu som: ");
                bichos[i].emitirSom();
            }
            if (bichos[i] instanceof Gato) {
                System.out.println("É um gato, tem " + bichos[i].getNumeroPatas() + " patas e " + ((Gato) bichos[i]).getIdade() + " anos de idade");
                System.out.println("Sua cor é " + ((Gato) bichos[i]).getCor());
                System.out.println("Sua raça é " + ((Gato) bichos[i]).getRaca());
                System.out.println("Seu som: ");
                bichos[i].emitirSom();
            }
            if (bichos[i] instanceof Ovelha) {
                System.out.println("É uma ovelha, tem " + bichos[i].getNumeroPatas() + " patas e " + ((Ovelha) bichos[i]).getIdade() + " anos de idade");
                System.out.println("Sua cor é " + ((Ovelha) bichos[i]).getCorDaLa());
                System.out.println("Sua raça é " + ((Ovelha) bichos[i]).getRaca());
                System.out.println("Seu som: ");
                bichos[i].emitirSom();
            }
        }
    }
}
