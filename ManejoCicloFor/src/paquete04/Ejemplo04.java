/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.Scanner;
import paquete01.*;

/**
 *
 * @author reroes
 */
public class Ejemplo04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
        int maximot;
        int numeroTablas;
        
        System.out.println("Ingrese el numero de tablas");
        numeroTablas = entrada.nextInt();
        System.out.println("Ingrese el maximo de la tabla");
        maximot = entrada.nextInt();
        
        int numero1 = 1;
        while (numero1 <= numeroTablas) {
            int numero2 = 1;
           while (numero2 <= maximot);{
           System.out.println(numero1 + "x" + numero2 + "=" + (numero1 * numero2));
           numero2++;
           }

            System.out.println("_____________");
            numero1++;
        }
      
    }
    
}
