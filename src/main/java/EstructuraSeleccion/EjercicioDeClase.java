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
public class EjercicioDeClase {

    public static void main(String[] args) {

         String menu = """
                      
                     ¿Qué desea hacer?
                      
                     A - Averiguar si un numero es par o impar
                     B - Averiguar el mes
                     C - Comprobar una hora válida
                      
                      
                      """;

        String opcionString = JOptionPane.showInputDialog(menu);
        
        //Paso lo que entre en mayusculas
        
        opcionString = opcionString.toUpperCase();
        
        
        // Paso de String a Char (Porque lo pide el enunciado) 
        // y aseguramos de usar la primera letra
        
        char opcion = opcionString.charAt(0);
        
        // Usamos el switch para que el usuario pueda elegir la opcion

        switch (opcion) {

            case 'A':
                int numero = Integer.parseInt(JOptionPane.showInputDialog(
                        "Has elegido la opcion A: Quieres"
                        + "saber si un numero es par o impar. \n"
                        + "Por favor, introduce un número"));
               
                // Usamos un ternario
                String resultado = (numero%2 == 0) ? "Es par" : "Es impar";

                JOptionPane.showMessageDialog(null,
                        "El número que has introducido es " + resultado);
                break;

            case 'B':
                int mes = Integer.parseInt(JOptionPane.showInputDialog(
                        """
                              Has elegido la opcion B, para comprobar un mes. 
                              Introduce un numero del 1 a 12."""));
                switch (mes) {

                    case 1:
                        JOptionPane.showMessageDialog(null,
                                "Corresponde con el mes de Enero");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,
                                "Corresponde con el mes de Febrero");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,
                                "Corresponde con el mes de Marzo");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null,
                                "Corresponde con el mes de Abril");
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null,
                                "Corresponde con el mes de Mayo");
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null,
                                "Corresponde con el mes de Junio");
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null,
                                "Corresponde con el mes de Julio");
                        break;
                    case 8:
                        JOptionPane.showMessageDialog(null,
                                "Corresponde con el mes de Agosto");
                        break;
                    case 9:
                        JOptionPane.showMessageDialog(null,
                                "Corresponde con el mes de Septiembre");
                        break;
                    case 10:
                        JOptionPane.showMessageDialog(null,
                                "Corresponde con el mes de Octubre");
                        break;
                    case 11:
                        JOptionPane.showMessageDialog(null,
                                "Corresponde con el mes de Noviembre");
                        break;
                    case 12:
                        JOptionPane.showMessageDialog(null,
                                "Corresponde con el mes de Diciembre");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,
                                "Ese número no es válido");
                        break;

                }

                break;

            case 'C':
                JOptionPane.showMessageDialog(null,
                        """
                               Has elegido la opcion C. 
                               Por favor, a continuación ...
                                """);
                int hora = Integer.parseInt(JOptionPane.showInputDialog(
                        "Introduce las horas"));
                if (hora >=0&&hora<=23) {
                    
                    int minutos = Integer.parseInt(JOptionPane.showInputDialog(
                            "Introduce las minutos"));
                    if (minutos>=0&&minutos<=59) {
                        
                        int segundos = Integer.parseInt(JOptionPane.showInputDialog(
                                "Introduce las segundos"));
                        if (segundos>=0&&segundos<=59) {
                            

                             JOptionPane.showMessageDialog(null,
                          """
                                        La hora es la siguiente : 
                                        %d : %d : %d
                                """. formatted(
                                             hora, minutos, segundos));

                        }else 
                    JOptionPane.showMessageDialog(null,
                            "Formato erroneo en segundos");
                    } else 
                    JOptionPane.showMessageDialog(null,
                            "Formato erroneo en minutos");
                } else 
                    JOptionPane.showMessageDialog(null,
                            "Formato erroneo en horas");
                
                
                // OPCION A TODO JUNTO
                /**
                 * if (horas >=0&&horas <=23 && 
                 * minutos>=0&&minutos<=59 && 
                 * segundos >=0 && segundos<=59) {
                 *  System.out.println("Es una hora valida");
                 * } else { System.. (no es valida);
                 * }
                 */ 

                break;

        }

    }

    
}
