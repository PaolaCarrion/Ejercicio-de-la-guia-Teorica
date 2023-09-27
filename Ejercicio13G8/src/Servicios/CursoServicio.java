
package Servicios;

import Entidad.Curso;
import java.util.Scanner;

public class CursoServicio {
    
    //En este metodo cargamos los nombres de los alumnos  
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public String [] cargarAlumnos(){
        String[] nombres = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno n° "+(i+1));
             nombres[i]=leer.next();
        }
        return nombres;
    }
    /*
    Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
    */
    public Curso crearCurso(){
     
        System.out.println("Complete los siguientes datos del curso: \n"
                + "Nombre del curso: ");
        String nombreCurso = leer.next();
        System.out.println("Cantidad de horas por dia: ");
        int cantidadHorasPorDia = leer.nextInt();
        System.out.println("Cantidad de dias por semana: ");
        int cantidadDeDiasPorSemana = leer.nextInt();
        System.out.println("Turno (debe ingresar 'M' para indicar el turno mañana o  'T' para indicar el turno tarde): ");
        String turno = leer.next();
        turno = turno.toUpperCase();
        while (!turno.equals("M")&& !turno.equals("T")) {
            System.out.println("Turno ingresado no valido, ingreselo nuevamente");
            turno = leer.next();
        }
        System.out.println("Precio por hora: ");
        double precioPorHora = leer.nextDouble();
        System.out.println("A continuacion ingrese los alumnos que componen el curso");
        String [] alumnos = cargarAlumnos();
        return new Curso(nombreCurso ,cantidadHorasPorDia, cantidadDeDiasPorSemana , turno,precioPorHora,alumnos);
    }
    /*
     Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
    */
    public double calcularGananciaSemanal(Curso c){
        double ganancia=(c.getCantidadHorasPorDia()*c.getPrecioPorHora()*c.getCantidadDiasPorSemana()*5);
        return ganancia;
    }
}
