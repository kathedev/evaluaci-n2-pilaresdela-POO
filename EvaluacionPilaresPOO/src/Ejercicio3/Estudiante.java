package Ejercicio3;

class Estudiante extends Persona{
    private String grado;
    private double promedio;

    public Estudiante(){}

    public Estudiante(int id, String Nombre, String Apellidos, int Edad,
                      String grado, double promedio) {
        super(id, Nombre, Apellidos, Edad);
        this.grado = grado;
        this.promedio = promedio;
    }

    public String saludoEstudiante(){
        return "Este texto viene de la clase Estudiante";
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre del Estudiante: " + nombre + " " + apellidos);
        System.out.println("Id: " + id);
        System.out.println("Edad: " + edad);
        System.out.println("Grado: " + grado);
        System.out.println("Promedio: " + promedio);
    }

    public void tomarClase(){
        System.out.println("Soy un estudiante tomo la clase a las 7 am");
    }

    public void presentarTarea(){
        System.out.println("Debo presentar la tarea el dia lunes");
    }

    public void marcarAsistencia(){
        System.out.println("Debo marcar asistencia");
    }

    public void hacerExamen(){
        System.out.println("Hacer el examen de inglés");
    }

}

