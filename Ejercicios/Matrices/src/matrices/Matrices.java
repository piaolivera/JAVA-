package matrices;

import java.util.Scanner;

/**  @author Pia Olivera  */
public class Matrices {
    public static void main(String[] args) {
        Double matriz[][] = new Double[4][4];     
        Scanner entrada = new Scanner(System.in);
        Double suma =0.0;
        
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length-1; col++) {
                System.out.println("Ingrese el alumno n." +fila);
                matriz[fila][col] = entrada.nextDouble();
                suma = suma +matriz[fila][col];
            }
            matriz[fila][3]=suma /3;
            suma= 0.0;
            
        }
                                            
        for (int fila = 0; fila < matriz.length; fila++) {
            System.out.println("Las notas del alumno n."+fila +"son: ");
            for (int col = 0; col < matriz[fila].length-1; col++) {
                System.out.println("Nota n." +col+" " + matriz[fila][col]);
                
                
            }
            System.out.println("El promedio de las notas es: "+matriz[fila][3]);
    
    
    
    }
}
}