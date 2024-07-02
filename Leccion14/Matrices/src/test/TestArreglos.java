package test;

/**
 *
 * @author Pia Olivera
 */
public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("edades = " + edades);
        
        
        edades[0] =10;
        System.out.println("edades 0 = " + edades[0]);
        
        edades[1] =5;
        edades[2] = 12;
        System.out.println("edades 1 = " + edades[1]);
        System.out.println("edades 2 = " +edades[2]);
        
        for(int i =0; i< edades.length; i++){
            System.out.println("Recorremos el arreglo: "+i +": "+edades[i]);
    }
    }
}
