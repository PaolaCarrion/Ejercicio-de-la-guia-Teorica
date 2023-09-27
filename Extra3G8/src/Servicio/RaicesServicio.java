package Servicio;

import Entidad.Raices;
import java.util.Arrays;
import java.util.Scanner;

public class RaicesServicio {

    public Raices crearRaices() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los valores de la ecuacion");
        System.out.println("a:");
        double a = leer.nextDouble();
        System.out.println("b:");
        double b = leer.nextDouble();
        System.out.println("c:");
        double c = leer.nextDouble();
        return new Raices(a, b, c);
    }

    /*
    Método getDiscriminante(): devuelve el valor del discriminante (double). El
    discriminante tiene la siguiente formula: (b^2)-4*a*c
     */
    public double getDiscriminante(Raices r) {
        return (Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC());
    }

    /*
    Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
    que esto ocurra, el discriminante debe ser mayor o igual que 0.
     */
    public boolean tieneRaices(Raices r) {
        return getDiscriminante(r) > 0;
    }

    /*
    Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
    que esto ocurra, el discriminante debe ser igual que 0.
     */
    public boolean tieneRaiz(Raices r) {
        return getDiscriminante(r) == 0;
    }

    /*
    Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
    posibles soluciones.
        (-b±√((b^2)-(4*a*c)))/(2*a) 
     */
    public double[] obtenerRaices(Raices r) {
        if (tieneRaices(r)) {
            double raiz1 = (-r.getB() + Math.sqrt(getDiscriminante(r))) / (2 * r.getA());
            double raiz2 = (-r.getB() - Math.sqrt(getDiscriminante(r))) / (2 * r.getA());
            return new double[]{raiz1, raiz2};
        }
        return new double[]{0, 0};
    }
    /*
    Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
    Es en el caso en que se tenga una única solución posible.
     */
     public double obtenerRaiz(Raices r) {
        if (tieneRaiz(r)) {
            return (-r.getB())/(2 * r.getA());
        }
        return 0;
    }
     /*
     Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
    pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
    obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
    de no existir solución, se mostrará un mensaje.
     */
     public void calcular(Raices r){
         if (tieneRaices(r)) {
             System.out.println("La ecuacione tiene las siguientes soluciones : "+ Arrays.toString(obtenerRaices(r)));   
         } else if (tieneRaiz(r)) {
              System.out.println("La ecuacione tiene la siguiente solucione : "+ obtenerRaiz(r)); 
         }else{
             System.out.println("La ecuacion no tiene soluciones posibles");
         }
             
{
             
         }
     }
     
}
