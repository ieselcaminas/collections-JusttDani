import java.util.Arrays;
import java.util.List;
public class OrdenAlfabetico {
    public static void main(String[] args) {
        List<persona> personas= Arrays.asList(
                new persona("Abel","Sabater",2006),
                new persona("Ximo","Alcacer",1954),
                new persona("Ana","Alvarez",2015)
        );
        personas.stream().
                map(persona::getFirstName).
                distinct().
                sorted().
                forEach(System.out::println);
    }
}