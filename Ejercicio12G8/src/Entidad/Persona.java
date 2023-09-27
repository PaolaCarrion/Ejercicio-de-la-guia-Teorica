
package Entidad;

import java.util.Date;
import java.util.Scanner;

public class Persona {

    private String nombre;
    private Date fechaDeNacimiento;
    public Persona() {
    }

    public Persona(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaDeNacimiento=" + fechaDeNacimiento + '}';
    }
    


    //Crear persona pidiendole al usuario nombre y edad
    public Persona crearPersona(){
        System.out.println("Complete los siguientes datos: ");
        System.out.println("Nombre:");
        nombre = leer.next();
        System.out.println("Ingrese la fecha de nacimiento");
        System.out.println("Dia:");
        int dia = leer.nextInt();
        System.out.println("Mes:");
        int mes = leer.nextInt();
        System.out.println("Año:");
        int anio = leer.nextInt();
        fechaDeNacimiento = new Date(anio - 1900, mes - 1, dia);
        return new Persona(nombre, fechaDeNacimiento);
    }
    //Calcular la edad con la persona

    public int calcularEdad(Persona per) {
        Date fechaActual = new Date();
        int edad = (fechaActual.getYear() - per.fechaDeNacimiento.getYear());
        if (fechaActual.getMonth() == per.fechaDeNacimiento.getMonth()) {
            if (fechaActual.getDay() < per.fechaDeNacimiento.getDay()) {
                return edad - 1;
            } else {
                return edad;
            }
        } else if (fechaActual.getMonth() < per.fechaDeNacimiento.getMonth()) {
            return edad - 1;
        } else {
            return edad;
        }
    }
    /*
    Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
     */
    public boolean menorQue(int edad) {
        System.out.println("Ingrese la edad con la que desea comparar");
        int edadIngresada= leer.nextInt();
        return edad<edadIngresada;
}
    public void mostrarPersona(Persona per){
        System.out.println("Usted ingreso la siguiente persona: \n"
             +"Nombre: "+per.nombre+"\nFecha de nacimiento: "+per.fechaDeNacimiento);
    }

}
