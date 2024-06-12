package incrementodesalario;

import java.util.Scanner;

/**
 *
 * @author Pia Olivera
 */
public class IncrementoDeSalario {
    public static double NuevoSalario(double salario, int porcentaje){
        double incremento = (salario * porcentaje) /100;
        double salarioFinal = salario + incremento;
        return salarioFinal;
    }
    public static void main(String[] args) {
        /*
        Programa que calcule el nuevo salario de in trabajador
        si obtuvo un incremento del x%
        */
        Scanner entrada = new Scanner (System.in);
        double salario, salarioFinal;
        int porcentaje;
        System.out.println("Ingrese su salario: $");
        salario = entrada.nextDouble();
        System.out.println("Ingrese el porcentaja de aumento: ");
        porcentaje = entrada.nextInt();
        
        salarioFinal= NuevoSalario(salario,porcentaje);
        
        System.out.println("El salario con aumento es de: $" +salarioFinal);
        
        
    }
    
}
