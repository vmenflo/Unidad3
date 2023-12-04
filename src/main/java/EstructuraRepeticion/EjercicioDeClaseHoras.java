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
public class EjercicioDeClaseHoras {

    public static void main(String[] args) {
        int horas, minutos, segundos;
        int opcion;
        Scanner teclado = new Scanner(System.in);

        do {

            do {
                System.out.println("Inserte numero de horas 0-23");
                horas = teclado.nextInt();
            } while ((horas < 0) || (horas >= 23));

            do {
                System.out.println("Inserte numero de minutos 0-59");
                minutos = teclado.nextInt();
            } while ((minutos < 0) || (minutos >= 59));

            do {
                System.out.println("Inserte numero de segundos 0-59");
                segundos = teclado.nextInt();
            } while ((segundos < 0) || (segundos >= 59));

            System.out.println("La hora es valida "
                    + horas + ":" + minutos + ":" + ":" + segundos);
            System.out.println("""
                               ¿Quieres volver a ejecutarlo?
                               SI - pulsa 1
                               NO - Cualquier numero excepto 1
                               """);
            opcion = teclado.nextInt();
        } while (opcion == 1);

    }

}
