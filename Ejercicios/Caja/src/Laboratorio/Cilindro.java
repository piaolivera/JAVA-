package Laboratorio;

/**
 *
 * @author Pia Olivera
 */
public class Cilindro {
    double radio;
    double altura;
    
    public Cilindro(double radio, double altura){
        this.radio = radio;
        this.altura = altura;
    }
    public Cilindro(){
        this.radio = 1.0;
        this.altura = 1.0;
    }
    public double CalcularVolumen(){
        double volumen = Math.PI * Math.pow(this.radio, 2) * this.altura;
        System.out.println("volumen = " + volumen);
        return volumen;
        
    }
}
