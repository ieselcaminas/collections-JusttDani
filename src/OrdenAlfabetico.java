import java.util.Arrays;
import java.util.List;
public class OrdenAlfabetico {
    public static void main(String[] args) {
        List<persona> personas= Arrays.asList(
                new persona("Dani","Tejedor",2005),
                new persona("papad","tekel",1999),
                new persona("sun","alugna",2025)
        );
        personas.stream().
                map(persona::getFirstName).
                distinct().
                sorted().
                forEach(System.out::println);
    }
}