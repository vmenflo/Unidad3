/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructuraRepeticion;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Ejercicio2Clase {
    
    public static void main(String[] args) {
        
        int sumatoria = 0;
        int numero;
        
        Scanner teclado = new Scanner (System.in);
        
        // Bucle
        do {
            
            System.out.println("Inserte un número para sumar : ");
            numero = teclado.nextInt();
            sumatoria += numero;
            
        
        } while (numero != 0);
        
        System.out.println(sumatoria);
        
    }
    
}
