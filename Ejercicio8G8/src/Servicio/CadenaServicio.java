
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;


public class CadenaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Cadena crearCadena(){
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        int longitud= frase.length();
      return new Cadena(frase, longitud);
    }
    //Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    public int mostrarVocales(Cadena c){
        int cantVocales=0;
        String frase=c.getFrase();
        int longitud = c.getLongitud();
        for (int i = 0; i < longitud; i++) {
            String letra = frase.substring(i, i+1);
            if ((letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) ) {
                cantVocales+=1;
            }
        }
        return cantVocales;
    }
    
    //Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public String invertirFrase(Cadena c){
        String fraseInvert="";
        String frase=c.getFrase();
        int longitud = c.getLongitud();
        for (int i = longitud-1; i >=0; i--) {
            fraseInvert+=frase.substring(i, i+1);
        }
        return fraseInvert;
    }
    
    /* Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.*/
    
    public String vecesRepetido(Cadena c){
        System.out.println("Ingrese la letra que desea contabilizar");
        String letra= leer.next();
        int cantLetra=0;
        for (int i = 0; i < c.getLongitud(); i++) {
            if (c.getFrase().substring(i, i+1).equals(letra)) {
               cantLetra+=1; 
            }
        }
        return("La letra "+letra+" se encuentra repetida "+cantLetra+" veces.");
    }
    
    /*Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.*/
    
    public String compararLongitud(Cadena c) {
        System.out.println("Ingrese la frase que desea comparar");
        String frase2 = leer.next();
        if (c.getFrase().length() == frase2.length()) {
            return ("Ambas frases tienen la misma cantidad de caracteres");

        } else {
            return ("Las frase no tienen la misma cantidad de caraccteres");
        }
    }

    /*Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.*/
    public String unirFrases(Cadena c) {
        System.out.println("Ingrese la frase que desea unir");
        String frase2 = leer.next();
        return c.getFrase() + frase2;
    }
/* Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.*/
    
    public String reemplazar(Cadena c){
         String fraseRes = "";
        System.out.println("Ingrese el caracter por el cual desea reemplazar las letras 'a'");
        String caracter=leer.next();
        for (int i = 0; i < c.getLongitud()-1; i++) {
            String letra = c.getFrase().substring(i,i+1);
            if (letra.equals("a")) {
                letra=caracter;
            }
           fraseRes+=letra;
        }
       return fraseRes; 
    }
    //Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    public String contiene(Cadena c){
        System.out.println("Ingrese la letra que desea comprobar si la frase la contiene");
        String letra = leer.next();
        boolean validacion=false;
        int cont =0;
        for (int i = 0; i < c.getLongitud()-1; i++) {
            if (c.getFrase().substring(i,i+1).equals(letra)&& cont<1) {
                cont=1; 
                validacion =true;
            }
        }
        
        return ("La frase con tiene la letra '"+letra+"' ? "+validacion);
    }
    
}
