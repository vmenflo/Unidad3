/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructuraSeleccion;

import javax.swing.JOptionPane;

/**
 *
 * @author victor
 */
public class Ej04Seleccion {
    
    public static void main(String[] args) {
        
        // Le pido la edad
        int edad = Integer.parseInt(JOptionPane.showInputDialog(
                "Introduce tu edad"));
        
        // Ternario para determinar si es mayor o no
        String resultado = (edad>=18) ? 
                "Eres mayor de edad" : "Eres menor de edad";
        
        // Realizo el texto que quiero mostrar
        String texto = """
                       %s
                       Tu edad es: %d
                       
                       """.formatted(resultado,edad);
        
        // Mostrar con JOptionPane
        JOptionPane.showMessageDialog(null, texto);
    }
    
}
