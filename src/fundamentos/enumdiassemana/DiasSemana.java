package fundamentos.enumdiassemana;

public enum DiasSemana {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;

    public static void main(String[] args) {
        for (DiasSemana dia : DiasSemana.values()) {
            System.out.println("Hoje é " + dia.name());
        }
    }
}
