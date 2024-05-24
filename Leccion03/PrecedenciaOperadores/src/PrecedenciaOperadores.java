
import java.util.Scanner;

/*
 * @author Pia Olivera
 */
public class PrecedenciaOperadores {

    public static void main(String[] args) {
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        var resultado = 4 + 5 * 6 / 3;
        System.out.println("resultado = " + resultado);

        resultado = (4 + 5) * 6 / 3;
        System.out.println("resultado = " + resultado);

        /*
         double Longitud = 3, Ancho = 5.5;
        double area = Longitud * Ancho;
        System.out.println("El area del rectangulo es: "+area);
        
        double Perimetro = 2 * (Longitud * Ancho);
        System.out.println("Perimetro  del rectangulo= " + Perimetro);
         */
        Scanner consola = new Scanner(System.in);

        System.out.println("Escriba el alto del rectangulo: ");
        int alto = Integer.parseInt(consola.nextLine());
        System.out.println("Escba el ancho del rectangulo: ");
        int ancho = Integer.parseInt(consola.nextLine());

        int Area = alto * ancho;
        System.out.println("Area del rectangulo: " + Area);

        int Perimetro = 2 * (alto * ancho);
        System.out.println("Perimetro del rectangulo: " + Perimetro);

        System.out.println("Escibe el primer valor: ");
        int valorA = Integer.parseInt(consola.nextLine());
        System.out.println("Escriba el segundo valor:");
        int valorB = Integer.parseInt(consola.nextLine());

        if (valorA > valorB) {
            System.out.println("El primer valor es mayor");
        } else {
            System.out.println("El segundo valor es mayor ");
        }

    }
}
