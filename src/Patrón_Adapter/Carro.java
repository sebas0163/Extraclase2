package Patrón_Adapter;

/**
 * Clase que guarda los datos del auto y sus respectivos métodos.
 * @author Sebastián Moya
 */
public class Carro extends Vehículos {
    /**
     * Método constructor.
     * @param marca recibe un atributo string que es la marca del vehiculo.
     * @date 08/09/19
     */
    public Carro(String marca){
        this.marca = marca;
    }

    /**
     * Método encargado de encender el carro.
     * @date 08/09/19
     */
    @Override
    public void encender() {
        System.out.println("El carro " + marca +" está encendido");
    }

    /**
     * Método encargado de apagar el carro.
     * @date 08/09/19
     */
    @Override
    public void apagar() {
        System.out.println("El carro " + marca +" está apagado");
    }
}
