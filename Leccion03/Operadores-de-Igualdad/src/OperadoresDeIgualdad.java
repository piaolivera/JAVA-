/*
 * @author Pia Olivera
 */
public class OperadoresDeIgualdad {
    public static void main(String[] args) {
        var a = 3;
        var b = 2;
        
        var c = (a == b);
        System.out.println("c = " + c);
        
        var d = a !=b;
        System.out.println("d = " + d);
        
        var cadena = "hola";
        var cadena2 = "adios";
        var e = cadena == cadena2; // se compara referencia de objetos
        System.out.println("e = " + e);
        
        var f = cadena.equals(cadena2); // equals es para ver si las dos cadenas tienen el mismo contenido
        System.out.println("f = " + f);
        
        
    }
}
