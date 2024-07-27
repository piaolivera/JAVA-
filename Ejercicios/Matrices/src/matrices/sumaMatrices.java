package matrices;

import java.util.Scanner;

/**
 * @author Pia Olivera
 */
public class sumaMatrices {
    public static void main(String[] args) {
        /*
        Crea un programa que lea dos matrices de tamaño 𝑚 × 𝑛 y calcule su suma.
        El resultado debe ser una nueva matriz que se imprime en la consola.
        */
        int m =2;
        int n =2;
        Scanner entrada = new Scanner (System.in);
        int matriz1[][] = new int [m][n];
        int matriz2[][]= new int [m][n];
        int suma[][] =new int[m][n];
        
        System.out.println("Ingrese los valores de la matriz 1: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                System.out.println("Elemento ["+i+"]["+j+"]: ");  
                matriz1[i][j] = entrada.nextInt();
            }
        }
            
            //Segunda matriz
            System.out.println("Ingrese los valores para la segunda matriz: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println("Elemento ["+i+"]["+j+"]: "); 
                    matriz2[i][j] =entrada.nextInt();
        }
    }
            //Calculo de la suma de matrices
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    suma[i][j] = matriz1[i][j] + matriz2[i][j];
                }
            
            }
            
            //Impresión de la matriz
            System.out.println("La tercera matriz se conforma: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println(suma[i][j]+" ");
                }
                System.out.println();
        }
 
}
    }
