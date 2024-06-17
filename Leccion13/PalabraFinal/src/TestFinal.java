
import domain.Persona;

/**
 * @author Pia Olivera
 */
public class TestFinal {
    public static void main(String[] args) {
        final int miVariable =10;
        System.out.println("miVariable = " + miVariable);
        
        
        
        System.out.println("Mi constante: "+Persona.MI_CONSTANTE);
        
        
        final Persona persona1 = new Persona(); // no se le puede asignar otro objeto
        persona1.setNombre("Juan"); // si se puede modificar el nombre
        System.out.println("Persona1 nombre" +persona1.getNombre());
    }
    
    
}
