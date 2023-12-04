/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructuraSeleccion;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Ej05Seleccion {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular "
                    + "el área de un cuadrado...");
        } else if (opcion == 2) {
            System.out.println("Ha seleccionado calcular "
                    + "el área de un Triángulo...");
        } else if (opcion == 3) {
            System.out.println("Ha seleccionado calcular "
                    + "el área de un Círculo...");
        } else if (opcion == 4) {
            System.out.println("Ha seleccionado Finalizar...");
        }

    }

}
