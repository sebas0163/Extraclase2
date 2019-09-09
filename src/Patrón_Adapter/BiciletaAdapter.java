package Patrón_Adapter;

/**
 * Clase encargada de adaptar la clase Bicicleta a la clase Vehículo
 */
public class BiciletaAdapter extends Vehículos {
    private Bicicleta bici;

    /**
     * Método contructor
     * @param marca recibe un atributo string que es la marca del vehiculo.
     * @date 08/09/19
     */
    public BiciletaAdapter(String marca){
        this.bici = new Bicicleta(marca);
    }

    /**
     * Método que adapta el método pedalear al método encender de la clase Vehículo.
     * @date 08/09/19.
     */
    @Override
    public void encender() {
        bici.pedalear();
    }
    /**
     * Método que adapta el método detenerse al método apagar de la clase Vehículo.
     * @date 08/09/19.
     */
    @Override
    public void apagar() {
        bici.detenerse();
    }
}
