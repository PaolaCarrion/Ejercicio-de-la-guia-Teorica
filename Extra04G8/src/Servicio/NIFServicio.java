/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author paola
 */
public class NIFServicio {
    Scanner leer = new Scanner(System.in);
    /*
    Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
    corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
    resultado del calculo.
    */
    public long crearNif(){
        NIF n1 = new NIF();
        System.out.println("Ingrese el número de DNI: ");
        long dni = leer.nextInt();
        
        return dni;
    }
    /*
    La letra correspondiente al dígito verificador se calculará a traves de un método que
    funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
    número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
    buscar en un array (vector) de caracteres la posición que corresponda al resto de la
    división para obtener la letra correspondiente.
    */
   /*public String [] vectorLetras(){
       String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
       String[] vCaracteres = new String [23];
       for (int i = 0; i < 23; i++) {
           vCaracteres[i]= caracteres.substring(i, i+1);
       }
       return vCaracteres;
   }*/
    public void calcularLetra(NIF n) {
        String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        String[] vCaracteres = new String[23];
        for (int i = 0; i < 23; i++) {
            vCaracteres[i] = caracteres.substring(i, i + 1);
        }
        int resto = (int) (n.getDni() % 23);
        for (int i = 0; i < 23; i++) {
            if (resto == i) {
                n.setLetra(vCaracteres[i]);
            }
        } 
    }
    /*
    Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
    en mayúscula; por ejemplo: 00395469-F)
    */
    public String mostrar(NIF n){
        return n.getDni()+"-"+n.getLetra();
    }
}
