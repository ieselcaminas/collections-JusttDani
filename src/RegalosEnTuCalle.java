import java.util.ArrayList;

public class RegalosEnTuCalle {
    public static void main(String[] args) {
        ArrayList<Integer> puertas = new ArrayList<>();
        puertas.add(2);
        puertas.add(5);
        puertas.add(1);
        puertas = orden(3, puertas);
        System.out.println(puertas);

    }
    public static ArrayList<Integer> orden(int n, ArrayList<Integer> a) {
        int diferencia = 0;
        int direccion;
        ArrayList<Integer> b = new ArrayList<>();
        while (!a.isEmpty()) {
            diferencia = (Math.abs(a.getFirst() - n));
            direccion = a.getFirst();
            for (int i = 0; i < a.size(); i++) {
                if ((Math.abs(a.get(i) - n)) < diferencia){
                    diferencia = Math.abs(a.get(i) - n);
                    direccion = a.get(i);
                }
            }
            b.add(direccion);
            a.remove(new Integer(direccion));
            n = direccion;
        }
        return b;
    }
}
