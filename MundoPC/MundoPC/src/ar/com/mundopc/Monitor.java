package ar.com.mundopc;
/**
 *
 * @author Pia Olivera
 */
public class Monitor {
    private final int idMonitr;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;
    
    private Monitor(){
        this.idMonitr = ++Monitor.contadorMonitores;
    }
    public Monitor( String marca, double tamanio){
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }
    public int getIdMonitor(){
        return this.idMonitr;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitr=" + idMonitr + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }
    
}
