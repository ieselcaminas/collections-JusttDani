import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Botin {
    public static void main(String[] args) {
        String[] a = {"20", "50", "100", "60", "80"};
        System.out.println(repartirDinero(3, a));
    }

    public static Map<Integer, ArrayList<String>> repartirDinero(int n, String[] billetes) {
        Map<Integer, ArrayList<String>> dinero = new HashMap<>();

        for (int i = 0; i < billetes.length - 1; ) {
            for (int j = 1; j < n + 1; j++) {
                ArrayList<String> existente = dinero.getOrDefault(j, new ArrayList<>());
                existente.add(billetes[i]);
                dinero.put(j, existente);

                if (i < billetes.length - 1) {
                    i++;
                } else {
                    break;
                }
            }
        }
        return dinero;
    }
}