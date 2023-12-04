/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructuraRepeticion;

import javax.swing.JOptionPane;

/**
 *
 * @author victor
 */
public class EstructuraRepeticion {
    
    // Todos los bucles tienen tres partes
    // 1 - Inicializacion de la variable de control
    // 2 - Condición (usando la variable de control)
    // 3 - Actualización de la variable de control
    
    // En Java hay 3 bucles, que sirven para repetir una serie de instrucciones 
    // mientras la condición sea verdadera
    
    // Bucle while
    
    // Bucle do-while
    
    // Bucle for
    
    public static void main(String[] args) {
        
        // BUCLE WHILE
        int edad = 45; // Inicializacion de la variable de control
        while (edad<=50) { // Condicion del bucle. Si es true se ejecuta otra vez
            System.out.println("Tu edad es: " + edad);
            edad++; // Actualizacion de la variable de control
        }
        System.out.println("Fuera del bucle while");
        
        
        // Bucle que se ejecuta siempre
        
        //while (edad<100) {
        //    System.out.println("Bucle infinito");
       // }

        // BUCLE DO-WHILE
        // Ejecuta entre una y n veces
        String nombre;
        do{
            nombre = JOptionPane.showInputDialog("Escribe el nombre ");
            System.out.println("Nombre: " + nombre);
        }while(nombre.equalsIgnoreCase("Julia"));
        
        //BUCLE FOR, se usa cuando se sabe el numero de iteraciones a realizar
        
        // imprime de 0 a 100 por consola
        
        int numero = 0;
        
        while (numero<=100){
            System.out.println(numero);
            numero++;
        }
        // Los dos bucles expresarán lo mismo
        for (int numero2 = 0; numero2<=100; numero2++){
            System.out.println(numero2);
        }
        
        // Contar de 100 a 0
        
        for (int numero3=100; numero3>=0; numero3--){
            System.out.println(numero3);
        }
    }
    
}
