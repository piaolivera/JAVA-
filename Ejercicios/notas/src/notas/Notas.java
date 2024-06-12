
package notas;

import java.util.Scanner;

/**
 *
 * @author Pia Olivera
 */
public class Notas {

    
    public static double calcularNotaFinal(double n1, double n2, double n3){
        return (n1*0.3) + (n2 * 0.3) + ( n3 * 0.4);
    }
    public static void main(String[] args) {
        /*
        Programa que toma las tres notas de un estudiante y diga la nota final
        del curso. Tenga en cuenta que la primera y segunda nota vale el 30% de
        la nota final y la tercera nota vale el 40%
        */
        Scanner lector = new Scanner(System.in);
        
        double n1, n2, n3, notaFinal;
        
        System.out.println("Ingrese la primer nota: ");
        n1 = lector.nextDouble();
        System.out.println("Ingrese la segunda nota: ");
        n2 = lector.nextDouble();
        System.out.println("Ingrese la tercer nota: ");
        n3 = lector.nextDouble();
        
        notaFinal = calcularNotaFinal(n1,n2,n3);
        System.out.println("notaFinal = " + notaFinal);
    }
    
}
