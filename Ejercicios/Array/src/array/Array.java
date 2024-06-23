package array;

/**
 *
 * @author Pia Olivera
 */
public class Array {
    public static void main(String[] args) {
        /*
        Crea un array que contenga los numeros del 1 al 100 y muestralos en pantalla
        */
        int numeros[] = new int[100];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i +1;
          System.out.println("i "+i + ": " +numeros[i]);  
        }
        
    }
    
}
