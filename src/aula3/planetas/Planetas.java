package aula3.planetas;

import static java.lang.Math.pow;

public enum Planetas implements PlanetaInfo {
        MERCURIO(3.3, 2439700.0), VENUS(48.67, 6051800.0),
        TERRA(59.72, 6371000.0), MARTE(6.39, 3389500.0),
        JUPITER(18898.89, 69911000.0), SATURNO(5681.1, 58232000.0),
        URANO(86.81, 25362000.0), NETUNO(1024.26, 24622000.0);

        private double massa;
        private double raio;
        static final double GRAVIDADE = 6.67 * (pow(10, -11));

        Planetas(double massa, double raio) {
            this.massa = massa;
            this.raio = raio;
        }
        public double getRaio() {
            return raio;
        }

        public double gravidadeSuperficial() {

            return (GRAVIDADE * massa ) / (raio * raio);
        }

    @Override
    public double calcularMassa() {
        return massa * (pow(10, 21));
    }

    @Override
    public double calcularDiametro() {
        return 2 * raio;
    }
}

