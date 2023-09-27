
package Servicio;

import Entidad.Adivinanza;
import java.util.Scanner;

public class AdivinanzaServicio {
    Scanner leer = new Scanner(System.in);
    
   public void Adivinzar(Adivinanza a){
       System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
       String mes = leer.next();
       while (!a.getMesSecreto().equals(mes)) {
           System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes");
           mes = leer.next();
       }
       System.out.println("¡Ha acertado!");
   }
}
