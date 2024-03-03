package src;
/**
 * Clase Persona que representa a una persona y calcula los años que le quedan para jubilarse.
 *
 * @author Gerardo
 * @version 1.0
 * @since 2024
 */
public class Persona {
    private int edadActual;

    /**
     * Constructor para la clase Persona.
     *
     * @param edadActual La edad actual de la persona.
     */
    public Persona(int edadActual) {
        this.edadActual = edadActual;
    }

    /**
     * Este método calcula los años que le quedan a la persona para jubilarse.
     * Imprime un mensaje diferente dependiendo de los años restantes.
     * 
     * @return void
     */
    public void calcularAnosHastaJubilacion() {
    		// Código del método
        int anosRestantes = 67 - this.edadActual;
        if (anosRestantes < 10) {
            System.out.println("Sólo te quedan " + anosRestantes + " años. ¡Vamos que ya queda poco!");
        } else if (anosRestantes > 20) {
            System.out.println("Te quedan " + anosRestantes + " años. ¡A seguir trabajando gandul!");
        } else {
            System.out.println("Te quedan " + anosRestantes + " años hasta la jubilación.");
        }
    }
}