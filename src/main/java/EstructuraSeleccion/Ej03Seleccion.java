/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructuraSeleccion;

/**
 *
 * @author victor boolean unaCondicion = true; resultado = unaCondicion ? valor1
 * : valor2; int x = 10; int y = (x > 9) ? 100 : 200;
 *
 * int publico = 19500; int vendidas = 19000; int aforo = 2000; String status =
 * (publico  *
 */
// aforo) ? "Cabe mas gente": (vendidas < aforo) ? "Aun no hemos vendido todo" : "Esta todo vendido";
public class Ej03Seleccion {

    public static void main(String[] args) {

        //APARTADO A
        boolean unaCondicion = true;
        String resultado = unaCondicion ? "Esta condicion es verdad" : "Esta condicion es mentira";

        System.out.println(resultado);

        //APARTADO B
        int x = 10;
        int y = (x > 9) ? 100 : 200;

        System.out.println("Si el numero es " + x + " entonces y vale " + y);

        //APARTADO C
        int publico = 19500;
        int vendidas = 19000;
        int aforo = 2000;

        String estado = (publico < aforo)
                ? "Cabe mas gente"
                : (vendidas < aforo) ? "Aun no hemos vendido todo" : "Esta todo vendido";
        
        System.out.println("El numero de entradas vendidas es " 
                + vendidas + ". El aforo es de " + aforo + ". " + estado);

    }
}
