/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructuraSeleccion;

/**
 *
 * @author victor
 */
public class Ej08 {

    public static void main(String args[]) {

        char departamento = 'B'; // Al declarar que departamento es B, imprimirá Recursos Humanos

        switch (departamento) {
            case 'A':
                System.out.println("Desarrollo");
                break;
            case 'B':
                System.out.println("Recursos Humanos");
                break;
            case 'C':
                System.out.println("Finanzas");
                break;
            case 'D':
                System.out.println("RRHH");
            default:
                System.out.println("Departamento no válido");
        }

        System.out.println("Código para el departamento es " + departamento);

        switch (departamento) {
            case 'A' -> {// Código case A, Sin BREAK
                System.out.println("Desarrollo");
            }
            case 'B' -> {
                System.out.println("RRHH");
            
            }

            default -> {
            //Código default
            }
        }

    }
}

