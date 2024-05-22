
import java.util.Scanner;

/*
 * @author Pia Olivera
 */
public class Tipo_primitivo {
    public static void main(String[] args) {
        // TIPO PRIMITIVO BOOLEANO
        
        boolean varBoolean = false;
        System.out.println("varBoolean = " + varBoolean);
        
        if (varBoolean){
            System.out.println("La bandera es verdadera");
        }
        else{
            System.out.println("La bandera es falsa");
        }
        
    
    /*
    var edad = 10;
    var esAdulto = edad >= 18;
    if(esAdulto){
        System.out.println("Eres mayor de edad");
    }
    else{
        System.out.println("Eres menor de edad");
    }*/

    //CONVERSIONES DE TIPO
        //Convertimos un tipo String en un tipo int
//        var edad = Integer.parseInt("20");
//        System.out.println("edad= "+(edad +1));
//        
//        var valorPI = Double.parseDouble("3.1416");
//        System.out.println("valorPI = " + valorPI);
//        
//        //Pedir un valor
        Scanner scanner = new Scanner(System.in);
//        var consola = new Scanner(System.in);
//        System.out.println("Proporciona tu edad:");
//        edad = Integer.parseInt(consola.nextLine() );
//        System.out.println("edad = " + edad);
        
        //Convertimos un tipo int en un String con VALUEOF
//        var edadTexto = String.valueOf(10);
//        System.out.println("edadTexto = " + edadTexto);
//        
//        var caracter = "hola".charAt(0);
//        System.out.println("caracter = " + caracter);
//        
//        System.out.println("Proporciona un caracter: ");
//        caracter =consola.nextLine().charAt(0);
//        System.out.println("caracter = " + caracter);

//        var envio = false;
//        System.out.println("Escribe el nombre del libro: ");
//        var libro = consola.nextLine();
//        System.out.println("Escribe el id del libro: ");
//        var id = consola.nextLine();
//        System.out.println("Escribe el precio: ");
//        var precio= consola.nextLine();
//        System.out.println("Libro: "+libro +" id: "+id +" precio: $"+precio);
//        if (envio){
//            System.out.println("El envio es gratuito");
//        }
//        else{
//            System.out.println("El envio no es gratuito");
//        }
        String nombre = scanner.nextLine();
        System.out.println("Proporciona el id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el precio:");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());
 
        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
    }
        
    }
    