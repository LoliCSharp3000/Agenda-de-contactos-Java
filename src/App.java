
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Contactos> contactos = new ArrayList<>();
        int option = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que quereis hacer 1:añadir un contacto");
        option = sc.nextInt();
        switch (option) {
            case 1:
                
                Agenda.agregarContacto(contactos, sc);
                break;
            default:
                throw new AssertionError();
        } 
    }
}
