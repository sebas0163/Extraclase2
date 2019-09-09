package Patrón_Observer;


public class Main {
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
