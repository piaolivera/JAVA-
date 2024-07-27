package ar.com.facturas.ventas.test;

import ar.com.facturas.ventas.*;

/**
 * @author Pia Olivera
 */
public class ventasTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jorge Reyes");
        Producto producto1 = new Producto("Camisa", 50000);
        Producto producto2 = new Producto("Pantalon", 65000);
        
        Factura factura1 = new Factura(cliente1);
        factura1.agregarProducto(producto1);
        factura1.agregarProducto(producto2);
        factura1.calcularTotal();
        factura1.mostrarFactura();
        
    }
 
}
