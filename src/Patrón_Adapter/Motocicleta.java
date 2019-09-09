package Patrón_Adapter;

/**
 * Clase encargada de guardar los datos y métodos de la motocicleta.
 * @author Sebastián Moya Monge
 */
public class Motocicleta extends Vehículos {
    /**
     * Método contructor.
     * @param marca recibe un atributo string que es la marca del vehiculo.
     * @date 08/09/19
     */
    public Motocicleta(String marca){
        this.marca = marca;
    }

    /**
     * Método encargado de encender la motocicleta.
     * @date 08/09/19
     */
    @Override
    public void encender() {
        System.out.println("La motocicleta "+ marca + " está encendida");
    }

    /**
     * Método encargado de apagar la motocicleta.
     * @date 08/09/19
     */
    @Override
    public void apagar() {
        System.out.println("La motocicleta "+ marca + " está Apagada");
    }
}
