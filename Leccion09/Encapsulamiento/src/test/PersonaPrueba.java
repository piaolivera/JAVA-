package test;

import dominio.Persona;

/**
 *
 * @author Pia Olivera
 */
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 5000, false);
        persona1.setNombre("Juan Carlos");
        
        System.out.println("Persona1 nombre: "+persona1.getNombre());
        System.out.println("Persona1 sueldo: "+persona1.getSueldo());
        System.out.println("persona1 eliminado: "+ persona1.isEliminado());
        
        System.out.println("\n");
        Persona persona2 = new Persona("Maria",4599.99, false);
        System.out.println("persona2 nombre = "+persona2.getNombre());
        
        persona2.setNombre("Laura");
        persona2.setSueldo(6999);
        persona2.setEliminado(true);
        System.out.println("Persona2 nombre: "+persona2.getNombre());
        System.out.println("Persona2 sueldo: "+persona2.getSueldo());
        System.out.println("persona2 eliminado: "+ persona2.isEliminado());
        
        System.out.println("\tPersona1: "+persona2.toString());
        System.out.println("\tPersona2: "+persona1.toString());
       
        
        
        
    }
}
