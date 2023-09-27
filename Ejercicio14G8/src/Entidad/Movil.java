
package Entidad;

import java.util.Arrays;

public class Movil {
    private String marca;
    private double precio;
    private int [] codigo;

    public Movil() {
    }

    public Movil(String marca, double precio, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Usted ingreso los siguientes datos " + "marca=" + marca + ", precio=" + precio + ", codigo="+ Arrays.toString(codigo);
    }
    }
    
