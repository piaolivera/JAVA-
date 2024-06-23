
import java.util.Scanner;

/**
 * @author Pia Olivera
 */
public class Principal {
    public static void main(String[] args) {
        int array[] =new int[5];
        int mayor = array[0];
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese los cinco numeros:");
        for (int i = 0; i < array.length; i++) {
            
            array[i] = entrada.nextInt();
            if(array[i]> mayor)
                mayor = array[i];
         
        }
        System.out.println("El elemento mas grande es: "+mayor);
        
    }
  
}
