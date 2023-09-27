
package Entidad;

import java.util.Scanner;




public class Circunferencia {
    private double radio;
    public double area;
    public double perimetro;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }
  public Circunferencia(double radio, double area, double perimetro) {
        this.radio = radio;
        this.area = area;
        this.perimetro = perimetro;
    }
    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    //Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto

      public Circunferencia crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio de la circunferencia");
        radio = leer.nextDouble();
        return new Circunferencia(radio);
    }
    
    //Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
     public void area() {
        area=Math.PI * Math.pow(radio, 2);
    }
     // Método para calcular el perímetro de la circunferencia
    public void perimetro() {
        perimetro= 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
    
   

    
}
