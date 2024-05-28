package clases;

/**
 *
 * @author Pia Olivera
 */
public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona();
        persona2.nombre = "Carlos";
        persona2.apellido = "Bustamante";
        
        persona2.desplegarInformacion();
    }
}
