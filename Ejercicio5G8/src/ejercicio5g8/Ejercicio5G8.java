/*
 Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ejercicio5g8;

import Entidad.Cuenta;
import java.util.Scanner;


public class Ejercicio5G8 {

       public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cuenta c1 = new Cuenta();
        c1.crearCuenta();
           int opcion;
        
           do {
               System.out.println("Seleccione una opcion del menú:");
               System.out.println("1.Depositar \n2.Retirar\n3.Extraccion rapida\n4.Consultar Saldo\n5.Consultar Datos\n6.Salir");
               opcion = leer.nextInt();
               switch (opcion) {
                   case 1:
                       c1.ingresar(c1);
                       break;
                   case 2:
                       c1.retiro(c1);
                       break;
                   case 3:
                       c1.extraccionRapida(c1);
                       break;
                   case 4:
                       System.out.println("Su saldo actual es "+c1.consultarSaldo(c1));
                       break;
                   case 5:
                       System.out.println(c1.consultarDatos(c1));;
                       break;

               }

           } while (opcion != 6);


        
        
    }
    
}
