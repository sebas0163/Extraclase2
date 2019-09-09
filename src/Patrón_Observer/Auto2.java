package Patrón_Observer;

/**
 * Clase encargada de crear el auto número 2.
 * @author Sebastián Moya Monge.
 */
public class Auto2 extends Observer {
    private final double GASTO_GASOLINA = 0.0089;
    private int recorrido;
    /**
     * Método constructor.
     * @param sujeto recibe una instancia del objeto en observación
     * @date 08/09/19.
     */
    public Auto2(Subject sujeto){
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
        System.out.println("El gasto de gasolina es de" + GASTO_GASOLINA + " cuando se recorre " + recorrido + " kilometros en el auto 2");
    }
}
