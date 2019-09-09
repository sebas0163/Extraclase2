package Patrón_Observer;

/**
 * Clase que define las características de los observadores.
 * @author Sebastián Moya Monge.
 */
public abstract class Observer {
    protected Subject sujeto;
    public abstract void actualizar();
}
