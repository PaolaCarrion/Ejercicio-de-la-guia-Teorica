/* 
 Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;


public class LibroServicio {
    public Libro cargarLibro(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Complete los siguientes datos del libro");
        System.out.println("ISBN:");
        int ISBN = leer.nextInt();
        System.out.println("Título:");
        String titulo = leer.next();
        System.out.println("Autor:");
        String autor = leer.next();
        System.out.println("Número de paginas:");
        int numPaginas = leer.nextInt();
        return new Libro(ISBN, titulo, autor, numPaginas);
    }
    public static void mostrarLibro(Libro l1){
        System.out.println("Los datos del libro ingresados son:");
        System.out.println("ISBN: "+l1.getISBN()+"\nTitulo: "+l1.getTitulo()+"\nAutor: "+l1.getAutor()+"\nNúmeros de paginas: "+l1.getNumPaginas());
    }
    
}
