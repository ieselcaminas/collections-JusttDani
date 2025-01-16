package animalitos;

public abstract class Pez extends Animal {
    public Pez(String nombre) {
        super(nombre);
    }
    @Override
    public void comunicarse() {
        System.out.println("GluGluGlu mi nombre es " + getNombre());
    }

    @Override
    public void respirar() {
        System.out.println("Respiro por mis branqueas bro");
    }

    @Override
    public void moverse() {
        System.out.println("Nado");
    }
}
