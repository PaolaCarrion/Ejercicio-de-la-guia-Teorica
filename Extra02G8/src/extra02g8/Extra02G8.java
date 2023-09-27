/*
 Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. 
 */
package extra02g8;

import Entidad.Puntos;
import Servicio.PuntosServicio;

public class Extra02G8 {

    
    public static void main(String[] args) {
        PuntosServicio ps = new PuntosServicio();
        Puntos p1 = ps.crearPuntos();
        System.out.println(p1.toString());
        System.out.println("La diferencia entre los puntos ingesados es : "+ps.calcularDistancia(p1));
        
    }
    
}
