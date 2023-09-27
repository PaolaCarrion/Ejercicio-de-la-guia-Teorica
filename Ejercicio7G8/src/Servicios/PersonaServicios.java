
package Servicios;

import Entidad.Persona;
import java.util.Scanner;


public class PersonaServicios {
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
  // Metodo para solicitar datos de la persona
    public Persona crearPersona(){
        System.out.println("Complete los siguientes datos de la persona: ");
        System.out.println("Nombre: ");
        String nombre = leer.next();
        System.out.println("Edad: ");
        int edad = leer.nextInt();
        System.out.println("Sexo: 'H' hombre, 'M' mujer, 'O' otro");
        String sexo = leer.next();
        while (!"H".equals(sexo)&& !"M".equals(sexo) && !"O".equals(sexo)) { //Validamos que ingrese el sexo de form a correcta 
            System.out.println("Debe ingresar 'H' hombre, 'M' mujer, 'O' otro");
            sexo = leer.next();
        }
        System.out.println("Peso: ");
        double peso = leer.nextDouble();
        System.out.println("Altura: ");
        double altura = leer.nextDouble();
        
      return new Persona(nombre, edad, sexo, peso, altura); //Instanciamos el objeto persona
    }
    
    /*
    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). 
    */
    public int calcularIMC(Persona p){
        double imc=p.getPeso()/(p.getAltura()*p.getAltura());
        if (imc<20) {
            System.out.println("La persona '" +p.getNombre()+"' esta por debajo de su peso ideal");
            return -1;
        }else if (imc > 20 && imc <= 25){
            System.out.println("La persona '" +p.getNombre()+"' esta en su peso ideal");
            return 0;
        }else{
            System.out.println("La persona '" +p.getNombre()+"' tiene sobre peso");
            return 1;
        }
    }
    //Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
    public boolean esMayorDeEdad(Persona p){
        return p.getEdad() >= 18;
    }
 
}
