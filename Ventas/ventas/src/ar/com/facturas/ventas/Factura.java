package ar.com.facturas.ventas;

//import ar.com.ventas.*;

/**
 * @author Pia Olivera
 */
public class Factura {
   private int idFactura;
   private Cliente cliente;
   private static final int MAX_PRODUCTOS =10;
   private Producto productos[];
   private int contadorProductos;
   private static int contadorFacturas;
   
   public Factura(Cliente cliente){
       this.idFactura = ++Factura.contadorFacturas;
       this.cliente = cliente;
       this.productos = new Producto[Factura.MAX_PRODUCTOS];
   }
   public void agregarProducto(Producto producto){
       if(this.contadorFacturas< Factura.MAX_PRODUCTOS){
           this.productos[this.contadorProductos++]= producto;
       }
       else{
           System.out.println("Se ha superado el maximo de productos"+ Factura.MAX_PRODUCTOS);
       }
   }
   public double calcularTotal(){
       double total =0;
       for (int i = 0; i < this.contadorProductos; i++) {
           total += this.productos[i].getPrecio();
       }
       return total;
   }
   
   public void mostrarFactura(){
        System.out.println("Id factura: "+this.idFactura);
        System.out.println("Cliente: "+this.cliente.getNombre());
        double totalFactura = this.calcularTotal();
        System.out.println("El total de la factura es: $"+totalFactura);
        System.out.println("Productos de la facutura: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
           
       }
   }
   
   
   
}
