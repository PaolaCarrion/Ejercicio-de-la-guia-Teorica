//Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2
package Entidad;

public class Operacion {

    private double numero1;
    private double numero2;
// Metodo constructor sin los atributos pasados por parámetro

    public Operacion() {
    }
// Método constructor con todos los atributos pasados por parámetro.

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
//Métodos get y set

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Los números ingresados son:{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }


   
    
}
