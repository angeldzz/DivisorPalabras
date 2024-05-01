/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebamensajes;

import java.util.Scanner;

/**
 *
 * @author pinto
 */
public class PruebaMensajes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner preg = new Scanner(System.in);
        System.out.println("Introduzca su frase:");
        String mensaje = preg.nextLine();
        if (mensaje.length()>=400) {
            System.out.println("Su mensaje es demasiado largo");
        }else{
        for (int i = 0; i < mensaje.length(); i++) {
           System.out.println(mensaje.substring(i, i+1));
        }
        }
    }
    
}
