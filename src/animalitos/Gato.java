package animalitos;

public class Gato extends Mamifero {

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void comunicarse() {
        System.out.println("miuau miau rompo muebles y me llamo " + getNombre());
    }
}