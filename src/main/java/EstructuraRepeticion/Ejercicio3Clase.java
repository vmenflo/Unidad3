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
public class Ejercicio3Clase {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int sumatoria = 0;
        int numeroIteracion;
        int resto;
        int numero;
        int i;
        int media;
        System.out.println("¿Cuantas iteraciones quieres?");
        numeroIteracion = teclado.nextInt();
        for (i = 1; i <= numeroIteracion; i++) {

            System.out.println("Introduce un número");
            numero = teclado.nextInt();
            resto = numero % 2;

            if (resto == 0) {
                System.out.println("El numero es par");
            } else {
                System.out.println("El numero es impar");
            }

            sumatoria += numero;

        }
        media = sumatoria / numeroIteracion;

        System.out.println("La suma total es : " + sumatoria + ". La media"
                + " es : " + media);
    }
}
