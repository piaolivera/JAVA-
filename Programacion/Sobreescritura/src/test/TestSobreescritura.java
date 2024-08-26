
package test;

import domain.Gerente;

/**
 * @author Pia Olivera
 */
public class TestSobreescritura {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente ("Juan", 5000, " Sistemas");
        System.out.println("gerente1 = "+gerente1.obtenerDetalles() );
        gerente1.obtenerDetalles();
    }
}
