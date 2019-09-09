package Patrón_Adapter;

/**
 * Clase encargada de ejecutar las instrucciones del programa.
 * @author Sebastián Moya.
 */
public class Main {
    /**
     * Método que se encarga de correr las instrucciones
     * @param args
     * @date 8/9/19
     */
    public static void main(String[] args) {
        Vehículos carro = new Carro("Hyundai");
        Vehículos motocicleta = new Motocicleta("Yamaha");
        Vehículos bicicleta = new BiciletaAdapter("BMX");
        carro.encender();
        carro.apagar();
        System.out.println("___________________________________");
        motocicleta.encender();
        motocicleta.apagar();
        System.out.println("___________________________________");
        bicicleta.encender();
        bicicleta.apagar();
    }
}
