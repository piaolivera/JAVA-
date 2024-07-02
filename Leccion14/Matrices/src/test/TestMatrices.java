package test;

import domain.Persona;

/**
 * @author Pia Olivera
 */
public class TestMatrices {
    public static void main(String[] args) {
        int edades[][]= new int[3][2];
        System.out.println("edades = " + edades);
        
        edades[0][0] = 5;
        edades[0][1]=7;
        edades[1][0]= 8;
        edades[1][1]=4;
        
//        System.out.println("edades 0-0= " + edades[0][0]);
 
        for (int ren = 0; ren < edades.length; ren++) {
            for (int col = 0; col < edades[ren].length; col++) {
                System.out.println("edades "+ ren +"-"+col+": "+edades[ren][col]);
            }
        }
        
        String frutas[][]= {{"Naranja", "Limon"}, {"Frutilla", "Pera", "Mora"}};
        for (int fila = 0; fila < frutas.length; fila++) {
            for (int col = 0; col < frutas[fila].length; col++) {
                System.out.println("frutas "+ fila +"-"+col+": "+frutas[fila][col]);
            }
        }
        
        Persona personas[][]=new Persona[2][3];
        personas[0][0]= new Persona("Juan");
        personas[0][1] = new Persona ("Carla");
        imprimir(frutas);
        imprimir(personas);
//        for (int fila = 0; fila < personas.length; fila++) {
//            for (int col = 0; col < personas[fila].length; col++) {
//                System.out.println("Personas "+ fila +"-"+col+": "+personas[fila][col]);
 //           }
  //      }
        }
        public static void imprimir(Object matriz[][]){
            for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.println("Personas "+ fila +"-"+col+": "+matriz[fila][col]);
        }
    }

        }
}