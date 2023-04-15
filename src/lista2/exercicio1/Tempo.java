package lista2.exercicio1;
/*1. Crie uma classe Tempo com 3 atributos: horas, minutos e segundos. Crie dois construtores: um
para inicializar os atributos com valor 0 e outro para inicializar os atributos com valores passados
como argumentos. Crie métodos para:
a. Funcionar como getter e setter;
b. Imprimir os atributos no formato hh:mm:ss;
c. Subtrair dois objetos e colocar o resultado no objeto que o chamou;
d. Somar que soma dois objetos e colocar o resultado no objeto que o chamou;
e. Sobrecarregue este  último método para que retorne um objeto com o resultado da operação.*/

public class Tempo {
    private int horas;
    private int minutos;
    private int segundos;
    public Tempo () {
        horas = 0;
        minutos = 0;
        segundos = 0;
    }

    public Tempo (int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public void formataTempo(int horas, int minutos, int segundos) {
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }

    public Tempo subtrairTempo (Tempo obj1, Tempo obj2, Tempo obj3) {
            obj3.horas = obj1.horas - obj2.horas;
            obj3.minutos = obj1.minutos - obj2.minutos;
            obj3.segundos = obj1.segundos - obj2.segundos;
            if (obj3.segundos < 0) {
                obj3.segundos += 60;
                obj3.minutos --;
            }
        if (obj3.minutos < 0) {
            obj3.minutos += 60;
            obj3.horas --;
        }
        if (obj3.horas < 0) {
            obj3.horas += 24;
        }
        return obj3;
    }

    public Tempo somarTempo (Tempo obj1, Tempo obj2, Tempo obj3) {
            obj3.horas = obj1.horas + obj2.horas;
            obj3.minutos = obj1.minutos + obj2.minutos;
            obj3.segundos = obj1.segundos + obj2.segundos;
            if (obj3.segundos > 60) {
                obj3.segundos -= 60;
                obj3.minutos ++;
            }
        if (obj3.minutos > 60) {
            obj3.minutos -= 60;
            obj3.horas ++;
        }
        if (obj3.horas > 24) {
            obj3.horas -= 24;
        }
        return obj3;
    }
}
