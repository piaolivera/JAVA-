
package test;

import domain.*;


/**
 * @author Pia Olivera
 */
public class TestSobreescritura {
    public static void main(String[] args) {
//        Gerente gerente1 = new Gerente ("Juan", 5000, " Sistemas");
//        System.out.println("gerente1 = "+gerente1.obtenerDetalles() );

          Empleado empleado1 = new Empleado("Jose", 1500);
//          System.out.println("empleado1 = " + empleado1.obtenerDetalles());
          imprimir(empleado1);
          
          Gerente gerente2 = new Gerente ("Carla", 3000, "Contabilidad");
//          System.out.println("gerente2 = " + gerente2.obtenerDetalles());

          imprimir(gerente2);

        
    }
    
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
