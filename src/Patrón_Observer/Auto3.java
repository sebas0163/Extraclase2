package Patrón_Observer;
/**
 * Clase encargada de crear el auto número 3.
 * @author Sebastián Moya Monge.
 */

public class Auto3 extends Observer {
    private final double GASTO_GASOLINA = 0.0105;
    private int recorrido;

    /**
     * Método constructor.
     * @param sujeto recibe una instancia del objeto en observación
     * @date 08/09/19.
     */
    public Auto3(Subject sujeto) {
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
        this.recorrido = sujeto.getKilometros();
    }
    /**
     * Método encargado de actualizar los datos.
     * @date 08/09/19
     */
    @Override
    public void actualizar() {
        this.recorrido = sujeto.getKilometros();
        double gasto = recorrido * GASTO_GASOLINA;
        System.out.println("El gasto de gasolina es de" + GASTO_GASOLINA + " cuando se recorre " + recorrido + " kilometros en el auto 3");
    }
}
