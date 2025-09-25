public class Contactos {
    String nombre;
    String telefono;
    String correo;

    public Contactos(String nombre, String telefono, String correo){
        nombre = this.nombre;
        telefono = this.telefono;
        correo = this.correo;
    }

    public String toString(){
        return "nombre: " + nombre + " telefono: " + telefono + " correo: " + correo;
    }
}
