import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos {
    public static void main(String[] args) {
        Map<String, Integer> telefonos = new HashMap<String, Integer>();
        telefonos.put("Manu", 76935066);
        telefonos.put("Jose", 64784768);
        telefonos.put("Pau", 2946395);
        System.out.println("De quien es el telefono que quieres mostrar?");
        Scanner sc = new Scanner(System.in);
        System.out.println(getNumeroTelefono(sc.next(), telefonos));


    }

    public static int getNumeroTelefono(String nombre, Map<String, Integer> telefonos) {
        return telefonos.get(nombre);

    }
}
