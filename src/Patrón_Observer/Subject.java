package Patrón_Observer;

import java.util.ArrayList;

/**
 * Clase que guarda los datos del sujeto en observación.
 * @author Sebastián Moya Nonge
 */
public class Subject {
    private ArrayList<Observer> observadores;
    private int kilometros;

    /**
     * Método constructor.
     * @date 08/09/19
     */
    public Subject(){
        this.observadores = new ArrayList<>();
        this.kilometros = 15;
    }

    /**
     * Método encargado de cambiar el valor de los kilometros y llama al método notificar.
     * @param recorrido nuevo valor en kilometros.
     * @date 08/09/19
     */
    public void setKilometros(int recorrido){
        this.kilometros = recorrido;
        notificar();
    }

    /**
     * Método encargado de notficar a los observadores que hubo un cambio.
     * @date 08/09/19
     */
    public void notificar(){
        for (Observer observador: observadores){
            observador.actualizar();
        }
    }

    /**
     * Método encargado de añadir un nuevo observador a la lista.
     * @param observador instanica del objeto que se va a actulizar.
     * @date 08/09/19
     */
    public void agregar(Observer observador){
        observadores.add(observador);
    }

    /**
     * Método encargado de devolver los kilometros.
     * @return atributo kilometros.
     * @date 08/09/19
     */
    public int getKilometros(){
        return kilometros;
    }
}
