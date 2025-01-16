package animalitos;

public abstract class Mamifero extends Animal {
    public Mamifero(String nombre) {
        super(nombre);


    }
    public void mamar()
    {
        System.out.println("Cuando soy pequeño mamo");
    }
}