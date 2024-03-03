package src;

import java.util.Scanner;
/**
 * Clase Main que contiene el método principal del programa.
 *
 * @author Gerardo
 * @version 1.0
 * @since 2024
 */
public class Main {
    /**
     * Método principal que se ejecuta al iniciar el programa.
     * Crea una instancia de la clase Persona y llama al método calcularAnosHastaJubilacion.
     *
     * @param args Argumentos de la línea de comandos.
     * @throws Exception Si ocurre algún error durante la ejecución.
     */
    public static void main(String[] args) {
    		// Código del método 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce tu edad actual:");
        int edadActual = scanner.nextInt();
        Persona persona = new Persona(edadActual);
        persona.calcularAnosHastaJubilacion();
        scanner.close();
    }
}