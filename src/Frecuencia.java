import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frecuencia {
    public static void main(String[] args) {
        System.out.println(frecuencias());

    }

    public static Map<String, Integer> frecuencias() {
        Map<String, Integer> frecuencia = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la primera palabra: ");
        String palabra = sc.nextLine();
        while (!palabra.isEmpty()) {
            if (!frecuencia.containsKey(palabra)) {
                frecuencia.put(palabra, 1);
            } else {
                frecuencia.put(palabra, frecuencia.get(palabra) + 1);
            }
            System.out.println("Ingrese la siguiente palabra: ");
            palabra = sc.nextLine();
        }
        return frecuencia;
    }
}