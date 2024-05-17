/*
 * @author Pia Olivera
 */
public class variables {
    public static void main(String[] args) {
        int miVariableEntera= 10;
        System.out.println(miVariableEntera);
        
        //Modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println("miVariableEntera = " + miVariableEntera);
        
        String miVariableCadena = "Saludos desde Java";
        System.out.println("miVariableCadena = " + miVariableCadena);
        
        miVariableCadena = "Nos despedimos desde JAVA";
        System.out.println("miVariableCadena = " + miVariableCadena);
        
        
        //var = inferencia de tipos en Java
        var miVariableEntera2 =15;
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        
        var miVaribaleCadena2 = "Saludos";
        System.out.println("miVaribaleCadena2 = " + miVaribaleCadena2);
        
        
    }
}
