package ar.com.facturas.ventas;
/**
 * @author Pia Olivera
 */
public class Producto {
    private static int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    public Producto(){
        this.idProducto =++Producto.contadorProductos;
    }
    public Producto (String nombre, double precio){
        this();
        this.nombre = nombre;
        this.precio =precio;
    }

    public static int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
}
