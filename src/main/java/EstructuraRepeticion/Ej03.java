/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructuraRepeticion;

/**
 *
 * @author victor
 * 
 * Realizar un programa que imprima 25 términos de la serie 15 - 30 - 60 - 120,
 * etc. No se introducen valores por teclado.
 */


public class Ej03 {
    public static void main(String[] args) {
        
        int numero = 15;
        
        for(int contador = 1; contador<25 ; contador++){
            
            System.out.print(+ numero + " - ");
            numero = numero*2;
        }
    }
}
