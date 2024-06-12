
package iva;

import java.util.Scanner;

/**
 *
 * @author Pia Olivera
 */
public class IVA {
    
    public static double calcularIVA(double precioCompra) {
        return (precioCompra ) + (precioCompra * 0.19);
}
    public static void main(String[] args) {
       //PROGRAMA QUE CALCULE EL IVA EN UNA COMPRA, SIENDO EL IVA DEL 19%
       //SOBRE EL VALOR TOTAL DE LA COMPRA
       
       Scanner scanner = new Scanner (System.in);
       double compra, precioFinal;
       
        System.out.println("Indique el precio total de la compra: ");
        compra = scanner.nextDouble();
        
        precioFinal = calcularIVA (compra);
        
        
        System.out.println("Precio de la compra sin Iva: $" +compra);
        System.out.println("El precio final con IVA incluido es de : $"+precioFinal);
        
       
    }
    
}
