package Servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoServicio {

    Ahorcado a = new Ahorcado();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /*
    Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
    Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
    vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
    de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
    máximas, el valor que ingresó el usuario y encontradas en 0
     */
    public void crearJuego() {
        System.out.println("Ingrese una palabra");
        String palabra = leer.next();
        System.out.println("Ingrese cantidad de jugadas maximas");
        int cantJugadas = leer.nextInt();
        String[] vPalabra = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            vPalabra[i] = palabra.substring(i, i + 1);
        }
        a.setJugadasMax(cantJugadas);
        a.setPalabra(vPalabra);
        a.setLetrasEncontradas(0);

    }

    //Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
    public int longitud() {
        return a.getPalabra().length;
    }

    /*
    Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
    letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
     */
    public void buscar(String l) {
        int cont = 0;
        System.out.println(l);
        for (int i = 0; i < a.getPalabra().length; i++) {
            if (a.getPalabra()[i].equals(l) && cont == 0) {
                cont = 1;
            }
        }
        if (cont >= 1) {
            System.out.println("Mensaje: La letra pertenece a la palabra");
        } else {
            System.out.println("Mensaje: La letra no pertenece a la palabra");
        }
    }

    /*
     Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
    cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
    devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
    busque una letra que no esté, se le restará uno a sus oportunidades. 
     */
    public boolean encontradas(String l) {
        boolean verificacion = false;
        for (int i = 0; i < a.getPalabra().length; i++) {
            if (a.getPalabra()[i].equals(l)) {
                a.setLetrasEncontradas(a.getLetrasEncontradas() + 1);
                verificacion = true;
            }
        }
        return verificacion;
    }

    //Método intentos(): para mostrar cuantas oportunidades le queda al jugador
    public int intentos() {
        return a.getJugadasMax();
    }

    /*
    Método juego(): el método juego se encargará de llamar todos los métodos
    previamente mencionados e informará cuando el usuario descubra toda la palabra o
    se quede sin intentos. Este método se llamará en el main. 
     */
    public void juego() {
        crearJuego();
        System.out.println("Longitud de la palabra: " + longitud());
        while (a.getJugadasMax() > 0) {
            System.out.println("Ingrese una letra: ");
            String letra = leer.next();
            buscar(letra);
            if (encontradas(letra) == false) {
                a.setJugadasMax(a.getJugadasMax() - 1);
            }
            System.out.println("Número de letras (encontradas, faltantes): (" + a.getLetrasEncontradas() + "),(" + (longitud() - a.getLetrasEncontradas()) + ")");
            System.out.println("Número de oportunidades restantes: " + a.getJugadasMax());
            System.out.println("");
            if (a.getLetrasEncontradas() == longitud()) {
                System.out.println("Ganaste! La palabra secreta es : '" + Arrays.toString(a.getPalabra()) + "'");
                break;
            }
        }
        if (a.getJugadasMax() == 0) {
            System.out.println("Mensaje: Lo sentimos, no hay más oportunidades");
        }
    }
}
