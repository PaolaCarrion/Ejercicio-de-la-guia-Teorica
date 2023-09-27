/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario.
 */
package extra06g8;

import Servicio.AhorcadoServicio;
import java.util.Scanner;

public class Extra06G8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        AhorcadoServicio as = new AhorcadoServicio();
        as.juego();
    }

}
