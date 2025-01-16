import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital {
    public static void main(String[] args) {
        Map<String, String> paises = new HashMap<String, String>();
        paises.put("Albania", "Tirana");
        paises.put("Argentina", "Buenos Aires");
        paises.put("Austria", "Viena");
        paises.put("Bulgaria", "Sofía");
        System.out.println("De que pais quieres saber la capital?");
        Scanner sc = new Scanner(System.in);
        System.out.println(getCapital(sc.next(),paises ));


    }
    public static String getCapital(String pais, Map<String, String> paises) {
       return paises.get(pais);
    }
}
