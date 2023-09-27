package Entidad;

import java.util.Scanner;


public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario.
    public Rectangulo crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectángulo");
        base=leer.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        altura=leer.nextDouble();
     return new Rectangulo(base, altura);   
    }

    //método para calcular la superficie del rectángulo 
    public double area(Rectangulo r) {
        return r.getBase() * r.getAltura();
    }

    //método para calcular el perímetro del rectángulo
    public double perimetro(Rectangulo r){
        return (r.getBase()+r.getAltura())*2;
    }
    
    //método que dibujará el rectángulo mediante asteriscos usando la base y la altura
    public String representacion(Rectangulo r) {
        for (int i = 1; i <= r.getAltura(); i++) {
            for (int j = 1; j <= r.getBase(); j++) {
                if (i == 1 || i == r.getAltura()|| j==1 || j==r.getBase()) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        return "";
    }
}


