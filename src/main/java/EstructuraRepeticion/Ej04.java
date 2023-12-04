/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructuraRepeticion;

/**
 *
 * @author victor
 * 
 * 
 */
public class Ej04 {
    
    public static void main(String[] args) {
          int numero = 1;
         // Hará una cuenta del 1 al 10
          while (numero < 11)
          {
               System.out.println("Número: " + numero);
               numero++;
          }
          
          // Harà una cuenta atrás del 10 hasta 2
          do {
               System.out.println("Número: " + --numero);
          } while(numero > 1);
   	  }
}
