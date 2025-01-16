package animalitos;

public class Perro extends Mamifero {
    public Perro(String nombre) {
        super(nombre);
    }
    public void traerZapatillas() {
        System.out.println("Aqui te dejo los zapatos brou");
    }

    @Override
    public void comunicarse() {
        System.out.println("guau guau mi nombre es " + getNombre());
    }
}
