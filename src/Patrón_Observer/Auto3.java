package Patrón_Observer;

public class Auto3 extends Observer {
    private final double GASTO_GASOLINA = 0.0105;
    private int recorrido;

    public Auto3(Subject sujeto) {
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
        this.recorrido = sujeto.getKilometros();
    }

    @Override
    public void actualizar() {
        this.recorrido = sujeto.getKilometros();
        double gasto = recorrido * GASTO_GASOLINA;
        System.out.println("El gasto de gasolina es de" + GASTO_GASOLINA + " cuando se recorre " + recorrido + " kilometros en el auto 3");
    }
}
