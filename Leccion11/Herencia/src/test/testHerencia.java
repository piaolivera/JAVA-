package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

/**
 *
 * @author Pia Olivera
 */
public class testHerencia {
    public static void main(String[] args) {
//        Empleado empleado1 = new Empleado("Juan", 5000.0);
//        System.out.println("empleado1 = " + empleado1);
            
            var fecha= new Date();
        
          Cliente cliente1 = new Cliente(true,fecha,"Juan", 'M',28, "Reconquista 891");
          System.out.println(cliente1.toString());
    }
}
