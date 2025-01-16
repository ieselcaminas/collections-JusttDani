import java.util.HashMap;
import java.util.Map;

public class MejorTerminacion {
    public static void main(String[] args) {
        System.out.println(terminaciones(new String[]{"66366", "02757", "2368566", "21315"}));
    }

    public static Map<Character, Integer> terminaciones(String[] boletos) {
        Map<Character, Integer> terminaciones = new HashMap<>();

        Character ultimo;
        Integer cont;

        for (String boleto : boletos) {
            ultimo = boleto.charAt(boleto.length() - 1);
            cont = terminaciones.get(ultimo);
            if (cont == null) {
                terminaciones.put(ultimo, 1);
            } else {
                terminaciones.put(ultimo, cont + 1);
            }
        }
        return terminaciones;
    }
}