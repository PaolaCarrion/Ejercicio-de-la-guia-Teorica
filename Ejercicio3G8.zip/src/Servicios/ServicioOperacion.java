
package Servicios;

import Entidad.Operacion;
import java.util.Scanner;

public class ServicioOperacion {

    // Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
    public Operacion crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        double numero1 = leer.nextDouble();
        System.out.println("Ingrese el segundo número");
        double numero2 = leer.nextDouble();
        return new Operacion(numero1, numero2);
    }
    //Método sumar(): calcular la suma de los números y devolver el resultado al main.

    public double sumar(Operacion o) {
        return o.getNumero1() + o.getNumero2();
    }
    // Método restar(): calcular la resta de los números y devolver el resultado al main

    public double restar(Operacion o) {
        return o.getNumero1() - o.getNumero2();
    }
    //Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
//fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
//Si no, se hace la multiplicación y se devuelve el resultado al main

    public double multiplicar(Operacion o) {
        if (o.getNumero2() == 0) {
            System.out.println("No se puede multiplicar por cero");
            return 0;
        } else{
        return o.getNumero1() * o.getNumero2();
        }
    }
    //h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
//una división por cero, el método devuelve 0 y se le informa al usuario el error se le
//informa al usuario. Si no, se hace la división y se devuelve el resultado al main.*/
    public double dividir(Operacion o){
        if (o.getNumero2()==0){
            System.out.println("No se puede divir entre cero");
            return 0;
        }else{
            return o.getNumero1()/o.getNumero2();
        }
    }

}
