import java.util.ArrayList;
public class Apellido_A {
    public static void main(String[] args) {
        ArrayList<persona> personas=new ArrayList<>();
        persona p=new persona("Dani","Tejedor",2005);
        personas.add(p);
        p=new persona("Juan","falete",1999);
        personas.add(p);
        p=new persona("Pepe","tomilo",2009);
        personas.add(p);
        long num= personas.stream().
                filter(pers->pers.getLastName().charAt(0)=='A').
                count();
        System.out.println(num);
    }
}