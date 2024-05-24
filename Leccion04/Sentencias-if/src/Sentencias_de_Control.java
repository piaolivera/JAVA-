
import java.util.Scanner;

/*
 *
 * @author Pia Olivera
 */
public class Sentencias_de_Control {
    public static void main(String[] args) {
        var condicion = false;
        
        if(condicion){
            System.out.println("Condicion verdadera");
        }
        else{
            System.out.println("Condicion falsa");
        }
        
        var numero = 3;
        var numeroTexto = "Numero desconocido";
        
        if (numero ==1){
           numeroTexto = "Numero uno";
        }
        else if (numero ==2){
            numeroTexto = "Numero dos";
        }
        else if (numero ==3){
            numeroTexto = "Numero tres";
        }
        else if (numero == 4){
            numeroTexto = "Numero cuatro";
        }
        else{
            numeroTexto = "Numero no encontrado";
        }
        
        System.out.println(numeroTexto);
        
        
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese un mes del año en numero: ");
        var mes = Integer.parseInt(scanner.nextLine());
        var estacion = "Desconocida";
        
        if (mes == 12 || mes ==1 || mes ==2 ){
            estacion = "Verano";
        }
        else if (mes ==3 || mes == 4 || mes ==5){
            estacion = "Otoño";
        }
        else if (mes == 6 || mes == 7 || mes ==8){
            estacion = "Invierno";
        }
        else if (mes == 9 || mes == 10 || mes ==11){
            estacion = "Primavera";
        }
        else {
            estacion = "estacion no encontrada";
        }
        
        System.out.println("estacion = " + estacion);
        
        
        
        
        
        }
        
        
    }

