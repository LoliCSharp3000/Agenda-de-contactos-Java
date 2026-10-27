
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    public static void agregarContacto(ArrayList<Contactos> lista, Scanner sc){
        sc.nextLine();
        System.out.println("Dame el nombre:");
        String nombre = sc.nextLine();
        System.out.println("Dame su numero de telefono:");
        String telefono = sc.nextLine();
        System.out.println("Dame su correo:");
        String correo = sc.nextLine();
        Contactos nuevo = new Contactos(nombre, telefono, correo);
        lista.add(nuevo);
        System.out.println("Contacto agregado");
    }
}
