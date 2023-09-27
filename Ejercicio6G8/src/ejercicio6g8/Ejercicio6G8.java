/*
 Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual

 Métodos getters y setters.
 Método llenarCafetera()
 Método servirTaza(int)
 Método vaciarCafetera()
 Método agregarCafe(int)
 */
package ejercicio6g8;

import Entidad.Cafetera;
import java.util.Scanner;

public class Ejercicio6G8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cafetera c1 = new Cafetera(1000,200);
        c1.Menu(c1);
        
        

    

 }   
}
