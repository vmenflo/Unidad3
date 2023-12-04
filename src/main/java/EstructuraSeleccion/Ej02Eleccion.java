/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructuraSeleccion;

import javax.swing.JOptionPane;

/**
 *
 * @author victor
 *
 * 2.- Utilizando el operador ternario ?: de Java, implementa las siguientes
 * sentencias: Si el número “x” es mayor o igual que 135 se devolverá “mayor”,
 * si es menor se devolverá “menor”. Las cadenas que se devuelven se guardarán
 * en una variable llamada resultado. Si el número “x” es menor o igual que cero
 * se imprimirá en pantalla “Menor que cero”, si no se imprimirá “Mayor que
 * cero”. Guardar el valor absoluto de un número entero en una variable entera
 * (sin usar la función Math.abs())
 *
 */
public class Ej02Eleccion {

    public static void main(String[] args) {

        int x;

        x = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero entero"));

        // Para guardar si es mayor o menor a 135 el numero
        String resultado = (x >= 135) ? "mayor que 135" : "menor que 135";

        System.out.println("El resultado es: " + resultado);

        // Guardar si es menor que cero o mayor que cero
        String resultado2 = (x <= 0) ? "Menor que cero" : "Mayor que cero";

        System.out.println("El resultado es: " + resultado2);

        int resultado3 = (x < 0) ? -x : x;

        System.out.println("El valor absoluto es: " + resultado3);

    }

}
