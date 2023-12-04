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
 * Una persona compra un coche por un precio X y lo va a pagar en N meses.
 * Realiza el cuadro de pagos suponiendo que cada mes paga la mitad de lo que
 * quede por pagar, excepto el último mes del préstamo que paga el resto que
 * quede.
 */
public class EjercicioClase5 {

    public static void main(String[] args) {

        double precioCoche;
        int nMeses;
        final int DOS = 2;

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuánto cuesta el coche?");
        precioCoche = teclado.nextDouble();

        System.out.println("¿Cuántos son los plazos?");
        nMeses = teclado.nextInt();

        for (int i = 1; i < nMeses; i++) {

            precioCoche = precioCoche / DOS;
            System.out.println("--------------------------------------");
            System.out.println("En el mes " + i + " El pago es "
                    + precioCoche + " €");

        }
        System.out.println("--------------------------------------");
        System.out.println("El ultimo pago es: " + precioCoche);

    }

}
