package ar.com.facturas.ventas;
/**
 * @author Pia Olivera
 */
public class Cliente {
    private int idCliente;
    private String nombre;
    private static int contadorClientes;
    
    public Cliente(){
        this.idCliente = ++Cliente.contadorClientes;
    }
    public Cliente (String nombre){
        this();
        this.nombre = nombre;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + '}';
    }
    
}
