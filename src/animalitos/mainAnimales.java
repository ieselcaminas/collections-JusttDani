package animalitos;

public class mainAnimales {
    public static void main(String[] args) {
        Perro dogo = new Perro("Juan");
        dogo.comunicarse();
        dogo.respirar();
        dogo.mamar();
        dogo.moverse();
        dogo.traerZapatillas();


        System.out.println("---------------------------------");
        Gato gato = new Gato("Michino");
        gato.comunicarse();
        gato.respirar();
        gato.mamar();
        gato.moverse();


        System.out.println("---------------------------------");
        Tiburon tiburon = new Tiburon("GluGlu");
        tiburon.comunicarse();
        tiburon.respirar();
    }
}
