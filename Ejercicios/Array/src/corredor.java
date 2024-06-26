
import java.util.Scanner;

/**
 * @author Pia Olivera
 */
public class corredor {
    public double promedio(int suma, int vueltas[]){
        return (suma *1.0) / vueltas.length;
    }
    public static void main(String[] args) {
        /* Un corredor registra 5 vueltas . La maquina informa cuantas 
        vueltas superan el promedio.*/
        int vueltas [] = new int[5];
        Scanner entrada = new Scanner (System.in);
        int suma =0;
        for (int i = 0; i < vueltas.length; i++) {
            System.out.println("Ingrese la vuelta "+(i +1) +" : ");
            vueltas[i] = entrada.nextInt();
            int vuelta = vueltas[i];     
            suma += vueltas[i];
        }
        System.out.println("La suma de las vueltas es de : "+suma);
        
        corredor corredor = new corredor();
        double promedio = corredor.promedio(suma, vueltas);
        System.out.println("El promedio es de: " +promedio);
        
        int vueltasMayoresProm =0;
        
        
        for (int i = 0; i < vueltas.length; i++) {
            int vuelta = vueltas[i];
             if (vueltas[i] > promedio){
            vueltasMayoresProm ++;
        }
        }
       
        System.out.println("Hay "+vueltasMayoresProm +" mayores al promedio "+promedio);
        
        
        
    }
}
