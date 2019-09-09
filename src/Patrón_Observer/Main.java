package Patrón_Observer;

// Codigo basado en el siguiente video https://www.youtube.com/watch?v=QiKrKNTdGGs

/**
 * Clase encargada de ejecutar el programa.
 * @author Sebastián Moya Monge.
 */
public class Main {
    /**
     * Método encargado de crear instancias y ejecutarlas.
     * @date 08/09/19.
     * @param args
     */
    public static void main(String[] args) {
        Subject sujeto = new Subject();
        new Auto1(sujeto);
        new Auto3(sujeto);
        new Auto2(sujeto);

        sujeto.setKilometros(10);
        System.out.println("_____________________________________________________________________________\n");
        sujeto.setKilometros(38);
    }
}
