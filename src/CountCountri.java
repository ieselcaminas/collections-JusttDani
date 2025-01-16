import java.io.*;
import java.util.*;

public class CountCountri {
    public static Map<String, Integer> countCountries() throws IOException {
        Map<String, Integer> map = new HashMap<>();

        BufferedReader reader = new BufferedReader(new FileReader("/home/dantejmar/Baixades/Colfuturo-Seleccionados.csv"));
        String line;

        reader.readLine();

        while ((line = reader.readLine()) != null) {
            String[] campos = line.split(",");

            String pais = campos[0].trim();
            map.put(pais, map.getOrDefault(pais, 0) + 1);
        }

        reader.close();
        return map;
    }

    public static void main(String[] args) throws IOException {
        Map<String, Integer> resultado = countCountries();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del país:");
        String paisBuscado = scanner.nextLine().trim();

        int count = resultado.getOrDefault(paisBuscado, 0);
        System.out.println("Número de alumnos de " + paisBuscado + ": " + count);
    }
}

