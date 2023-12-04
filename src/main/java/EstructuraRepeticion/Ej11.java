/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructuraRepeticion;

/**
 *
 * @author victor
 * Implementa un programa Java que permita visualizar todas las letras 
 * mayúsculas, desde la 'A' hasta la 'Z', usando un do – while.
 */
public class Ej11 {
    
    public static void main(String[] args) {
        
        char letra = 'A';
        
        do {
            System.out.println(letra);
            letra++;
        }while(letra <= 'Z');
        
    }
    
}
