package metodos;

import java.util.Scanner;

/**
 * @author Pia Olivera
 */
public class NumerosImpares {
   int numeros[];
   int contadorImpares;
   
   public NumerosImpares(){
       this.numeros = new int[5];
       this.contadorImpares=0;
   }
   public void SumaNumerosImpares(){
       Scanner entrada = new Scanner (System.in);
       for (int i = 0; i < numeros.length; i++) {
           System.out.println("Ingrese el numero "+(i+1)+ ": ");
           numeros[i]= entrada.nextInt();
           int numero = numeros[i];
       }
   }
   public int numerosImpares(){
       for (int i = 0; i < numeros.length; i++) {
           int numero = numeros[i];
           if (numero % 2 !=0)
               contadorImpares++;          
       }
    
         return contadorImpares;  
       }
   public void MostrarNumerosImpares(){
            for (int i = 0; i < numeros.length; i++) {
               if (numeros[i] % 2 != 0) {
            System.out.println(numeros[i]);  
               }
            }
            
}
    public static void main(String[] args) {
        NumerosImpares numeros = new NumerosImpares();
        numeros.SumaNumerosImpares();
        numeros.numerosImpares();
        System.out.println("La cantidad de numeros impares es de : "+numeros.contadorImpares +"\n ");
        numeros.MostrarNumerosImpares();
    }
   }

