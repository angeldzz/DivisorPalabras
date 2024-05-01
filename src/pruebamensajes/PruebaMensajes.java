/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebamensajes;

/**
 *
 * @author pinto
 */
public class PruebaMensajes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensaje = "Hello World!";
        for (int i = 0; i < mensaje.length(); i++) {
           System.out.println(mensaje.substring(i, i+1)); 
        }
    }
    
}
