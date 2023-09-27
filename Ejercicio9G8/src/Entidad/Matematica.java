
package Entidad;

public class Matematica {
    private double num1;
    private double num2;

    public Matematica() {
    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Los números generados por el sistema son:{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    //Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    public double devolverMayor(){
        return Math.max(num1, num2);
    }
    //Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
    public double calcularPotencia(){
        num1= Math.round(num1);
        num2=Math.round(num2);
        if (num1>num2) {
            System.out.println("La potencia de "+num1+" elevado al "+num2+" es: ");
            return Math.pow(num1, num2);
        }else{
            System.out.println("La potencia de "+num2+" elevado al "+num1+" es: ");
            return Math.pow(num2, num1);
        }
    }
    //Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    //Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    public double calcularRaiz(){
          if (num1<num2) {
              num1=Math.abs(num1);
            return Math.sqrt(num1);
        }else{
              num2=Math.abs(num2);
            return Math.sqrt(num2);
        }
    }
}
