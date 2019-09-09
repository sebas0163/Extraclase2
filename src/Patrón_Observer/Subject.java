package Patrón_Observer;

import java.util.ArrayList;

public class Subject {
    private ArrayList<Observer> observadores;
    private int kilometros;

    public Subject(){
        this.observadores = new ArrayList<>();
        this.kilometros = 15;
    }
    public void setKilometros(int recorrido){
        this.kilometros = recorrido;
        notificar();
    }
    public void notificar(){
        for (Observer observador: observadores){
            observador.actualizar();
        }
    }
    public void agregar(Observer observador){
        observadores.add(observador);
    }
    public int getKilometros(){
        return kilometros;
    }
}
