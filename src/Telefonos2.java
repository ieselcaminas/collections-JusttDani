import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos2 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> telefonos = new HashMap<String, ArrayList<Integer>>();
        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(24522626);
        n1.add(6645474);
        n1.add(98695784);
        telefonos.put("Manu", n1);
        n1 = new ArrayList<>();
        n1.add(154747);
        n1.add(456633);
        n1.add(568568);
        telefonos.put("Jose", n1);
        System.out.println("De quien es el telefono que quieres mostrar?");
        Scanner sc = new Scanner(System.in);
        System.out.println(getNumeroTelefono(sc.next(), telefonos));


    }

    public static ArrayList<Integer> getNumeroTelefono(String nombre, Map<String, ArrayList<Integer>> telefonos) {
        return telefonos.get(nombre);

    }
}
