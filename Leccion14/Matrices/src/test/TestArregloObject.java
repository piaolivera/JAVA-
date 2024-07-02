package test;

import domain.Persona;

/**
 *
 * @author Pia Olivera
 */
public class TestArregloObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        
        personas[0] = new Persona("Juan");
        personas[1] = new Persona ("Carla");
        System.out.println("Persona 0: " +personas[0]);
        System.out.println("Persona 1: "+personas[1]);
        
        
        for (int i =0; i <personas.length; i++){
            System.out.println("i "+i +" = " +personas[i]);
        }
        
        
        String frutas []= {"Naranja", "Platano", "Banana", "Uva"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Frutas i "+i +" = "+frutas[i]);
        }
    }
}
