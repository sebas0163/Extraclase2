package Patrón_Adapter;

/**
 * Clase abstracta que se encarga de establecer los atributos de las clases hijas
 * @author Sebastián Moya Monge
 */
public abstract class Vehículos {
    protected String marca;
    public abstract void encender();
    public abstract void apagar();
}
