package aula3.elevador;
import aula3.elevador.Elevador;

import java.util.ArrayList;

public class Predio {
    int numAndar;
    int numElevador;
    ArrayList<Elevador> elevadores = new ArrayList<Elevador>();
    public Predio () {
        this.numAndar = 5;
        this.numElevador = 1;
    }

    public int getNumAndar() {
        return numAndar;
    }

    public void setNumAndar(int numAndar) {
        this.numAndar = numAndar;
    }

    public int getNumElevador() {
        return numElevador;
    }

    public void setNumElevador(int numElevador) {
        this.numElevador = numElevador;
    }

    public void setElevadores(ArrayList<Elevador> elevadores) {
        this.elevadores = elevadores;
    }

    public Predio (int numAndar) {
        this.numAndar = numAndar;
        this.numElevador = 1;
    }
    public Predio (int numElevador, int numAndar) {
        this.numAndar = numAndar;
        this.numElevador = numElevador;
    }

    public void criarElevador(){
        elevadores.add(new Elevador());
    }

    public ArrayList<Elevador> getElevadores() {
        return elevadores;
    }
}
