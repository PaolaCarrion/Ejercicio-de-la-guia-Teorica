/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
*/
package ejercicio11g8;


import java.util.Scanner;
import java.util.Date;

public class Ejercicio11G8 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el dia:");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año:");
        int anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        Date fechaActual = new Date();
        int diferencia = (fechaActual.getYear() - fecha.getYear());
        System.out.println(fechaActual);
        System.out.println(fecha);
        System.out.println("Entre " +  (fecha.getYear()+1900) + " y el año " + (fechaActual.getYear()+1900) + " han pasado "+ diferencia + " años\n\n");
        
                
    }
    
}
