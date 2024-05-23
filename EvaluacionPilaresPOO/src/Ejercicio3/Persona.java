package Ejercicio3;

public class Persona {
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public Persona(){}

    public Persona(int id, String Nombre, String Apellidos, int Edad){
        this.id = id;
        this.nombre = Nombre;
        this.apellidos = Apellidos;
        this.edad = Edad;
    }

    public String saludoPersona() {
        return "Este texto viene desde la clase Persona";
    }

    public void mostrarInformacion(){
        System.out.println("Id: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
    }
}
