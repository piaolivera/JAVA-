package Laboratorio;

/**
 *
 * @author Pia Olivera
 */
public class Caja {

    int alto;
    int profundo;
    int ancho;

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    public Caja(){
        System.out.println("Se esta ejecutando");
    }
    
    public int calcularVolumen() {
        int volumen = this.ancho * this.alto * this.profundo;
        System.out.println("El volumen de la caja es: " + volumen);
        return volumen;

    }

}
