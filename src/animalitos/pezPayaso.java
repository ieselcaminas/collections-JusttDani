package animalitos;

public class pezPayaso extends Pez {
    public pezPayaso(String nombre) {
        super(nombre);
        setSpecie("pezPayaso");
    }
    public void jugar() {
        System.out.println("toi jugando");
    }
}
