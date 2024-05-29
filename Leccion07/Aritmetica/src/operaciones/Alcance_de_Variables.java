package operaciones;

/**
 *
 * @author Pia Olivera
 */
public class Alcance_de_Variables {
    public static void main(String[] args) {
        // variables locales
        var a = 10; // se pueden usar solo en el metodo que se creo
        var b =2;
        
    }
    public void MiMetodo(){
        //a =10; NO SE PUEDE USAR EN OTRO MÉTODO LAS VARIABLES LOCALES
        System.out.println("Otro método");
    }
}
