/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ejercicio4g8;

import Entidad.Rectangulo;


public class Ejercicio4G8 {

    
    public static void main(String[] args) {
        Rectangulo r1= new Rectangulo();
        r1.crearRectangulo();
        System.out.println("La superficie del rectangulo ingresado es : "+r1.area(r1));
        System.out.println("El primetro del rectangulo ingresado es : "+r1.perimetro(r1));
        r1.representacion(r1);
    }
    
}
