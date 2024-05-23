package Ejercicio3;

class Administrador extends Persona{
    private String departamento;
    private int aniosExperiencia;

    public Administrador(){}

    public Administrador(int id, String Nombre, String Apellidos, int Edad,
                         String departamento, int aniosExperiencia) {
        super(id, Nombre, Apellidos, Edad);
        this.departamento = departamento;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String saludoAdministrador(){
        return "Este texto viene de la clase Administrador";
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre del Administrador: " + nombre + " " + apellidos);
        System.out.println("Id: " + id);
        System.out.println("Edad: " + edad);
        System.out.println("Departamento: " + departamento);
        System.out.println("Años de experiencia: " + aniosExperiencia);
    }

    public void gestionarPersonal(){
        System.out.println("Gestionar al personal docente");
    }

    public void planificarEventos(){
        System.out.println("Planificar eventos del aniversario de la escuela");
    }

    public void administrarPresupuestos(){
        System.out.println("administrar los presuspuestos de los gastos");
    }

    public void marcarAsistencia(){
        System.out.println("Marcar asistencia al salir");
    }
}
