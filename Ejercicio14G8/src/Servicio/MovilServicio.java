
package Servicio;

import Entidad.Movil;
import java.util.Scanner;


public class MovilServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /*
    Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
    */
    public Movil cargarCelular(){
     
        System.out.println("Complete los siguientes datos del celular:");
        System.out.println("Marca: ");
        String marca = leer.next();
        System.out.println("Precio: ");
        double precio = leer.nextDouble();
        System.out.println("Codigo: ");
        int [] codigo = ingresarCodigo();
        
        return new Movil(marca, precio, codigo);
    }
    /*
     Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo 
    */
    public int [] ingresarCodigo(){
        System.out.println("Ingrese el codigo de 7 digitos del cedular ");
        int [] codigo = new int [7];
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el "+(i+1)+"° digito del codigo");
            codigo[i]= leer.nextInt();
        }
        return codigo;
    }
   
  
}
