/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructuraSeleccion;

/**
 *
 * @author victor
 */
public class EstructurasSeleccion {
    
    public static void main(String[] args) {
        
        // Cadena de texto
        //Declaracion de variable e inicialización en la misma línea
        
        String nombre = "Víctor";
        
        // Declaracion e inicialización en diferentes líneas
        
        String apellido;
        apellido = " Mena Flores";
        
        System.out.print(nombre);
        System.out.print(apellido);
        System.out.println("");
        
        //De esta forma lo mostramos por pantalla de forma concadenada
        System.out.print(nombre + apellido);
        
        
        // numeros enteros
        
        int edad = 29;
        
        System.out.println("La edad de " + nombre + apellido + " es " + edad);
        
        // numeros decimales
        //Para usar float siempre terminar el numero con una f
        float estatura = 1.87f;
        int estaturaEnCm = 187;
        double peso = 78.4;
        double imc = peso / (estatura * estatura);
        
        System.out.println("Estatatura: " + estatura + " en centimetros (" + estaturaEnCm + ")" 
                + ". Su peso es: " + peso );
        
        // Text block
        //Permiten formatear texto en variables de líneas. hay que poner 3 comillas
        
        System.out.println("--------------------------------");
        
        String bloqueTexto = """
                             Soy Victor Mena Flores
                             mido %.2f y peso %.2f
                             
                             tu IMC es %.3f
                             """.formatted(estatura, peso, imc); //Para mostrar los datos de las variables hay que indicar en el bloque %f, y despues .formatted
        System.out.println("");
        System.out.println(bloqueTexto);
        
        boolean pesoInferior18 = imc < 18.5;
        
        // Si el peso es menor que 18.5, muestra "peso inferior al normal"
        // Dentro del if hay que poner una condicion (Expresion lógica)
        
        if (pesoInferior18 == true) {
            System.out.println("El peso es inferior a 18.5");
        }
        
        // No hace falta poner la condicion boolean, se hace directamente
        
        if (imc<18.5) {
        
            System.out.println("El imc es inferior a 18.5");
        }
        
        
        
        if (imc > 18.5 && imc <=25) {
        
            System.out.println("El imc es normal");
        }
    }
    
}
