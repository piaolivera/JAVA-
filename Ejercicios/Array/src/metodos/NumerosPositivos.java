package metodos;

import java.util.Scanner;

/**
 * @author Pia Olivera
 */
public class NumerosPositivos {
   //Crear un programa que nos pida capturar números positivos.
    //calcular el promedio de esos numeros
    int numeros[];
    int CantidadPositivos;
    int sumaPositivos;
    
    public NumerosPositivos(){
        this.numeros= new int [5];
        this.CantidadPositivos = 0;
        this.sumaPositivos =0;
    }
    public void IngresarNumeros(){
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa el numero "+(i +1) +": ");
            numeros[i] =entrada.nextInt();
            
        }
    }
    public void numerosPositivos(){
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            if (numero >0){
                sumaPositivos+= numero;
                CantidadPositivos++;
                     }     
            } 
    }
    public double Promedio(){
        if (CantidadPositivos ==0){
            return 0;
        }
          return (sumaPositivos * 1.0) / CantidadPositivos;    
    }
    public static void main(String[] args) {
        NumerosPositivos n1 = new NumerosPositivos();
        n1.IngresarNumeros();
        n1.numerosPositivos();
        System.out.println("Los numeros positivos son: "+n1.CantidadPositivos);
        n1.Promedio();
        System.out.println("El promedio de numero positivo es: "+n1.Promedio());
    }
}
