package Patrón_Adapter;

/**
 * Clase encargada de guardar los datos y aplicar los método de la bicicleta.
 * @author Sebastián Moya Monge
 */
public  class Bicicleta {
    private String marca;

    /**
     * Método constructor
     * @param marca recibe un atributo string que es la marca del vehiculo.
     * @date 08/09/19
     */
    public Bicicleta(String marca){
        this.marca = marca;
    }

    /**
     * Método que indica que la bicicleta está en uso.
     */
    public void pedalear(){
        System.out.println("La bicicleta " + marca+ " está pedaleando");
    }

    /**
     * Método encargado que indica que la bicicleta ya no esta en uso.
     */
    public void detenerse(){
        System.out.println("La bicicleta " + marca+" está dejando de pedalear");
    }

}
