package domain;

import java.util.Date;

/**
 *
 * @author Pia Olivera
 */
public class Cliente extends Persona{
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorClientes;
    
    public Cliente(){
        
    }
    public Cliente (boolean vip, Date fechaRegistro, String nombre, char genero, 
            int edad, String direccion){
        super(nombre, genero, edad, direccion);
        this.vip = vip;
        this.idCliente = ++Cliente.contadorClientes;
        this.fechaRegistro = fechaRegistro;
        
    }

    public Date getFecha() {
        return fechaRegistro;
    }

    public void setFecha(Date fecha) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", vip=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
