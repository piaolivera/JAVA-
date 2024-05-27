/*
 * @author Pia Olivera
 */
public class Ciclos {
    public static void main(String[] args) {
        //WHILE
        var contador = 0;
        
        while (contador < 3){
            System.out.println("contador = " + contador);
            contador ++;
        }
        
        
        //DO WHILE
        var cont = 0;
        do{
            System.out.println("contador do while: "+cont);
            cont++;
        } while (cont <3);
        
        //FOR    
        for(var i= 0; i<3; i++){
            System.out.println("i = " + i);
        }
        
        //break 
        for(var i= 0; i<3; i++){
            if (i %2 ==0){
            System.out.println("i par con break = " + i);
            break; // se rompe el ciclo y se imprime el primer numero par -
            }
        }
        
        //continue
        for(var i= 0; i<3; i++){
            if (i %2 !=0){ 
            continue; // si no es numero par, continua a la siguiente interaccion. -
            }
            System.out.println("i par con continue= " + i);
        }
        
        
    }
}
