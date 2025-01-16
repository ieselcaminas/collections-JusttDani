package animalitos;

public class mainAnimales {
    public static void main(String[] args) {
        Perro dogo = new Perro("Juan");
        System.out.println("Es un " + dogo.getSpecie());
        dogo.comunicarse();
        dogo.respirar();
        dogo.mamar();
        dogo.moverse();
        dogo.traerZapatillas();


        System.out.println("---------------------------------");
        Gato gato = new Gato("Michino");
        System.out.println("Es un " + gato.getSpecie());
        gato.comunicarse();
        gato.respirar();
        gato.mamar();
        gato.moverse();


        System.out.println("---------------------------------");
        Tiburon tiburon = new Tiburon("GluGlu");
        System.out.println("Es un " + tiburon.getSpecie());
        tiburon.comunicarse();
        tiburon.respirar();
        tiburon.moverse();

        System.out.println("---------------------------------");
        pezPayaso nemo = new pezPayaso("Nemo");
        System.out.println("Es un " + nemo.getSpecie());
        tiburon.comunicarse();
        tiburon.respirar();
        tiburon.moverse();
    }
}
