/*
 Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package ejercicio7g8;

import Entidad.Persona;
import Servicios.PersonaServicios;

public class Ejercicio7G8 {

    public static void main(String[] args) {
        PersonaServicios ps = new PersonaServicios();
        Persona p1 = ps.crearPersona();
        Persona p2 = ps.crearPersona();
        Persona p3 = ps.crearPersona();
        Persona p4 = ps.crearPersona();
        int[] resIMC = new int [4];
        resIMC[0] = ps.calcularIMC(p1);
        resIMC[1]= ps.calcularIMC(p2);
        resIMC[2]= ps.calcularIMC(p3);
        resIMC[3] = ps.calcularIMC(p4);
        int bPeso =0, iPeso=0, aPeso=0;
        for (int i = 0; i < 4; i++) {
            switch (resIMC[i]) {
                case -1:
                    bPeso += 1;
                    break;
                case 0:
                    iPeso += 1;
                    break;
                case 1:
                    aPeso += 1;
                    break;
            }

        }
        boolean []resMayor = new boolean [4];
        resMayor[0]=ps.esMayorDeEdad(p1);
        resMayor[1]=ps.esMayorDeEdad(p2);
        resMayor[2]=ps.esMayorDeEdad(p3);
        resMayor[3]=ps.esMayorDeEdad(p4);
        int mayores=0, menores=0;
        for (int i = 0; i < 4; i++) {
            if (resMayor[i]) {
                mayores+=1;
            }else{
                menores+=1;
            }
        }
        System.out.println("El porcentaje de persona con : \nbajo peso es : "+ (bPeso*100)/4+"%\npeso ideal es : "+(iPeso*100)/4+"%\n"+
                "sobre peso es : "+ (100*aPeso)/4+"%");
        System.out.println("El porcentaje de personas mayores de edad es : "+(mayores*100)/4+"%\n"+
                "El peorcentaje de personas menores de edad es : "+(menores*100)/4);
     
    }

}
