/*
 Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto.
 */
package extra05g8;

import Entidad.Adivinanza;
import Servicio.AdivinanzaServicio;

public class Extra05G8 {

    public static void main(String[] args) {
        AdivinanzaServicio as = new AdivinanzaServicio();
        Adivinanza a1 = new Adivinanza();
        as.Adivinzar(a1);
    }
    
}
