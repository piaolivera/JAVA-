
import java.util.Scanner;

/*
 * @author Pia Olivera
 */
public class SentenciaSwitch {
    public static void main(String[] args) {
        var numero = 3;
        var numeroTexto = "Valor desconocido";
        
        switch(numero){
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
        
        var mes = 2;
        var estacion = "Estacion desconocida";
        
        switch(mes){
            case 12: case 1: case 2:
                estacion = "Verano";
                break;
            case 3: case 4: case 5:
                estacion ="Otonio";
                break;
            case 6: case 7: case 8:
                estacion = "Invierno";
                break;
            case 9: case 10: case 11:
                estacion ="Primavera";
                break;
            default:
                estacion = "Estacion Inexistente";
                
               }
        System.out.println("estacion = " + estacion);
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese una nota:");
        var nota = Integer.parseInt(scanner.nextLine());
        var calificacion = "valor Desconocido";
        
        if (nota >= 0 && nota <6){
            calificacion = "F";
        }
        else if ( nota>= 6 && nota <7){
            calificacion = "D";
        }
        else if (nota >= 7 && nota <8){
            calificacion = "C";
        }
        else if(nota >=8 && nota <9){
            calificacion = "B";
        }
        else if (nota >=9 && nota <=10){
            calificacion = "A";
         }
        else {
            calificacion = "Calificacion no encontrada";
        }
        System.out.println("calificacion = " + calificacion);
        
        
    
 
}
}