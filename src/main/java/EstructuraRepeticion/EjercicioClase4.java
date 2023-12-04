/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructuraRepeticion;

import java.util.Scanner;

/**
 *
 * @author victor
 *
 * Un banco establece una contraeña secreta para acceso a sus cajeros. Debe
 * tener cuatro dígitos numéricos (entre 0 y 9) de forma que ninguno se repita y
 * la suma de los digitos intermedios sea par. El programa debe solicitar al
 * usuario tantos pin como sean necesarios hasta encontrar uno válido.
 * 
 */
public class EjercicioClase4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Declaramo las claves para pedirlo
        int clave1, clave2, clave3, clave4;

        do {    //Bucle principal para pedir de nuevo las 4 claves

            System.out.println("Por favor, crea una contraseña"
                    + "que no repita ningun numero, y ademas que la suma de"
                    + "la clave 2 y clave 3 sea par");

            do {    //Bucle para repetir el numero si no esta entre 0 y 9
                System.out.println("Introduce la primera clave");
                clave1 = teclado.nextInt();

            } while (clave1 < 0 || clave1 > 9);

            do {
                System.out.println("Introduce la segunda clave");
                clave2 = teclado.nextInt();

            } while (clave2 < 0 || clave2 > 9);

            do {
                System.out.println("Introduce la tercera clave");
                clave3 = teclado.nextInt();

            } while (clave3 < 0 || clave3 > 9);

            do {
                System.out.println("Introduce la cuarta clave");
                clave4 = teclado.nextInt();

            } while (clave4 < 0 || clave4 > 9);

            // Indicamos en esta condicion que ninguna se repita y además
            // la suma del 2 y 3 sea par
        } while ((clave1 == clave2) || (clave1 == clave3)
                || (clave1 == clave4) || (clave2 == clave3)
                || (clave3 == clave4) || (clave2 == clave4)
                || ((clave2 + clave3) % 2 != 0));

        System.out.println("La clave " + clave1 + clave2 + clave3
                + clave4 + " es valida");

    }

}
