/*
 * @author Pia Olivera
 */
public class OperadorTernario {
    public static void main(String[] args) {
        var resultado = (1 > 2) ? "verdadero" : "falso" ;
        System.out.println("resultado = " + resultado);
        
        
        
        var numero = 3;
        resultado = (numero % 2 == 0) ? "Es un numero par" : "Es un numero impar";
        System.out.println("resultado = " + resultado);
        
    }
}
