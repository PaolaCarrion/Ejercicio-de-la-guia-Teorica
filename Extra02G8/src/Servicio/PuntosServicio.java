
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

public class PuntosServicio {
    Scanner leer = new Scanner(System.in);
    /*
    método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto
    */
    public Puntos crearPuntos(){
        System.out.println("Ingrese las coordenadas del primer punto:");
        System.out.println("X :");
        int x1 = leer.nextInt();
        System.out.println("Y :");
        int y1 = leer.nextInt();
        System.out.println("Ingrese las coordenadas del segundo punto:");
        System.out.println("X :");
        int x2 = leer.nextInt();
        System.out.println("Y :");
        int y2 = leer.nextInt();
        return new Puntos(x1, y1, x2, y2);
    }
    
    public double calcularDistancia(Puntos p){
        int diferenciaX =p.getX2() - p.getX1();
        int diferenciaY =p.getY2() - p.getY1();
        double distancia= Math.sqrt(Math.pow(diferenciaX, 2)+Math.pow(diferenciaY, 2));
        distancia = Math.abs(distancia);
        return distancia;
        
    }
}
