package metodos;

import java.util.Scanner;

/**
 * @author Pia Olivera
 */
public class CorredorConMetodos {
     /* Un corredor registra 5 vueltas . La maquina informa cuantas 
        vueltas superan el promedio.*/
    int vueltas[];
    int suma;
    
    public CorredorConMetodos(){
        this.vueltas = new int[5];
        this.suma =0;
            }


    public void RegistrarVueltas(){
        Scanner entrada = new Scanner (System.in);
        for(int i=0; i<vueltas.length; i++){
        System.out.println("Ingrese el valor de las vuelta "+ (i +1) +": ");
        vueltas[i] = entrada.nextInt();
        suma += vueltas[i];     }
                            }
    
    public double CalcularPromedio(){
        double prom = (suma *1.0)/ vueltas.length;
        return prom;
        }
    
    public int MayorQuePromedio(){
       double promedio = CalcularPromedio();
       int contador =0;
        for (int i = 0; i < vueltas.length; i++) {
            if (vueltas[i]> promedio){
                contador++;
        }
       
        } 
        return contador;
    }
    
    public static void main(String[] args){
        CorredorConMetodos corredor = new CorredorConMetodos();
        corredor.RegistrarVueltas();
        double promedio = corredor.CalcularPromedio();
        System.out.println("El promedio de la vuelta es de "+promedio);
        
        int mayorQuePromedio = corredor.MayorQuePromedio();
        System.out.println("Hay "+mayorQuePromedio +" vueltas mayor que el promedio "+promedio);
    }
}



   

    
       

    
