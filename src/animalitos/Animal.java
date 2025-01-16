package animalitos;
/*
 * Esta clase da cierta funcionalidad para un Animal que tiene un nombre y sabe hacer ciertas cosas!
 */
public abstract class Animal
{
    private String nombre;
    private String specie;


    /*
     * Constructor para objetos de la clase Animal
     */
    public Animal(String nombre)
    {
        this.nombre = nombre;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /*
     * El método comunicarse es común para el gato y el perro, aunque cada uno lo hace de una forma
     *
     */
    public void comunicarse()
    {
        System.out.println("Mi nombre es " + nombre);
    }

    /**
     * El método respirar es común para el gato y el perro
     *
     */
    public abstract void respirar();

    /*
     * El método moverse es común para el gato y el perro
     *
     */
    public abstract void moverse();
    /*
     * El método mamar es común para el gato y el perro
     *
     */

    /*
     *
     * toString() Representación como cadena de un objeto animal
     *
     * @returns  La representación como cadena de un objeto animal
     *
     */
    public String toString()
    {
        return "Animal: " + nombre;
    }
}

