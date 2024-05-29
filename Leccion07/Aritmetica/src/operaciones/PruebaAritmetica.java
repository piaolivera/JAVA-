package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
//        aritmetica1.a = 3;
//        aritmetica1.b = 2;
//        aritmetica1.sumar();
//        
//        int resultado = aritmetica1.sumarConRetorno();
//        System.out.println("resultado desde la prueba = " + resultado);
//        
//        resultado = aritmetica1.sumarConArgumentos(5, 8);
//        System.out.println("resultado usando Argumentos= " + resultado);
           
            System.out.println("aritmentica1: " +aritmetica1.a);
            System.out.println("aritmetica1 = " + aritmetica1.b);
            
            Aritmetica aritmetica2 = new Aritmetica (5,8);
             System.out.println("aritmentica2: " +aritmetica2.a);
            System.out.println("aritmetica2 = " + aritmetica2.b);
            
        
     
    }
}
