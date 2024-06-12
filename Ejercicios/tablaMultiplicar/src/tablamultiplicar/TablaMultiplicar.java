package tablamultiplicar;

import java.util.Scanner;

/**
 *
 * @author Pia Olivera
 */
public class TablaMultiplicar {
    
    public static String  multiplicar (int n1, int n2){
        return n1 +" * " + n2 +" = "+ (n1 * n2);
    }
    public static void main(String[] args) {
        /*
        Programa que calcue la tabla de multiplicar de cualquier numero
        entero dado por el usuario. Desde el 0 hasta el 12.
        */
        Scanner scaner = new Scanner (System.in);
        
        int n;
        System.out.println("Ingrese el numero entero del que quiere la tabla de multiplicar: ");
        n = scaner.nextInt();
        
        for (int i =0; i<=12; i++){
            System.out.println(multiplicar(n, i));
        }
    }
    
}
