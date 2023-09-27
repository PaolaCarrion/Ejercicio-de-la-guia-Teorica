
package Entidad;

import java.util.Scanner;


public class Cuenta {
   // que debe tener como mínimo los atributos: numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). 
    private int numeroCuenta;
    private long DNI;
    private int saldoActual;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNI, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    //Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public Cuenta crearCuenta(){
        System.out.println("Ingrese los siguientes datos :");
        System.out.println("Numero de cuenta: ");
        numeroCuenta= leer.nextInt();
        System.out.println("DNI: ");
        DNI=leer.nextLong();
        System.out.println("Saldo actual: ");
        saldoActual=leer.nextInt();
        return new Cuenta(numeroCuenta, DNI, saldoActual);
    }
    
    //Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar y se la sumara a saldo actual.
    public double ingresar(Cuenta c){
        System.out.println("Ingrese la cantidad de dinero que desea sumar a la cuenta");
        int ingreso = leer.nextInt();
        this.saldoActual=this.saldoActual+ ingreso;
        return saldoActual;
    }
    
    /* Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la restará al saldo actual. 
    Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el saldo actual en 0 */
    public double retiro (Cuenta c){
        System.out.println("Ingrese la cantidad de dinero que desea retirar de la cuenta");
        double retiro = leer.nextDouble();
        if (retiro>c.getSaldoActual()) {
            c.setSaldoActual(0);
        }else {
            c.setSaldoActual(saldoActual-(int)retiro);
        }
        return c.getSaldoActual();
    }
    
    // Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%
    public void extraccionRapida(Cuenta c) {
        System.out.println("Ingrese la cantidad que desea sacar de su cuenta ");
        double retiro = leer.nextDouble();
        while (c.getSaldoActual() * 0.20 <= retiro) {
            System.out.println("No puede realizar una extraccion rapida y sacar mas del 20% de su saldo");
            System.out.println("Ingrese nuevamente el valor que desea retirar");
            retiro=leer.nextDouble();
        }
        c.setSaldoActual(saldoActual-(int)retiro);
    }
    //Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public int consultarSaldo(Cuenta c){
        return c.getSaldoActual();
    }
    
    //Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    
    public String consultarDatos(Cuenta c){
        return "Cuenta n° "+numeroCuenta+" \n DNI: "+DNI+ "\n Saldo actual: "+saldoActual;
    }
    
}
