/* 
 Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package ejercicio1g8;

import Entidad.Libro;
import Servicio.LibroServicio;


public class Ejercicio1G8 {

    
    public static void main(String[] args) {
        LibroServicio ls= new LibroServicio();
        Libro l1 = ls.cargarLibro();
        LibroServicio.mostrarLibro(l1);
        
    }
    
}
