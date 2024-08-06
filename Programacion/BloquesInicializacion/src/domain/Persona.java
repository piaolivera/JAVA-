package domain;
/**
 * @author Pia Olivera
 */
public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static {
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
        
    }
    {
        System.out.println("Ejecucion bloque NO estatico");
        this.idPersona = Persona.contadorPersonas;
    }
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return this.idPersona;
    }
    
    
}
