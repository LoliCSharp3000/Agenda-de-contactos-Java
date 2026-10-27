
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Contactos> contactos = new ArrayList<>();
        int option = 0;
        Scanner sc = new Scanner(System.in);
        boolean fin = true;
        while (fin) {
             System.out.println("Que quereis hacer 1:añadir un contacto.   2:Mostrar.   3:Salir.   4:Mostrar contactos numerados.   5:Eliminar contacto por indice");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    Agenda.agregarContacto(contactos, sc);
                    break;
                case 2:
                    if (contactos.isEmpty()) {
                        System.out.println("No hay contactos añadidos");
                    }else{
                        for (Contactos contacto : contactos) {
                            System.out.println(contacto);
                        }
                    }
                    break;
                case 3:
                    fin = false;
                    break;
                case 4:
                    if (contactos.isEmpty()) {
                        System.out.println("No hay contactos añadidos");
                    }else{
                        for (int i = 0; i < contactos.size(); i++) {
                            System.out.println((i + 1) + ":" + contactos.get(i).getNombre());
                        }
                    }
                    break;
                case 5:
                    if (contactos.isEmpty()) {
                        System.out.println("La lista esta vacia");
                    }else{
                        System.out.println("Dime el numero de indice del contacto");
                        try {
                            int ind = sc.nextInt();
                            if (ind > contactos.size() || ind <= 0) {
                                System.out.println("Número de contacto no válido");
                            }else{
                                contactos.remove(ind - 1);
                            }
                        } catch (Exception e) {
                            sc.nextLine();
                            System.out.println("pon el numero correcto");
                        }
                    }
                    break;
                default:
                    System.out.println("Opción no válida, inténtalo de nuevo.");
            } 
        }
    sc.close();
    }
}
