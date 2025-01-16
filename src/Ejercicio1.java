import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<persona> personas = new ArrayList<persona>();
        persona persona1 = new persona("Pepe","guille",1977);
        personas.add(persona1);
        persona persona2 = new persona("isidro","panpolumio",1957);
        personas.add(persona2);
        persona persona3 = new persona("Wasouski","azaroso",1977);
        personas.add(persona3);

        long cuantas = personas.stream()
                .filter(persona -> persona.getBirthYear() < 1970)
                .count();
        System.out.println(cuantas);

    }
}
