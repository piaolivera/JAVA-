
package test;

import domain.*;


/**
 * @author Pia Olivera
 */
public class TestInstanceOf {
    public static void main(String[] args) {
//        Gerente gerente1 = new Gerente ("Juan", 5000, " Sistemas");
//        System.out.println("gerente1 = "+gerente1.obtenerDetalles() );

          Empleado empleado1 = new Empleado("Jose", 1500);
//         
          determinarTipo(empleado1);
          
//          Gerente gerente2 = new Gerente ("Carla", 3000, "Contabilidad");
//        
            
          

        
    }
    
    public static void determinarTipo(Empleado empleado){
        if (empleado instanceof Gerente){
            System.out.println("Es de tipo gerente");
        }
        else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
        }
    }
}
