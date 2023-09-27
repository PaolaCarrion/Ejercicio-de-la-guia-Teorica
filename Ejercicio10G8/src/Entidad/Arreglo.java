package Entidad;

import java.util.Arrays;

public class Arreglo {

    private double arregloA;
    private double arregloB;

    public Arreglo() {
    }

    public Arreglo(double arregloA, double arregloB) {
        this.arregloA = arregloA;
        this.arregloB = arregloB;
    }
    
    public static double[] inicializarArreglo(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Math.random() * 10;
        }
        return arreglo;
    }
     public void imprimirArreglo(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i] + " ");
        }
        System.out.println();
    }
     public void ordenarArreglo(double[] arreglo) {
        Arrays.sort(arreglo);
    }
   
}
