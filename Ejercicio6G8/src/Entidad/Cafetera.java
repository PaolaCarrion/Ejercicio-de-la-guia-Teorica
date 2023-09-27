
package Entidad;

import java.util.Scanner;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
    }
    Scanner leer = new Scanner(System.in);
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
    public void llenarCafetera(){
        this.cantidadActual=this.capacidadMaxima;
    }
    /* Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza*/
    
    public int servirTaza(){
        System.out.println("Ingrese el tamaño de la taza que desea servir");
        int taza = leer.nextInt();
        if (this.cantidadActual<taza) {
            System.out.println("La cantidad de cafe actual no es suficiente para completar la taza");
            System.out.println("Completo el " +this.cantidadActual*100/taza+ "% de la taza" );
            this.cantidadActual=0;
        }else{
            this.cantidadActual=this.cantidadActual-taza;
        }
        return cantidadActual;
    }
    
    //Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciaCafetera(){
        this.cantidadActual=0;
    }
    //Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
    public int agregarCafe(){
        System.out.println("Ingrese la cantidad de cafe que desea añadir a la cafetera");
        int cafe = leer.nextInt();
        this.cantidadActual=this.cantidadActual+cafe;
        return cantidadActual;
        
    }
    public void Menu(Cafetera c){
        int opcion;
        do {
            System.out.println("Seleccione una opcion del menu \n1.Llenar cafetera\n"
                    + "2.Servir taza\n"
                    + "3.Vaciar cafetera\n"
                    + "4.Agregar cafe\n"
                    + "5.Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                     c.llenarCafetera();
                    System.out.println("Se lleno correctamente la cafetera, la cantidad actual de cafe es : "+this.cantidadActual);
                    break;
                    case 2:
                        c.servirTaza();
                        System.out.println("La cantidad actual de cafe es: "+this.cantidadActual);
                    break;
                    case 3:
                     c.vaciaCafetera();
                    System.out.println("Se vacio correctamente la cafetera, la cantidad actual de cafe es : "+this.cantidadActual);
                    break;
                    case 4:
                     c.agregarCafe();
                    System.out.println("Se agrego correctamente la cafetera, la cantidad actual de cafe es : "+this.cantidadActual);
                    break;
                    case 5:
                        System.out.println("Salio de menú");
                    break;
                default:
                    System.out.println("Debe ingresar una opcion valida");;
            }
            
        } while (opcion!=5);
        
    }
}
