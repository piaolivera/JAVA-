/*
 * @author Pia Olivera
 */
public class Concatenacion {

    public static void main(String[] args) {
        var usuario = "Juan";
        var titulo = " Ingeniero";

        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        
        System.out.println(i + j); // aquí se realiza la suma de números
        System.out.println(i + j+ usuario);// de izquiera a derecha se evalua las expresiones
        System.out.println(usuario + i+ j);
    }
}
