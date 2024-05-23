package Ejercicio3;

class Profesor extends Persona{
    private String materia;
    private String especialidad;
    private int aniosExperiencia;


    public Profesor(int id, String Nombre, String Apellidos, int Edad,
                    String materia, String especialidad, int aniosExperiencia) {
        super(id, Nombre, Apellidos, Edad);
        this.materia = materia;
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String saludoProfesor(){
        return "Este texto viene desde la clase Profesor";
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre del Profesor: " + nombre + " " + apellidos);
        System.out.println("Id: " + id);
        System.out.println("Edad: " + edad);
        System.out.println("Materia: " + materia);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Años de experiencia: " + aniosExperiencia);
    }

    public void prepararClase(){
        System.out.println("Hola soy un profesor y estoy preparando la clase para mis alumnos");
    }

    public void enseñar(){
        System.out.println("Les voy a enseñar a programar");
    }

    public void evaluarEstudintes(){
        System.out.println("Al finalizar lo aprendido debo evaluar a los estudiantes");
    }

    public void marcarAsistencia(){
        System.out.println("Al entrar debo marcar asistencia");
    }
}
