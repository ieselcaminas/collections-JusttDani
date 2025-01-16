import java.util.ArrayList;
import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        ArrayList<Integer> alumnos = new ArrayList<>();
       int a = numeroAlumnos();
       leerAlturas(alumnos,a);
       int media = calcularMedia(alumnos);
       System.out.println(media);
       mostrarResultado(alumnos,media);


    }

    public static int numeroAlumnos() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de alumnos: ");
        return sc.nextInt();
    }

    public static void leerAlturas(ArrayList<Integer> alumnos, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("Ingrese la altura del alumno numero %d : ", i + 1);
            alumnos.add(sc.nextInt());
        }
    }

    public static int calcularMedia(ArrayList<Integer> alumnos) {
        int media = 0;
        for (int i = 0; i < alumnos.size(); i++) {
            media += alumnos.get(i);
        }
        return media / alumnos.size();
    }

    public static int calcularAlumnosAlturaSuperior(ArrayList<Integer> alumnos) {
        int media = 0;
        int altos = 0;
        for (int i = 0; i < alumnos.size(); i++) {
            media += alumnos.get(i);
        }
        media = media / alumnos.size();
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i) > media) {
                altos++;
            }
        }
        return altos;
    }

    public static int calcularAlumnosAlturaInferior(ArrayList<Integer> alumnos) {
        int media = 0;
        int bajos = 0;
        for (int i = 0; i < alumnos.size(); i++) {
            media += alumnos.get(i);
        }
        media = media / alumnos.size();
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i) < media) {
                bajos++;
            }
        }
        return bajos;
    }
    public static void mostrarResultado(ArrayList<Integer> alumnos, int n) {
        int altos = 0;
        int bajos = 0;
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i) > n) {
                altos++;
            }else {
                bajos++;
            }
        }
        System.out.println("La altura de todos los alumnos es " + alumnos);
        System.out.println("La altura media es: " + n);
        System.out.printf("Hay %d personas que superan el promedio", altos);
        System.out.println();
        System.out.printf("Hay %d personas que no superan el promedio", bajos);
    }
}