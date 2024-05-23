package Ejercicio3;

import java.util.Scanner;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Escoja la opcion:");
        System.out.println("1. Crear Profesor");
        System.out.println("2. Crear Estudiante");
        System.out.println("3. Crear Administrador");

        int opcion = Scanner.nextInt();

        if (opcion == 1){
            System.out.println("Ingrese el Id del profesor: ");
            int id = Scanner.nextInt();
            Scanner.nextLine();
            System.out.println("Ingrese el nombre del profesor: ");
            String nombre = Scanner.nextLine();
            System.out.println("Escriba los apellidos del profesor: ");
            String apellido = Scanner.nextLine();
            System.out.println("Ingrese la edad: ");
            int edad = Scanner.nextInt();
            Scanner.nextLine();
            System.out.println("Escriba el nombre de la materia");
            String materia = Scanner.nextLine();
            System.out.println("Especialidad");
            String especialidad = Scanner.nextLine();
            System.out.println("Años de experiencia");
            int aniosExperiencia = Scanner.nextInt();
            Scanner.nextLine();
            Profesor profesor = new Profesor(id, nombre, apellido, edad, materia, especialidad, aniosExperiencia);
            profesor.mostrarInformacion();
        }

        else if (opcion == 2){
            System.out.println("Ingrese el Id: ");
            int id = Scanner.nextInt();
            Scanner.nextLine();
            System.out.println("Ingrese el nombre del estudiante: ");
            String nombre = Scanner.nextLine();
            System.out.println("Escriba los apellidos del estudiante: ");
            String apellido = Scanner.nextLine();
            System.out.println("Ingrese la edad: ");
            int edad = Scanner.nextInt();
            Scanner.nextLine();
            System.out.println("Ingrese el grado");
            String grado = Scanner.nextLine();
            System.out.println("Ingrese el promedio");
            double promedio = Scanner.nextDouble();
            Scanner.nextLine();
            Estudiante estudiante = new Estudiante(id, nombre, apellido, edad, grado, promedio);
            estudiante.mostrarInformacion();
        }

        else if (opcion == 3){
            System.out.println("Ingrese el Id: ");
            int id = Scanner.nextInt();
            Scanner.nextLine();
            System.out.println("Ingrese el nombre del administrador: ");
            String nombre = Scanner.nextLine();
            System.out.println("Escriba los apellidos del administrador: ");
            String apellido = Scanner.nextLine();
            System.out.println("Ingrese la edad: ");
            int edad = Scanner.nextInt();
            Scanner.nextLine();
            System.out.println("Departamento");
            String departamento = Scanner.nextLine();
            System.out.println("Años de experiencia");
            int aniosExperiencia = Scanner.nextInt();
            Scanner.nextLine();
            Administrador administrador = new Administrador(id, nombre, apellido, edad, departamento, aniosExperiencia);
            administrador.mostrarInformacion();
        }
    }
}
