/*
 * @author Pia Olivera
 */
public class OperadoresRelacionales {

    public static void main(String[] args) {
        /*
        OPERADORES RELACIONALES, NOS INDICAN SI UN VALOR
        ES IGUAL O MENOR/MAYOR A OTRO VALOR
         */
        var a = 3;
        var b = 2;
        var g = a > b;
        var h = a >= b;
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        if (a % 2 == 0) {
            System.out.println("Es un numero par");
        } else {
            System.out.println("Es un numero impar");
        }

        var edad = 30;
        var adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        
        
        
        
        

    }
}
